package com.sia.coupon.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品会员价格对象 sms_member_price
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.MemberPriceMapper.MemberPriceResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPrice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** 会员等级id */
    private Long memberLevelId;

    /** 会员等级名 */
    private String memberLevelName;

    /** 会员对应价格 */
    private BigDecimal memberPrice;

    /** 可否叠加其他优惠[0-不可叠加优惠，1-可叠加] */
    private Integer addOther;
}

