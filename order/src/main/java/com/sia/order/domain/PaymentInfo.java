package com.sia.order.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.order.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 支付信息表对象 oms_payment_info
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.PaymentInfoMapper.PaymentInfoResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 订单号（对外业务号） */
    private String orderSn;

    /** 订单id */
    private Long orderId;

    /** 支付宝交易流水号 */
    private String alipayTradeNo;

    /** 支付总金额 */
    private BigDecimal totalAmount;

    /** 交易内容 */
    private String subject;

    /** 支付状态 */
    private String paymentStatus;

    /** 确认时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date confirmTime;

    /** 回调内容 */
    private String callbackContent;

    /** 回调时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date callbackTime;
}
