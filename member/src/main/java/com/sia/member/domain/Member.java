package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 会员对象 ums_member
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member")
@Data
@EqualsAndHashCode(callSuper = true)
public class Member extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 会员等级id */
    private Long levelId;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 昵称 */
    private String nickname;

    /** 手机号码 */
    private String mobile;

    /** 邮箱 */
    private String email;

    private String header;
    /** 头像 */
    private String avatar;

    /** 性别 */
    private Integer gender;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    /** 所在城市 */
    private String city;

    /** 职业 */
    private String job;

    /** 个性签名 */
    private String sign;

    /** 用户来源 */
    private Integer sourceType;

    /** 积分 */
    private Integer integration;

    /** 成长值 */
    private Integer growth;

    /** 启用状态 */
    private Integer status;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;
}
