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
import com.sia.product.domain.PmsBrand;
import com.sia.product.service.IPmsBrandService;
import com.sia.product.common.Result;

/**
 * 品牌Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/brand")
public class PmsBrandController
{
    @Autowired
    private IPmsBrandService pmsBrandService;

    /**
     * 查询品牌列表
     */
    @GetMapping("/list")
    public Result<List<PmsBrand>> list(PmsBrand pmsBrand)
    {
        List<PmsBrand> list = pmsBrandService.selectPmsBrandList(pmsBrand);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取品牌详细信息
     */
    @GetMapping(value = "/{brandId}")
    public Result<PmsBrand> getInfo(@PathVariable("brandId") Long brandId)
    {
        PmsBrand pmsBrand = pmsBrandService.selectPmsBrandByBrandId(brandId);
        return pmsBrand != null ? Result.success(pmsBrand) : Result.error(404, "数据不存在");
    }

    /**
     * 新增品牌
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsBrand pmsBrand)
    {
        int rows = pmsBrandService.insertPmsBrand(pmsBrand);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改品牌
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsBrand pmsBrand)
    {
        int rows = pmsBrandService.updatePmsBrand(pmsBrand);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除品牌
     */
    @DeleteMapping("/{brandIds}")
    public Result<Void> remove(@PathVariable Long[] brandIds)
    {
        int rows = pmsBrandService.deletePmsBrandByBrandIds(brandIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
