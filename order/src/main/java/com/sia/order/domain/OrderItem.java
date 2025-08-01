package com.sia.order.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.order.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单项信息对象 oms_order_item
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.OrderItemMapper.OrderItemResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** order_id */
    private Long orderId;

    /** order_sn */
    private String orderSn;

    /** spu_id */
    private Long spuId;

    /** spu_name */
    private String spuName;

    /** spu_pic */
    private String spuPic;

    /** 品牌 */
    private String spuBrand;

    /** 商品分类id */
    private Long categoryId;

    /** 商品sku编号 */
    private Long skuId;

    /** 商品sku名字 */
    private String skuName;

    /** 商品sku图片 */
    private String skuPic;

    /** 商品sku价格 */
    private BigDecimal skuPrice;

    /** 商品购买的数量 */
    private Long skuQuantity;

    /** 商品销售属性组合（JSON） */
    private String skuAttrsVals;

    /** 商品促销分解金额 */
    private BigDecimal promotionAmount;

    /** 优惠券优惠分解金额 */
    private BigDecimal couponAmount;

    /** 积分优惠分解金额 */
    private BigDecimal integrationAmount;

    /** 该商品经过优惠后的分解金额 */
    private BigDecimal realAmount;

    /** 赠送积分 */
    private Long giftIntegration;

    /** 赠送成长值 */
    private Long giftGrowth;
}
