package com.sia.order.service;

import java.util.List;
import com.sia.order.domain.OrderSetting;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 订单配置信息Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IOrderSettingService extends IService<OrderSetting> {
    /**
     * 查询订单配置信息
     *
     * @param id 订单配置信息主键
     * @return 订单配置信息
     */
    public OrderSetting selectOrderSettingById(Long id);

    /**
     * 查询订单配置信息列表
     *
     * @param orderSetting 订单配置信息
     * @return 订单配置信息集合
     */
    public List<OrderSetting> selectOrderSettingList(OrderSetting orderSetting);

    /**
     * 新增订单配置信息
     *
     * @param orderSetting 订单配置信息
     * @return 结果
     */
    public int insertOrderSetting(OrderSetting orderSetting);

    /**
     * 修改订单配置信息
     *
     * @param orderSetting 订单配置信息
     * @return 结果
     */
    public int updateOrderSetting(OrderSetting orderSetting);

    /**
     * 批量删除订单配置信息
     *
     * @param ids 需要删除的订单配置信息主键集合
     * @return 结果
     */
    public int deleteOrderSettingByIds(Long[] ids);

    /**
     * 删除订单配置信息信息
     *
     * @param id 订单配置信息主键
     * @return 结果
     */
    public int deleteOrderSettingById(Long id);
}
