package com.sia.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sia.product.domain.PmsAttrGroup;
import com.sia.product.service.IPmsAttrGroupService;
import com.sia.product.common.Result;

/**
 * 属性分组Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/group")
public class PmsAttrGroupController
{
    @Autowired
    private IPmsAttrGroupService pmsAttrGroupService;

    /**
     * 查询属性分组列表
     */
    @GetMapping("/list")
    public Result<List<PmsAttrGroup>> list(PmsAttrGroup pmsAttrGroup)
    {
        List<PmsAttrGroup> list = pmsAttrGroupService.selectPmsAttrGroupList(pmsAttrGroup);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取属性分组详细信息
     */
    @GetMapping(value = "/{attrGroupId}")
    public Result<PmsAttrGroup> getInfo(@PathVariable("attrGroupId") Long attrGroupId)
    {
        PmsAttrGroup pmsAttrGroup = pmsAttrGroupService.selectPmsAttrGroupByAttrGroupId(attrGroupId);
        return pmsAttrGroup != null ? Result.success(pmsAttrGroup) : Result.error(404, "数据不存在");
    }

    /**
     * 新增属性分组
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsAttrGroup pmsAttrGroup)
    {
        int rows = pmsAttrGroupService.insertPmsAttrGroup(pmsAttrGroup);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改属性分组
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsAttrGroup pmsAttrGroup)
    {
        int rows = pmsAttrGroupService.updatePmsAttrGroup(pmsAttrGroup);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除属性分组
     */
    @DeleteMapping("/{attrGroupIds}")
    public Result<Void> remove(@PathVariable Long[] attrGroupIds)
    {
        int rows = pmsAttrGroupService.deletePmsAttrGroupByAttrGroupIds(attrGroupIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
