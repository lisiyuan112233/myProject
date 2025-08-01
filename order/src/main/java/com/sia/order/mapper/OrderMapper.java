package com.sia.order.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.order.domain.Order;

/**
 * 订单Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface OrderMapper extends BaseMapper<Order> {
    /**
     * 查询订单
     *
     * @param id 订单主键
     * @return 订单
     */
    public Order selectOrderById(Long id);

    /**
     * 查询订单列表
     *
     * @param order 订单
     * @return 订单集合
     */
    public List<Order> selectOrderList(Order order);

    /**
     * 新增订单
     *
     * @param order 订单
     * @return 结果
     */
    public int insertOrder(Order order);

    /**
     * 修改订单
     *
     * @param order 订单
     * @return 结果
     */
    public int updateOrder(Order order);

    /**
     * 删除订单
     *
     * @param id 订单主键
     * @return 结果
     */
    public int deleteOrderById(Long id);

    /**
     * 批量删除订单
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderByIds(Long[] ids);
}
