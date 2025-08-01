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
import com.sia.coupon.domain.Coupon;
import com.sia.coupon.service.ICouponService;
import com.sia.coupon.common.Result;

/**
 * 优惠券信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/coupon")
public class CouponController
{
    @Autowired
    private ICouponService couponService;

    /**
     * 查询优惠券信息列表
     */
    @GetMapping("/list")
    public Result<List<Coupon>> list(Coupon coupon)
    {
        List<Coupon> list = couponService.selectCouponList(coupon);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取优惠券信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<Coupon> getInfo(@PathVariable("id") Long id)
    {
        Coupon coupon = couponService.selectCouponById(id);
        return coupon != null ? Result.success(coupon, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增优惠券信息
     */
    @PostMapping
    public Result<Void> add(@RequestBody Coupon coupon)
    {
        int rows = couponService.insertCoupon(coupon);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改优惠券信息
     */
    @PutMapping
    public Result<Void> edit(@RequestBody Coupon coupon)
    {
        int rows = couponService.updateCoupon(coupon);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除优惠券信息
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = couponService.deleteCouponByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

