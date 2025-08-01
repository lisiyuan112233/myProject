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
 * 退款信息对象 oms_refund_info
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.RefundInfoMapper.RefundInfoResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 退款的订单 */
    private Long orderReturnId;

    /** 退款金额 */
    private BigDecimal refund;

    /** 退款交易流水号 */
    private String refundSn;

    /** 退款状态 */
    private Integer refundStatus;

    /** 退款渠道[1-支付宝，2-微信，3-银联，4-汇款] */
    private Integer refundChannel;

    /** 退款内容 */
    private String refundContent;
}
