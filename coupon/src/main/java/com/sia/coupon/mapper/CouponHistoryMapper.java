package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.CouponHistory;

/**
 * 优惠券领取历史记录Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface CouponHistoryMapper extends BaseMapper<CouponHistory> {
    /**
     * 查询优惠券领取历史记�?
     *
     * @param id 优惠券领取历史记录主�?
     * @return 优惠券领取历史记�?
     */
    public CouponHistory selectCouponHistoryById(Long id);

    /**
     * 查询优惠券领取历史记录列�?
     *
     * @param couponHistory 优惠券领取历史记�?
     * @return 优惠券领取历史记录集�?
     */
    public List<CouponHistory> selectCouponHistoryList(CouponHistory couponHistory);

    /**
     * 新增优惠券领取历史记�?
     *
     * @param couponHistory 优惠券领取历史记�?
     * @return 结果
     */
    public int insertCouponHistory(CouponHistory couponHistory);

    /**
     * 修改优惠券领取历史记�?
     *
     * @param couponHistory 优惠券领取历史记�?
     * @return 结果
     */
    public int updateCouponHistory(CouponHistory couponHistory);

    /**
     * 删除优惠券领取历史记�?
     *
     * @param id 优惠券领取历史记录主�?
     * @return 结果
     */
    public int deleteCouponHistoryById(Long id);

    /**
     * 批量删除优惠券领取历史记�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCouponHistoryByIds(Long[] ids);
}
