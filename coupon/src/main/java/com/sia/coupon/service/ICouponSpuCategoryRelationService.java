package com.sia.coupon.service;

import java.util.List;
import com.sia.coupon.domain.CouponSpuCategoryRelation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 优惠券分类关联Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface ICouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelation> {
    /**
     * 查询优惠券分类关联
     *
     * @param id 优惠券分类关联主键
     * @return 优惠券分类关联
     */
    public CouponSpuCategoryRelation selectCouponSpuCategoryRelationById(Long id);

    /**
     * 查询优惠券分类关联列表
     *
     * @param couponSpuCategoryRelation 优惠券分类关联
     * @return 优惠券分类关联集合
     */
    public List<CouponSpuCategoryRelation> selectCouponSpuCategoryRelationList(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 新增优惠券分类关联
     *
     * @param couponSpuCategoryRelation 优惠券分类关联
     * @return 结果
     */
    public int insertCouponSpuCategoryRelation(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 修改优惠券分类关联
     *
     * @param couponSpuCategoryRelation 优惠券分类关联
     * @return 结果
     */
    public int updateCouponSpuCategoryRelation(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 批量删除优惠券分类关联
     *
     * @param ids 需要删除的优惠券分类关联主键集合
     * @return 结果
     */
    public int deleteCouponSpuCategoryRelationByIds(Long[] ids);

    /**
     * 删除优惠券分类关联信息
     *
     * @param id 优惠券分类关联主键
     * @return 结果
     */
    public int deleteCouponSpuCategoryRelationById(Long id);
}
