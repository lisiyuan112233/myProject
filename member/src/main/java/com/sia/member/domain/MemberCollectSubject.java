package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 会员收藏的专题活动对象 ums_member_collect_subject
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member_collect_subject")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCollectSubject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** subject_id */
    private Long subjectId;

    /** subject_name */
    private String subjectName;

    /** subject_img */
    private String subjectImg;

    /** 活动url */
    private String subjectUrll;
}
