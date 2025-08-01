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
 * 商品属性对象 pms_attr
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsAttrMapper.PmsAttrResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsAttr extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "attr_id",type = IdType.ASSIGN_ID)
    private Long attrId;

    /** 属性名 */
    private String attrName;

    /** 是否需要检索[0-不需要，1-需要] */
    private Integer searchType;

    /** 值类型[0-为单个值，1-可以选择多个值] */
    private Integer valueType;

    /** 属性图标 */
    private String icon;

    /** 可选值列表[用逗号分割] */
    private String valueSelect;

    /** 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性] */
    private Integer attrType;

    /** 启用状态[0 - 禁用，1 - 启用] */
    private Integer showStatus;

    /** 排序 */
    private Integer sort;

    /** 产品数量 */
    private Integer productCount;

    private Long enable;
    private Long catelogId;
    private Long showDesc;
}

