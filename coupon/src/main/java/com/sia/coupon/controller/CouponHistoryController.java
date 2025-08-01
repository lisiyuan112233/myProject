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
import com.sia.coupon.domain.CouponHistory;
import com.sia.coupon.service.ICouponHistoryService;
import com.sia.coupon.common.Result;

/**
 * 优惠券领取历史记录Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/history")
public class CouponHistoryController
{
    @Autowired
    private ICouponHistoryService couponHistoryService;

    /**
     * 查询优惠券领取历史记录列表
     */
    @GetMapping("/list")
    public Result<List<CouponHistory>> list(CouponHistory couponHistory)
    {
        List<CouponHistory> list = couponHistoryService.selectCouponHistoryList(couponHistory);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取优惠券领取历史记录详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<CouponHistory> getInfo(@PathVariable("id") Long id)
    {
        CouponHistory couponHistory = couponHistoryService.selectCouponHistoryById(id);
        return couponHistory != null ? Result.success(couponHistory, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增优惠券领取历史记录
     */
    @PostMapping
    public Result<Void> add(@RequestBody CouponHistory couponHistory)
    {
        int rows = couponHistoryService.insertCouponHistory(couponHistory);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改优惠券领取历史记录
     */
    @PutMapping
    public Result<Void> edit(@RequestBody CouponHistory couponHistory)
    {
        int rows = couponHistoryService.updateCouponHistory(couponHistory);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除优惠券领取历史记录
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = couponHistoryService.deleteCouponHistoryByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

