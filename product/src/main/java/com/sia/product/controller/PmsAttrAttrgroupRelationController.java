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
import com.sia.product.domain.PmsAttrAttrgroupRelation;
import com.sia.product.service.IPmsAttrAttrgroupRelationService;
import com.sia.product.common.Result;


/**
 * 属性&属性分组关联Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/relation")
public class PmsAttrAttrgroupRelationController
{
    @Autowired
    private IPmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    /**
     * 查询属性&属性分组关联列表
     */
    @GetMapping("/list")
    public Result<List<PmsAttrAttrgroupRelation>> list(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation)
    {
        List<PmsAttrAttrgroupRelation> list = pmsAttrAttrgroupRelationService.selectPmsAttrAttrgroupRelationList(pmsAttrAttrgroupRelation);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取属性&属性分组关联详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsAttrAttrgroupRelation> getInfo(@PathVariable("id") Long id)
    {
        PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation = pmsAttrAttrgroupRelationService.selectPmsAttrAttrgroupRelationById(id);
        return pmsAttrAttrgroupRelation != null ? Result.success(pmsAttrAttrgroupRelation) : Result.error(404, "数据不存在");
    }

    /**
     * 新增属性&属性分组关联
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation)
    {
        int rows = pmsAttrAttrgroupRelationService.insertPmsAttrAttrgroupRelation(pmsAttrAttrgroupRelation);
        // 根据返回的行数，返回相应的结果
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改属性&属性分组关联
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation)
    {
        int rows = pmsAttrAttrgroupRelationService.updatePmsAttrAttrgroupRelation(pmsAttrAttrgroupRelation);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除属性&属性分组关联
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsAttrAttrgroupRelationService.deletePmsAttrAttrgroupRelationByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
