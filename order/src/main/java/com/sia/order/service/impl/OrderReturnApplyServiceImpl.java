package com.sia.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.order.mapper.OrderReturnApplyMapper;
import com.sia.order.domain.OrderReturnApply;
import com.sia.order.service.IOrderReturnApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements IOrderReturnApplyService
{
    @Autowired
    private OrderReturnApplyMapper orderReturnApplyMapper;

    /**
     * 查询订单退货申请
     *
     * @param id 订单退货申请主键
     * @return 订单退货申请
     */
    @Override
    public OrderReturnApply selectOrderReturnApplyById(Long id)
    {
        return orderReturnApplyMapper.selectOrderReturnApplyById(id);
    }

    /**
     * 查询订单退货申请列表
     *
     * @param orderReturnApply 订单退货申请
     * @return 订单退货申请
     */
    @Override
    public List<OrderReturnApply> selectOrderReturnApplyList(OrderReturnApply orderReturnApply)
    {
        return orderReturnApplyMapper.selectOrderReturnApplyList(orderReturnApply);
    }

    /**
     * 新增订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return 结果
     */
    @Override
    public int insertOrderReturnApply(OrderReturnApply orderReturnApply)
    {
        return orderReturnApplyMapper.insertOrderReturnApply(orderReturnApply);
    }

    /**
     * 修改订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return 结果
     */
    @Override
    public int updateOrderReturnApply(OrderReturnApply orderReturnApply)
    {
        return orderReturnApplyMapper.updateOrderReturnApply(orderReturnApply);
    }

    /**
     * 批量删除订单退货申请
     *
     * @param ids 需要删除的订单退货申请主键
     * @return 结果
     */
    @Override
    public int deleteOrderReturnApplyByIds(Long[] ids)
    {
        return orderReturnApplyMapper.deleteOrderReturnApplyByIds(ids);
    }

    /**
     * 删除订单退货申请信息
     *
     * @param id 订单退货申请主键
     * @return 结果
     */
    @Override
    public int deleteOrderReturnApplyById(Long id)
    {
        return orderReturnApplyMapper.deleteOrderReturnApplyById(id);
    }
}
