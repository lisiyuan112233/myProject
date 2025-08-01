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
 * spu属性值对象 pms_product_attr_value
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsProductAttrValueMapper.PmsProductAttrValueResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsProductAttrValue extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** spu_id */
    private Long spuId;

    /** attr_id */
    private Long attrId;

    /** 属性名 */
    private String attrName;

    /** 属性值 */
    private String attrValue;

    /** 顺序 */
    private Integer attrSort;

    /** 快速展示【是否展示在介绍上；0-否 1-是】 */
    private Integer quickShow;
}


