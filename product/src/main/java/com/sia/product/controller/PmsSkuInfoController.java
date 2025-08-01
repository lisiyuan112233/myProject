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
import com.sia.product.domain.PmsSkuInfo;
import com.sia.product.service.IPmsSkuInfoService;
import com.sia.product.common.Result;

/**
 * sku信息Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/sku-info")
public class PmsSkuInfoController
{
    @Autowired
    private IPmsSkuInfoService pmsSkuInfoService;

    /**
     * 查询sku信息列表
     */
    @GetMapping("/list")
    public Result<List<PmsSkuInfo>> list(PmsSkuInfo pmsSkuInfo)
    {
        List<PmsSkuInfo> list = pmsSkuInfoService.selectPmsSkuInfoList(pmsSkuInfo);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取sku信息详细信息
     */
    @GetMapping(value = "/{skuId}")
    public Result<PmsSkuInfo> getInfo(@PathVariable("skuId") Long skuId)
    {
        PmsSkuInfo pmsSkuInfo = pmsSkuInfoService.selectPmsSkuInfoBySkuId(skuId);
        return pmsSkuInfo != null ? Result.success(pmsSkuInfo) : Result.error(404, "数据不存在");
    }

    /**
     * 新增sku信息
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSkuInfo pmsSkuInfo)
    {
        int rows = pmsSkuInfoService.insertPmsSkuInfo(pmsSkuInfo);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改sku信息
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSkuInfo pmsSkuInfo)
    {
        int rows = pmsSkuInfoService.updatePmsSkuInfo(pmsSkuInfo);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除sku信息
     */
    @DeleteMapping("/{skuIds}")
    public Result<Void> remove(@PathVariable Long[] skuIds)
    {
        int rows = pmsSkuInfoService.deletePmsSkuInfoBySkuIds(skuIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
