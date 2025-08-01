package com.sia.coupon.service;

import java.util.List;
import com.sia.coupon.domain.CouponSpuRelation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 优惠券与产品关联Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface ICouponSpuRelationService extends IService<CouponSpuRelation> {
    /**
     * 查询优惠券与产品关联
     *
     * @param id 优惠券与产品关联主键
     * @return 优惠券与产品关联
     */
    public CouponSpuRelation selectCouponSpuRelationById(Long id);

    /**
     * 查询优惠券与产品关联列表
     *
     * @param couponSpuRelation 优惠券与产品关联
     * @return 优惠券与产品关联集合
     */
    public List<CouponSpuRelation> selectCouponSpuRelationList(CouponSpuRelation couponSpuRelation);

    /**
     * 新增优惠券与产品关联
     *
     * @param couponSpuRelation 优惠券与产品关联
     * @return 结果
     */
    public int insertCouponSpuRelation(CouponSpuRelation couponSpuRelation);

    /**
     * 修改优惠券与产品关联
     *
     * @param couponSpuRelation 优惠券与产品关联
     * @return 结果
     */
    public int updateCouponSpuRelation(CouponSpuRelation couponSpuRelation);

    /**
     * 批量删除优惠券与产品关联
     *
     * @param ids 需要删除的优惠券与产品关联主键集合
     * @return 结果
     */
    public int deleteCouponSpuRelationByIds(Long[] ids);

    /**
     * 删除优惠券与产品关联信息
     *
     * @param id 优惠券与产品关联主键
     * @return 结果
     */
    public int deleteCouponSpuRelationById(Long id);
}
