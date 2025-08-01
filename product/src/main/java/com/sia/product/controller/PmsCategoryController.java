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
import com.sia.product.domain.PmsCategory;
import com.sia.product.service.IPmsCategoryService;
import com.sia.product.common.Result;

/**
 * 商品三级分类Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/category")
public class PmsCategoryController
{
    @Autowired
    private IPmsCategoryService pmsCategoryService;

    /**
     * 查询商品三级分类列表
     */
    @GetMapping("/list")
    public Result<List<PmsCategory>> list(PmsCategory pmsCategory)
    {
        List<PmsCategory> list = pmsCategoryService.selectPmsCategoryList(pmsCategory);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取商品三级分类详细信息
     */
    @GetMapping(value = "/{catId}")
    public Result<PmsCategory> getInfo(@PathVariable("catId") Long catId)
    {
        PmsCategory pmsCategory = pmsCategoryService.selectPmsCategoryByCatId(catId);
        return pmsCategory != null ? Result.success(pmsCategory) : Result.error(404, "数据不存在");
    }

    /**
     * 新增商品三级分类
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsCategory pmsCategory)
    {
        int rows = pmsCategoryService.insertPmsCategory(pmsCategory);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改商品三级分类
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsCategory pmsCategory)
    {
        int rows = pmsCategoryService.updatePmsCategory(pmsCategory);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除商品三级分类
     */
    @DeleteMapping("/{catIds}")
    public Result<Void> remove(@PathVariable Long[] catIds)
    {
        int rows = pmsCategoryService.deletePmsCategoryByCatIds(catIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
