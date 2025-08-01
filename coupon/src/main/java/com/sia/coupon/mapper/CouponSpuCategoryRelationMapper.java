package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.CouponSpuCategoryRelation;

/**
 * 优惠券分类关联Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface CouponSpuCategoryRelationMapper extends BaseMapper<CouponSpuCategoryRelation> {
    /**
     * 查询优惠券分类关�?
     *
     * @param id 优惠券分类关联主�?
     * @return 优惠券分类关�?
     */
    public CouponSpuCategoryRelation selectCouponSpuCategoryRelationById(Long id);

    /**
     * 查询优惠券分类关联列�?
     *
     * @param couponSpuCategoryRelation 优惠券分类关�?
     * @return 优惠券分类关联集�?
     */
    public List<CouponSpuCategoryRelation> selectCouponSpuCategoryRelationList(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 新增优惠券分类关�?
     *
     * @param couponSpuCategoryRelation 优惠券分类关�?
     * @return 结果
     */
    public int insertCouponSpuCategoryRelation(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 修改优惠券分类关�?
     *
     * @param couponSpuCategoryRelation 优惠券分类关�?
     * @return 结果
     */
    public int updateCouponSpuCategoryRelation(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 删除优惠券分类关�?
     *
     * @param id 优惠券分类关联主�?
     * @return 结果
     */
    public int deleteCouponSpuCategoryRelationById(Long id);

    /**
     * 批量删除优惠券分类关�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCouponSpuCategoryRelationByIds(Long[] ids);
}
