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
 * 品牌对象 pms_brand
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsBrandMapper.PmsBrandResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsBrand extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 品牌id */
    @TableId(value = "brand_id",type = IdType.ASSIGN_ID)
    private Long brandId;

    /** 品牌名 */
    private String name;

    /** 品牌logo地址 */
    private String logo;

    /** 介绍 */
    private String descript;

    /** 显示状态[0-不显示；1-显示] */
    private Integer showStatus;

    /** 检索首字母 */
    private String firstLetter;

    /** 排序 */
    private Integer sort;
}

