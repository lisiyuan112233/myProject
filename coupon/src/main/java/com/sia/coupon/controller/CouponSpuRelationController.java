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
import com.sia.coupon.domain.CouponSpuRelation;
import com.sia.coupon.service.ICouponSpuRelationService;
import com.sia.coupon.common.Result;

/**
 * 优惠券与产品关联Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/spuRelation")
public class CouponSpuRelationController
{
    @Autowired
    private ICouponSpuRelationService couponSpuRelationService;

    /**
     * 查询优惠券与产品关联列表
     */
    @GetMapping("/list")
    public Result<List<CouponSpuRelation>> list(CouponSpuRelation couponSpuRelation) {
        List<CouponSpuRelation> list = couponSpuRelationService.selectCouponSpuRelationList(couponSpuRelation);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取优惠券与产品关联详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<CouponSpuRelation> getInfo(@PathVariable("id") Long id) {
        CouponSpuRelation couponSpuRelation = couponSpuRelationService.selectCouponSpuRelationById(id);
        return couponSpuRelation != null ? Result.success(couponSpuRelation, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增优惠券与产品关联
     */
    @PostMapping
    public Result<Void> add(@RequestBody CouponSpuRelation couponSpuRelation) {
        int rows = couponSpuRelationService.insertCouponSpuRelation(couponSpuRelation);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改优惠券与产品关联
     */
    @PutMapping
    public Result<Void> edit(@RequestBody CouponSpuRelation couponSpuRelation) {
        int rows = couponSpuRelationService.updateCouponSpuRelation(couponSpuRelation);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除优惠券与产品关联
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = couponSpuRelationService.deleteCouponSpuRelationByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

