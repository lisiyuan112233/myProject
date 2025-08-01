package com.sia.coupon.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专题商品对象 sms_home_subject_spu
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.HomeSubjectSpuMapper.HomeSubjectSpuResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class HomeSubjectSpu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 专题名字 */
    private String name;
    /** 专题id */
    private Long subjectId;
    /** spu_id */
    private Long spuId;
    /** 排序 */
    private Long sort;
}

