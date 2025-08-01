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
import com.sia.coupon.domain.CouponSpuCategoryRelation;
import com.sia.coupon.service.ICouponSpuCategoryRelationService;
import com.sia.coupon.common.Result;

/**
 * 优惠券分类关联Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/spuCategoryRelation")
public class CouponSpuCategoryRelationController
{
    @Autowired
    private ICouponSpuCategoryRelationService couponSpuCategoryRelationService;

    /**
     * 查询优惠券分类关联列表
     */
    @GetMapping("/list")
    public Result<List<CouponSpuCategoryRelation>> list(CouponSpuCategoryRelation couponSpuCategoryRelation)
    {
        List<CouponSpuCategoryRelation> list = couponSpuCategoryRelationService.selectCouponSpuCategoryRelationList(couponSpuCategoryRelation);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取优惠券分类关联详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<CouponSpuCategoryRelation> getInfo(@PathVariable("id") Long id)
    {
        CouponSpuCategoryRelation couponSpuCategoryRelation = couponSpuCategoryRelationService.selectCouponSpuCategoryRelationById(id);
        return couponSpuCategoryRelation != null ? Result.success(couponSpuCategoryRelation, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增优惠券分类关联
     */
    @PostMapping
    public Result<Void> add(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation)
    {
        int rows = couponSpuCategoryRelationService.insertCouponSpuCategoryRelation(couponSpuCategoryRelation);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改优惠券分类关联
     */
    @PutMapping
    public Result<Void> edit(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation)
    {
        int rows = couponSpuCategoryRelationService.updateCouponSpuCategoryRelation(couponSpuCategoryRelation);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除优惠券分类关联
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = couponSpuCategoryRelationService.deleteCouponSpuCategoryRelationByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

