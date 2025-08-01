package com.sia.coupon.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品满减信息对象 sms_sku_full_reduction
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SkuFullReductionMapper.SkuFullReductionResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SkuFullReduction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** 满多少 */
    private BigDecimal fullPrice;

    /** 减多少 */
    private BigDecimal reducePrice;

    /** 是否参与其他优惠 */
    private Integer addOther;
}

