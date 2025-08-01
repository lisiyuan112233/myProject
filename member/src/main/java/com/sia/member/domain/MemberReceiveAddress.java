package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 会员收货地址对象 ums_member_receive_address
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member_receive_address")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberReceiveAddress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 会员id */
    private Long memberId;

    /** 收货人姓名 */
    private String name;

    /** 电话 */
    private String phoneNumber;

    /** 是否为默认 0->否；1->是 */
    private Integer defaultStatus;

    /** 邮政编码 */
    private String postCode;

    private String areacode;
    /** 省份/直辖市 */
    private String province;

    /** 城市 */
    private String city;

    /** 区 */
    private String region;

    /** 详细地址 */
    private String detailAddress;
}
