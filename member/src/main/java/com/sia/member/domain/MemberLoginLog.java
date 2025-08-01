package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 会员登录记录对象 ums_member_login_log
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member_login_log")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLoginLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 会员id */
    private Long memberId;

    /** 用户名 */
    private String username;

    /** ip地址 */
    private String ip;

    /** 登录地点 */
    private String city;

    /** 登录类型[1-web，2-app] */
    private Integer loginType;

    /** 登录时间 */
    private Date loginTime;
}
