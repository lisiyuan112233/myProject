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
import com.sia.product.domain.PmsSpuImages;
import com.sia.product.service.IPmsSpuImagesService;
import com.sia.product.common.Result;

/**
 * spu图片Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/spu-images")
public class PmsSpuImagesController
{
    @Autowired
    private IPmsSpuImagesService pmsSpuImagesService;

    /**
     * 查询spu图片列表
     */
    @GetMapping("/list")
    public Result<List<PmsSpuImages>> list(PmsSpuImages pmsSpuImages)
    {
        List<PmsSpuImages> list = pmsSpuImagesService.selectPmsSpuImagesList(pmsSpuImages);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取spu图片详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsSpuImages> getInfo(@PathVariable("id") Long id)
    {
        PmsSpuImages pmsSpuImages = pmsSpuImagesService.selectPmsSpuImagesById(id);
        return pmsSpuImages != null ? Result.success(pmsSpuImages) : Result.error(404, "数据不存在");
    }

    /**
     * 新增spu图片
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSpuImages pmsSpuImages)
    {
        int rows = pmsSpuImagesService.insertPmsSpuImages(pmsSpuImages);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改spu图片
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSpuImages pmsSpuImages)
    {
        int rows = pmsSpuImagesService.updatePmsSpuImages(pmsSpuImages);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除spu图片
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsSpuImagesService.deletePmsSpuImagesByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
