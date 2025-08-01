package com.sia.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.order.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 退货原因对象 oms_order_return_reason
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.OrderReturnReasonMapper.OrderReturnReasonResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderReturnReason extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 退货原因名 */
    private String name;

    /** 排序 */
    private Integer sort;

    /** 启用状态 */
    private Integer status;
}
