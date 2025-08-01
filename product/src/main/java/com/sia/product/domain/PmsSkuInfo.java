package com.sia.product.domain;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * sku信息对象 pms_sku_info
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSkuInfoMapper.PmsSkuInfoResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSkuInfo extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** skuId */
    @TableId(value = "sku_id",type = IdType.ASSIGN_ID)
    private Long skuId;

    /** sku名称 */
    private String skuName;

    private Long spuId;
    /** sku介绍描述 */
    private String skuDesc;

    /** 所属分类id */
    private Long catalogId;

    /** 品牌id */
    private Long brandId;

    /** sku默认图片 */
    private String skuDefaultImg;

    /** sku标题 */
    private String skuTitle;

    /** sku副标题 */
    private String skuSubtitle;

    /** 价格 */
    private BigDecimal price;

    /** 销量 */
    private Long saleCount;
}


