package com.sia.api.dto.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 退款信息
 * @TableName oms_refund_info
 */
@TableName(value ="oms_refund_info")
@Data
public class OmsRefundInfo {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 退款的订单
     */
    private Long orderReturnId;

    /**
     * 退款金额
     */
    private BigDecimal refund;

    /**
     * 退款交易流水号
     */
    private String refundSn;

    /**
     * 退款状态
     */
    private Integer refundStatus;

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Integer refundChannel;

    /**
     * 
     */
    private String refundContent;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OmsRefundInfo other = (OmsRefundInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderReturnId() == null ? other.getOrderReturnId() == null : this.getOrderReturnId().equals(other.getOrderReturnId()))
            && (this.getRefund() == null ? other.getRefund() == null : this.getRefund().equals(other.getRefund()))
            && (this.getRefundSn() == null ? other.getRefundSn() == null : this.getRefundSn().equals(other.getRefundSn()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()))
            && (this.getRefundChannel() == null ? other.getRefundChannel() == null : this.getRefundChannel().equals(other.getRefundChannel()))
            && (this.getRefundContent() == null ? other.getRefundContent() == null : this.getRefundContent().equals(other.getRefundContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderReturnId() == null) ? 0 : getOrderReturnId().hashCode());
        result = prime * result + ((getRefund() == null) ? 0 : getRefund().hashCode());
        result = prime * result + ((getRefundSn() == null) ? 0 : getRefundSn().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        result = prime * result + ((getRefundChannel() == null) ? 0 : getRefundChannel().hashCode());
        result = prime * result + ((getRefundContent() == null) ? 0 : getRefundContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderReturnId=").append(orderReturnId);
        sb.append(", refund=").append(refund);
        sb.append(", refundSn=").append(refundSn);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundChannel=").append(refundChannel);
        sb.append(", refundContent=").append(refundContent);
        sb.append("]");
        return sb.toString();
    }
}