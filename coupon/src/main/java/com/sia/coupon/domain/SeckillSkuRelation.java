package com.sia.coupon.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 秒杀活动商品关联对象 sms_seckill_sku_relation
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SeckillSkuRelationMapper.SeckillSkuRelationResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SeckillSkuRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 活动id */
    private Long promotionId;

    /** 活动场次id */
    private Long promotionSessionId;

    /** 商品id */
    private Long skuId;

    /** 秒杀价格 */
    private BigDecimal seckillPrice;

    /** 秒杀总量 */
    private Long seckillCount;

    /** 每人限购数量 */
    private Long seckillLimit;

    /** 排序 */
    private Long seckillSort;
}

