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
import com.sia.product.domain.PmsProductAttrValue;
import com.sia.product.service.IPmsProductAttrValueService;
import com.sia.product.common.Result;

/**
 * spu属性值Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/attr-value")
public class PmsProductAttrValueController
{
    @Autowired
    private IPmsProductAttrValueService pmsProductAttrValueService;

    /**
     * 查询spu属性值列表
     */
    @GetMapping("/list")
    public Result<List<PmsProductAttrValue>> list(PmsProductAttrValue pmsProductAttrValue)
    {
        List<PmsProductAttrValue> list = pmsProductAttrValueService.selectPmsProductAttrValueList(pmsProductAttrValue);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取spu属性值详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsProductAttrValue> getInfo(@PathVariable("id") Long id)
    {
        PmsProductAttrValue pmsProductAttrValue = pmsProductAttrValueService.selectPmsProductAttrValueById(id);
        return pmsProductAttrValue != null ? Result.success(pmsProductAttrValue) : Result.error(404, "数据不存在");
    }

    /**
     * 新增spu属性值
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsProductAttrValue pmsProductAttrValue)
    {
        int rows = pmsProductAttrValueService.insertPmsProductAttrValue(pmsProductAttrValue);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改spu属性值
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsProductAttrValue pmsProductAttrValue)
    {
        int rows = pmsProductAttrValueService.updatePmsProductAttrValue(pmsProductAttrValue);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除spu属性值
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsProductAttrValueService.deletePmsProductAttrValueByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
