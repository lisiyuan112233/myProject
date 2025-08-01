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
 * 订单退货申请对象 oms_order_return_apply
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.OrderReturnApplyMapper.OrderReturnApplyResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderReturnApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** order_id */
    private Long orderId;

    /** 退货商品id */
    private Long skuId;

    /** 订单编号 */
    private String orderSn;

    /** 会员用户名 */
    private String memberUsername;

    /** 退款金额 */
    private BigDecimal returnAmount;

    /** 退货人姓名 */
    private String returnName;

    /** 退货人电话 */
    private String returnPhone;

    /** 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝] */
    private Integer status;

    /** 处理时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /** 商品图片 */
    private String skuImg;

    /** 商品名称 */
    private String skuName;

    /** 商品品牌 */
    private String skuBrand;

    /** 商品销售属性(JSON) */
    private String skuAttrsVals;

    /** 退货数量 */
    private Long skuCount;

    /** 商品单价 */
    private BigDecimal skuPrice;

    /** 商品实际支付单价 */
    private BigDecimal skuRealPrice;

    /** 原因 */
    private String reason;

    /** 描述 */
    private String description述;

    /** 凭证图片，以逗号分割 */
    private String descPics;

    /** 处理备注 */
    private String handleNote;

    /** 处理人员 */
    private String handleMan;

    /** 收货人 */
    private String receiveMan;

    /** 收货时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date receiveTime;

    /** 收货备注 */
    private String receiveNote;

    /** 收货电话 */
    private String receivePhone;

    /** 公司收货地址 */
    private String companyAddress;
}
