package com.sia.api.dto.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * @TableName wms_purchase
 */
@TableName(value ="wms_purchase")
@Data
public class WmsPurchase {
    /**
     * 采购单id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 采购人id
     */
    private Long assigneeId;

    /**
     * 采购人名
     */
    private String assigneeName;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 仓库id
     */
    private Long wareId;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;

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
        WmsPurchase other = (WmsPurchase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAssigneeId() == null ? other.getAssigneeId() == null : this.getAssigneeId().equals(other.getAssigneeId()))
            && (this.getAssigneeName() == null ? other.getAssigneeName() == null : this.getAssigneeName().equals(other.getAssigneeName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWareId() == null ? other.getWareId() == null : this.getWareId().equals(other.getWareId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAssigneeId() == null) ? 0 : getAssigneeId().hashCode());
        result = prime * result + ((getAssigneeName() == null) ? 0 : getAssigneeName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWareId() == null) ? 0 : getWareId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", assigneeId=").append(assigneeId);
        sb.append(", assigneeName=").append(assigneeName);
        sb.append(", phone=").append(phone);
        sb.append(", priority=").append(priority);
        sb.append(", status=").append(status);
        sb.append(", wareId=").append(wareId);
        sb.append(", amount=").append(amount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}