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
 * 属性&属性分组关联对象 pms_attr_attrgroup_relation
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsAttrAttrgroupRelationMapper.PmsAttrAttrgroupRelationResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsAttrAttrgroupRelation extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 属性id */
    private Long attrId;

    /** 属性分组id */
    private Long attrGroupId;

    /** 属性排序 */
    private Integer attrSort;
}

