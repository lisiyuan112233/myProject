package com.sia.coupon.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 优惠券领取历史记录对象 sms_coupon_history
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.CouponHistoryMapper.CouponHistoryResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 优惠券id */
    private Long couponId;

    /** 会员id */
    private Long memberId;

    /** 会员名字 */
    private String memberNickName;

    /** 获取方式[0->后台赠送；1->主动领取] */
    private Integer getType;

    /** 使用状态[0->未使用；1->已使用；2->已过期] */
    private Integer useType;

    /** 使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date useTime;

    /** 订单id */
    private Long orderId;

    /** 订单号*/
    private Long orderSn;
}

