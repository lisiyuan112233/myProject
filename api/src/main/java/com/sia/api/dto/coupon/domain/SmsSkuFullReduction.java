package com.sia.api.dto.coupon.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品满减信息
 * @TableName sms_sku_full_reduction
 */
@TableName(value ="sms_sku_full_reduction")
@Data
public class SmsSkuFullReduction {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;

    /**
     * 满多少
     */
    private BigDecimal fullPrice;

    /**
     * 减多少
     */
    private BigDecimal reducePrice;

    /**
     * 是否参与其他优惠
     */
    private Integer addOther;

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
        SmsSkuFullReduction other = (SmsSkuFullReduction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getFullPrice() == null ? other.getFullPrice() == null : this.getFullPrice().equals(other.getFullPrice()))
            && (this.getReducePrice() == null ? other.getReducePrice() == null : this.getReducePrice().equals(other.getReducePrice()))
            && (this.getAddOther() == null ? other.getAddOther() == null : this.getAddOther().equals(other.getAddOther()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getFullPrice() == null) ? 0 : getFullPrice().hashCode());
        result = prime * result + ((getReducePrice() == null) ? 0 : getReducePrice().hashCode());
        result = prime * result + ((getAddOther() == null) ? 0 : getAddOther().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", fullPrice=").append(fullPrice);
        sb.append(", reducePrice=").append(reducePrice);
        sb.append(", addOther=").append(addOther);
        sb.append("]");
        return sb.toString();
    }
}