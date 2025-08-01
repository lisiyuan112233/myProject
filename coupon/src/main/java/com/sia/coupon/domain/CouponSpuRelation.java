package com.sia.coupon.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 优惠券与产品关联对象 sms_coupon_spu_relation
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.CouponSpuRelationMapper.CouponSpuRelationResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponSpuRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 优惠券id */
    private Long couponId;

    /** spu_id */
    private Long spuId;

    /** spu_name */
    private String spuName;
}

