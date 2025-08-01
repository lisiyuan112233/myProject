package com.sia.coupon.controller;

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
import com.sia.coupon.domain.SkuFullReduction;
import com.sia.coupon.service.ISkuFullReductionService;
import com.sia.coupon.common.Result;

/**
 * 商品满减信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/skuFullReduction")
public class SkuFullReductionController
{
    @Autowired
    private ISkuFullReductionService skuFullReductionService;

    /**
     * 查询商品满减信息列表
     */
    @GetMapping("/list")
    public Result<List<SkuFullReduction>> list(SkuFullReduction skuFullReduction) {
        List<SkuFullReduction> list = skuFullReductionService.selectSkuFullReductionList(skuFullReduction);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取商品满减信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SkuFullReduction> getInfo(@PathVariable("id") Long id) {
        SkuFullReduction skuFullReduction = skuFullReductionService.selectSkuFullReductionById(id);
        return skuFullReduction != null ? Result.success(skuFullReduction, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增商品满减信息
     */
    @PostMapping
    public Result<Void> add(@RequestBody SkuFullReduction skuFullReduction) {
        int rows = skuFullReductionService.insertSkuFullReduction(skuFullReduction);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改商品满减信息
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SkuFullReduction skuFullReduction) {
        int rows = skuFullReductionService.updateSkuFullReduction(skuFullReduction);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除商品满减信息
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = skuFullReductionService.deleteSkuFullReductionByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

