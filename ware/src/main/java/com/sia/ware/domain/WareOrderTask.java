package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 库存工作单对象 wms_ware_order_task
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_ware_order_task")
@Data
@EqualsAndHashCode(callSuper = true)
public class WareOrderTask extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** order_id */
    private Long orderId;

    /** order_sn */
    private String orderSn;

    /** 收货人 */
    private String consignee;

    /** 收货人电话 */
    private String consigneeTel;

    /** 配送地址 */
    private String deliveryAddress;

    /** 订单备注 */
    private String orderComment;

    /** 付款方式【 1:在线付款 2:货到付款】 */
    private Integer paymentWay;

    /** 任务状态 */
    private Integer taskStatus;

    /** 订单描述 */
    private String orderBody;

    /** 物流单号 */
    private String trackingNo;

    /** 仓库id */
    private Long wareId;

    /** 工作单备注 */
    private String taskComment;
}
