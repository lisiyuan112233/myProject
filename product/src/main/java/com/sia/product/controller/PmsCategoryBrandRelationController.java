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
import com.sia.product.domain.PmsCategoryBrandRelation;
import com.sia.product.service.IPmsCategoryBrandRelationService;
import com.sia.product.common.Result;

/**
 * 品牌分类关联Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/category-brand-relation")
public class PmsCategoryBrandRelationController
{
    @Autowired
    private IPmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 查询品牌分类关联列表
     */
    @GetMapping("/list")
    public Result<List<PmsCategoryBrandRelation>> list(PmsCategoryBrandRelation pmsCategoryBrandRelation)
    {
        List<PmsCategoryBrandRelation> list = pmsCategoryBrandRelationService.selectPmsCategoryBrandRelationList(pmsCategoryBrandRelation);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取品牌分类关联详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsCategoryBrandRelation> getInfo(@PathVariable("id") Long id)
    {
        PmsCategoryBrandRelation pmsCategoryBrandRelation = pmsCategoryBrandRelationService.selectPmsCategoryBrandRelationById(id);
        return pmsCategoryBrandRelation != null ? Result.success(pmsCategoryBrandRelation) : Result.error(404, "数据不存在");
    }

    /**
     * 新增品牌分类关联
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation)
    {
        int rows = pmsCategoryBrandRelationService.insertPmsCategoryBrandRelation(pmsCategoryBrandRelation);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改品牌分类关联
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsCategoryBrandRelation pmsCategoryBrandRelation)
    {
        int rows = pmsCategoryBrandRelationService.updatePmsCategoryBrandRelation(pmsCategoryBrandRelation);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除品牌分类关联
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsCategoryBrandRelationService.deletePmsCategoryBrandRelationByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
