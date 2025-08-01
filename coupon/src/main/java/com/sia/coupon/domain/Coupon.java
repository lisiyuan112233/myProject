package com.sia.coupon.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 优惠券信息对象 sms_coupon
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.CouponMapper.CouponResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class Coupon extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 优惠券类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券] */
    private Integer couponType;

    /** 优惠券图片 */
    private String couponImg;

    /** 优惠券名字 */
    private String couponName;

    /** 数量 */
    private Long num;

    /** 金额 */
    private BigDecimal amount;

    /** 每人限领张数 */
    private Long perLimit;

    /** 使用门槛 */
    private BigDecimal minPoint;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /** 使用类型[0->全场通用；1->指定分类；2->指定商品] */
    private Integer useType;

    /** 备注 */
    private String note;

    /** 发行数量 */
    private Long publishCount;

    /** 已使用数量 */
    private Long useCount;

    /** 领取数量 */
    private Long receiveCount;

    /** 可以领取的开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enableStartTime;

    /** 可以领取的结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enableEndTime;

    /** 优惠码 */
    private String code;

    /** 可以领取的会员等级[0->不限等级，其他-对应等级] */
    private Integer memberLevel;

    /** 发布状态[0-未发布，1-已发布] */
    private Integer publish;
}

