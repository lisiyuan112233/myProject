package com.sia.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.order.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单操作历史记录对象 oms_order_operate_history
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.OrderOperateHistoryMapper.OrderOperateHistoryResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderOperateHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 订单id */
    private Long orderId;

    /** 操作人[用户；系统；后台管理员] */
    private String operateMan;

    /** 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】 */
    private Integer orderStatus;

    /** 备注 */
    private String note;
}
