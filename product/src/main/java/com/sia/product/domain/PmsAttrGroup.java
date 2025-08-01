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
 * 属性分组对象 pms_attr_group
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsAttrGroupMapper.PmsAttrGroupResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsAttrGroup extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 分组id */
    @TableId(value = "attr_group_id",type = IdType.ASSIGN_ID)
    private Long attrGroupId;

    /** 组名 */
    private String attrGroupName;

    /** 排序 */
    private Integer sort;

    /** 描述 */
    private String descript;

    /** 组图标 */
    private String icon;

    /** 所属分类id */
    private Long catelogId;
}


