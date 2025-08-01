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
import com.sia.product.domain.PmsAttr;
import com.sia.product.service.IPmsAttrService;
import com.sia.product.common.Result;

/**
 * 商品属性Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/attr")
public class PmsAttrController
{
    @Autowired
    private IPmsAttrService pmsAttrService;

    /**
     * 查询商品属性列表
     */
    @GetMapping("/list")
    public Result<List<PmsAttr>> list(PmsAttr pmsAttr)
    {
        List<PmsAttr> list = pmsAttrService.selectPmsAttrList(pmsAttr);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取商品属性详细信息
     */
    @GetMapping(value = "/{attrId}")
    public Result<PmsAttr> getInfo(@PathVariable("attrId") Long attrId)
    {
        PmsAttr pmsAttr = pmsAttrService.selectPmsAttrByAttrId(attrId);
        return pmsAttr != null ? Result.success(pmsAttr) : Result.error(404, "数据不存在");
    }

    /**
     * 新增商品属性
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsAttr pmsAttr)
    {
        int rows = pmsAttrService.insertPmsAttr(pmsAttr);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改商品属性
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsAttr pmsAttr)
    {
        int rows = pmsAttrService.updatePmsAttr(pmsAttr);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除商品属性
     */
    @DeleteMapping("/{attrIds}")
    public Result<Void> remove(@PathVariable Long[] attrIds)
    {
        int rows = pmsAttrService.deletePmsAttrByAttrIds(attrIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
