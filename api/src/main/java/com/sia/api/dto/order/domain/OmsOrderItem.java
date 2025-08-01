package com.sia.api.dto.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单项信息
 * @TableName oms_order_item
 */
@TableName(value ="oms_order_item")
@Data
public class OmsOrderItem {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    private Long orderId;

    /**
     * order_sn
     */
    private String orderSn;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

    /**
     * spu_pic
     */
    private String spuPic;

    /**
     * 品牌
     */
    private String spuBrand;

    /**
     * 商品分类id
     */
    private Long categoryId;

    /**
     * 商品sku编号
     */
    private Long skuId;

    /**
     * 商品sku名字
     */
    private String skuName;

    /**
     * 商品sku图片
     */
    private String skuPic;

    /**
     * 商品sku价格
     */
    private BigDecimal skuPrice;

    /**
     * 商品购买的数量
     */
    private Integer skuQuantity;

    /**
     * 商品销售属性组合（JSON）
     */
    private String skuAttrsVals;

    /**
     * 商品促销分解金额
     */
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    private BigDecimal realAmount;

    /**
     * 赠送积分
     */
    private Integer giftIntegration;

    /**
     * 赠送成长值
     */
    private Integer giftGrowth;

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
        OmsOrderItem other = (OmsOrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getSpuName() == null ? other.getSpuName() == null : this.getSpuName().equals(other.getSpuName()))
            && (this.getSpuPic() == null ? other.getSpuPic() == null : this.getSpuPic().equals(other.getSpuPic()))
            && (this.getSpuBrand() == null ? other.getSpuBrand() == null : this.getSpuBrand().equals(other.getSpuBrand()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getSkuPic() == null ? other.getSkuPic() == null : this.getSkuPic().equals(other.getSkuPic()))
            && (this.getSkuPrice() == null ? other.getSkuPrice() == null : this.getSkuPrice().equals(other.getSkuPrice()))
            && (this.getSkuQuantity() == null ? other.getSkuQuantity() == null : this.getSkuQuantity().equals(other.getSkuQuantity()))
            && (this.getSkuAttrsVals() == null ? other.getSkuAttrsVals() == null : this.getSkuAttrsVals().equals(other.getSkuAttrsVals()))
            && (this.getPromotionAmount() == null ? other.getPromotionAmount() == null : this.getPromotionAmount().equals(other.getPromotionAmount()))
            && (this.getCouponAmount() == null ? other.getCouponAmount() == null : this.getCouponAmount().equals(other.getCouponAmount()))
            && (this.getIntegrationAmount() == null ? other.getIntegrationAmount() == null : this.getIntegrationAmount().equals(other.getIntegrationAmount()))
            && (this.getRealAmount() == null ? other.getRealAmount() == null : this.getRealAmount().equals(other.getRealAmount()))
            && (this.getGiftIntegration() == null ? other.getGiftIntegration() == null : this.getGiftIntegration().equals(other.getGiftIntegration()))
            && (this.getGiftGrowth() == null ? other.getGiftGrowth() == null : this.getGiftGrowth().equals(other.getGiftGrowth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getSpuName() == null) ? 0 : getSpuName().hashCode());
        result = prime * result + ((getSpuPic() == null) ? 0 : getSpuPic().hashCode());
        result = prime * result + ((getSpuBrand() == null) ? 0 : getSpuBrand().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getSkuPic() == null) ? 0 : getSkuPic().hashCode());
        result = prime * result + ((getSkuPrice() == null) ? 0 : getSkuPrice().hashCode());
        result = prime * result + ((getSkuQuantity() == null) ? 0 : getSkuQuantity().hashCode());
        result = prime * result + ((getSkuAttrsVals() == null) ? 0 : getSkuAttrsVals().hashCode());
        result = prime * result + ((getPromotionAmount() == null) ? 0 : getPromotionAmount().hashCode());
        result = prime * result + ((getCouponAmount() == null) ? 0 : getCouponAmount().hashCode());
        result = prime * result + ((getIntegrationAmount() == null) ? 0 : getIntegrationAmount().hashCode());
        result = prime * result + ((getRealAmount() == null) ? 0 : getRealAmount().hashCode());
        result = prime * result + ((getGiftIntegration() == null) ? 0 : getGiftIntegration().hashCode());
        result = prime * result + ((getGiftGrowth() == null) ? 0 : getGiftGrowth().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", spuId=").append(spuId);
        sb.append(", spuName=").append(spuName);
        sb.append(", spuPic=").append(spuPic);
        sb.append(", spuBrand=").append(spuBrand);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuPic=").append(skuPic);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuQuantity=").append(skuQuantity);
        sb.append(", skuAttrsVals=").append(skuAttrsVals);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append("]");
        return sb.toString();
    }
}