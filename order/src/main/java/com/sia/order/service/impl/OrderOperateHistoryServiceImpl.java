package com.sia.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.order.mapper.OrderOperateHistoryMapper;
import com.sia.order.domain.OrderOperateHistory;
import com.sia.order.service.IOrderOperateHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements IOrderOperateHistoryService
{
    @Autowired
    private OrderOperateHistoryMapper orderOperateHistoryMapper;

    /**
     * 查询订单操作历史记录
     *
     * @param id 订单操作历史记录主键
     * @return 订单操作历史记录
     */
    @Override
    public OrderOperateHistory selectOrderOperateHistoryById(Long id)
    {
        return orderOperateHistoryMapper.selectOrderOperateHistoryById(id);
    }

    /**
     * 查询订单操作历史记录列表
     *
     * @param orderOperateHistory 订单操作历史记录
     * @return 订单操作历史记录
     */
    @Override
    public List<OrderOperateHistory> selectOrderOperateHistoryList(OrderOperateHistory orderOperateHistory)
    {
        return orderOperateHistoryMapper.selectOrderOperateHistoryList(orderOperateHistory);
    }

    /**
     * 新增订单操作历史记录
     *
     * @param orderOperateHistory 订单操作历史记录
     * @return 结果
     */
    @Override
    public int insertOrderOperateHistory(OrderOperateHistory orderOperateHistory)
    {
        return orderOperateHistoryMapper.insertOrderOperateHistory(orderOperateHistory);
    }

    /**
     * 修改订单操作历史记录
     *
     * @param orderOperateHistory 订单操作历史记录
     * @return 结果
     */
    @Override
    public int updateOrderOperateHistory(OrderOperateHistory orderOperateHistory)
    {
        return orderOperateHistoryMapper.updateOrderOperateHistory(orderOperateHistory);
    }

    /**
     * 批量删除订单操作历史记录
     *
     * @param ids 需要删除的订单操作历史记录主键
     * @return 结果
     */
    @Override
    public int deleteOrderOperateHistoryByIds(Long[] ids)
    {
        return orderOperateHistoryMapper.deleteOrderOperateHistoryByIds(ids);
    }

    /**
     * 删除订单操作历史记录信息
     *
     * @param id 订单操作历史记录主键
     * @return 结果
     */
    @Override
    public int deleteOrderOperateHistoryById(Long id)
    {
        return orderOperateHistoryMapper.deleteOrderOperateHistoryById(id);
    }
}
