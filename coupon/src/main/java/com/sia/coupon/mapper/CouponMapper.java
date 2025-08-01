package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.Coupon;

/**
 * 优惠券信息Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface CouponMapper extends BaseMapper<Coupon> {
    /**
     * 查询优惠券信�?
     *
     * @param id 优惠券信息主�?
     * @return 优惠券信�?
     */
    public Coupon selectCouponById(Long id);

    /**
     * 查询优惠券信息列�?
     *
     * @param coupon 优惠券信�?
     * @return 优惠券信息集�?
     */
    public List<Coupon> selectCouponList(Coupon coupon);

    /**
     * 新增优惠券信�?
     *
     * @param coupon 优惠券信�?
     * @return 结果
     */
    public int insertCoupon(Coupon coupon);

    /**
     * 修改优惠券信�?
     *
     * @param coupon 优惠券信�?
     * @return 结果
     */
    public int updateCoupon(Coupon coupon);

    /**
     * 删除优惠券信�?
     *
     * @param id 优惠券信息主�?
     * @return 结果
     */
    public int deleteCouponById(Long id);

    /**
     * 批量删除优惠券信�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCouponByIds(Long[] ids);
}
