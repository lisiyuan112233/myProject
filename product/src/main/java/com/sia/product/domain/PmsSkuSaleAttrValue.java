package com.sia.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * sku销售属性&值对象 pms_sku_sale_attr_value
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSkuSaleAttrValueMapper.PmsSkuSaleAttrValueResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSkuSaleAttrValue extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** attr_id */
    private Long attrId;

    /** 销售属性名 */
    private String attrName;

    /** 销售属性值 */
    private String attrValue;

    /** 顺序 */
    private Integer attrSort;
}


