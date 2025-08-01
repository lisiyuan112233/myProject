package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.CouponSpuRelation;

/**
 * 优惠券与产品关联Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface CouponSpuRelationMapper extends BaseMapper<CouponSpuRelation> {
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
     * 删除优惠券与产品关联
     *
     * @param id 优惠券与产品关联主键
     * @return 结果
     */
    public int deleteCouponSpuRelationById(Long id);

    /**
     * 批量删除优惠券与产品关联
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCouponSpuRelationByIds(Long[] ids);
}
