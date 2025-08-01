package com.sia.order.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.order.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单配置信息对象 oms_order_setting
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.order.mapper.OrderSettingMapper.OrderSettingResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderSetting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 秒杀订单超时关闭时间(分) */
    private Integer flashOrderOvertime;

    /** 正常订单超时时间(分) */
    private Integer normalOrderOvertime;

    /** 发货后自动确认收货时间（天） */
    private Integer confirmOvertime;

    /** 自动完成交易时间，不能申请退货（天） */
    private Integer finishOvertime;

    /** 订单完成后自动好评时间（天） */
    private Integer commentOvertime;

    /** 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】 */
    private Integer memberLevel;
}
