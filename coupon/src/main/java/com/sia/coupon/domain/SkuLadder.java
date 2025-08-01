package com.sia.coupon.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品阶梯价格对象 sms_sku_ladder
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SkuLadderMapper.SkuLadderResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SkuLadder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** 满几件 */
    private Long fullCount;

    /** 打几折 */
    private BigDecimal discount;

    /** 折后价 */
    private BigDecimal price;

    /** 是否叠加其他优惠[0-不可叠加，1-可叠加] */
    private Integer addOther;
}

