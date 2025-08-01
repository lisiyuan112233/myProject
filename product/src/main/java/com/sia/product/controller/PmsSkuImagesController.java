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
import com.sia.product.domain.PmsSkuImages;
import com.sia.product.service.IPmsSkuImagesService;
import com.sia.product.common.Result;

/**
 * sku图片Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/sku-images")
public class PmsSkuImagesController
{
    @Autowired
    private IPmsSkuImagesService pmsSkuImagesService;

    /**
     * 查询sku图片列表
     */
    @GetMapping("/list")
    public Result<List<PmsSkuImages>> list(PmsSkuImages pmsSkuImages)
    {
        List<PmsSkuImages> list = pmsSkuImagesService.selectPmsSkuImagesList(pmsSkuImages);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取sku图片详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsSkuImages> getInfo(@PathVariable("id") Long id)
    {
        PmsSkuImages pmsSkuImages = pmsSkuImagesService.selectPmsSkuImagesById(id);
        return pmsSkuImages != null ? Result.success(pmsSkuImages) : Result.error(404, "数据不存在");
    }

    /**
     * 新增sku图片
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSkuImages pmsSkuImages)
    {
        int rows = pmsSkuImagesService.insertPmsSkuImages(pmsSkuImages);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改sku图片
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSkuImages pmsSkuImages)
    {
        int rows = pmsSkuImagesService.updatePmsSkuImages(pmsSkuImages);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除sku图片
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsSkuImagesService.deletePmsSkuImagesByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
