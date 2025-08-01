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
 * 商品三级分类对象 pms_category
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsCategoryMapper.PmsCategoryResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsCategory extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 分类id */
    @TableId(value = "cat_id",type = IdType.ASSIGN_ID)
    private Long catId;

    /** 分类名称 */
    private String name;

    /** 父分类id */
    private Long parentCid;

    /** 层级 */
    private Integer catLevel;

    /** 是否显示[0-不显示，1显示] */
    private Integer showStatus;

    /** 排序 */
    private Integer sort;

    /** 图标地址 */
    private String icon;

    /** 计量单位 */
    private String productUnit;

    /** 商品数量 */
    private Integer productCount;
}

