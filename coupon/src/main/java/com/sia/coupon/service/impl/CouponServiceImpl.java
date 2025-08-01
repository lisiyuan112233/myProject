package com.sia.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.coupon.domain.Coupon;
import com.sia.coupon.mapper.CouponMapper;
import com.sia.coupon.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 优惠券信息Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {
    @Autowired
    private CouponMapper couponMapper;

    /**
     * 查询优惠券信息
     *
     * @param id 优惠券信息主键
     * @return 优惠券信息
     */
    @Override
    public Coupon selectCouponById(Long id) {
        return couponMapper.selectCouponById(id);
    }

    /**
     * 查询优惠券信息列表
     *
     * @param coupon 优惠券信息
     * @return 优惠券信息
     */
    @Override
    public List<Coupon> selectCouponList(Coupon coupon) {
        return couponMapper.selectCouponList(coupon);
    }

    /**
     * 新增优惠券信息
     *
     * @param coupon 优惠券信息
     * @return 结果
     */
    @Override
    public int insertCoupon(Coupon coupon) {
        return couponMapper.insertCoupon(coupon);
    }

    /**
     * 修改优惠券信息
     *
     * @param coupon 优惠券信息
     * @return 结果
     */
    @Override
    public int updateCoupon(Coupon coupon) {
        return couponMapper.updateCoupon(coupon);
    }

    /**
     * 批量删除优惠券信息
     *
     * @param ids 需要删除的优惠券信息主键
     * @return 结果
     */
    @Override
    public int deleteCouponByIds(Long[] ids) {
        return couponMapper.deleteCouponByIds(ids);
    }

    /**
     * 删除优惠券信息信息
     *
     * @param id 优惠券信息主键
     * @return 结果
     */
    @Override
    public int deleteCouponById(Long id) {
        return couponMapper.deleteCouponById(id);
    }
}

