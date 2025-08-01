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
import com.sia.product.domain.PmsSkuSaleAttrValue;
import com.sia.product.service.IPmsSkuSaleAttrValueService;
import com.sia.product.common.Result;

/**
 * sku销售属性&值Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/value")
public class PmsSkuSaleAttrValueController
{
    @Autowired
    private IPmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 查询sku销售属性&值列表
     */
    @GetMapping("/list")
    public Result<List<PmsSkuSaleAttrValue>> list(PmsSkuSaleAttrValue pmsSkuSaleAttrValue)
    {
        List<PmsSkuSaleAttrValue> list = pmsSkuSaleAttrValueService.selectPmsSkuSaleAttrValueList(pmsSkuSaleAttrValue);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取sku销售属性&值详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsSkuSaleAttrValue> getInfo(@PathVariable("id") Long id)
    {
        PmsSkuSaleAttrValue pmsSkuSaleAttrValue = pmsSkuSaleAttrValueService.selectPmsSkuSaleAttrValueById(id);
        return pmsSkuSaleAttrValue != null ? Result.success(pmsSkuSaleAttrValue) : Result.error(404, "数据不存在");
    }

    /**
     * 新增sku销售属性&值
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue)
    {
        int rows = pmsSkuSaleAttrValueService.insertPmsSkuSaleAttrValue(pmsSkuSaleAttrValue);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改sku销售属性&值
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue)
    {
        int rows = pmsSkuSaleAttrValueService.updatePmsSkuSaleAttrValue(pmsSkuSaleAttrValue);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除sku销售属性&值
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsSkuSaleAttrValueService.deletePmsSkuSaleAttrValueByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
