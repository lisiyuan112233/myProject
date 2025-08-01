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
 * 品牌分类关联对象 pms_category_brand_relation
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsCategoryBrandRelationMapper.PmsCategoryBrandRelationResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsCategoryBrandRelation extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 品牌id */
    private Long brandId;

    /** 分类id */
    private Long catelogId;

    /** 品牌名 */
    private String brandName;

    /** 分类名 */
    private String catelogName;
}


