package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 成长值变化历史记录对象 ums_growth_change_history
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_growth_change_history")
@Data
@EqualsAndHashCode(callSuper = true)
public class GrowthChangeHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 会员id */
    private Long memberId;

    /** 改变的值（正负计数） */
    private Integer changeCount;

    /** 备注 */
    private String note;

    /** 积分来源[0-购物，1-管理员修改] */
    private Integer sourceType;
}
