package com.sia.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.order.mapper.OrderReturnReasonMapper;
import com.sia.order.domain.OrderReturnReason;
import com.sia.order.service.IOrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 退货原因Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements IOrderReturnReasonService {
    @Autowired
    private OrderReturnReasonMapper orderReturnReasonMapper;

    /**
     * 查询退货原因
     *
     * @param id 退货原因主键
     * @return 退货原因
     */
    @Override
    public OrderReturnReason selectOrderReturnReasonById(Long id) {
        return orderReturnReasonMapper.selectOrderReturnReasonById(id);
    }

    /**
     * 查询退货原因列表
     *
     * @param orderReturnReason 退货原因
     * @return 退货原因
     */
    @Override
    public List<OrderReturnReason> selectOrderReturnReasonList(OrderReturnReason orderReturnReason) {
        return orderReturnReasonMapper.selectOrderReturnReasonList(orderReturnReason);
    }

    /**
     * 新增退货原因
     *
     * @param orderReturnReason 退货原因
     * @return 结果
     */
    @Override
    public int insertOrderReturnReason(OrderReturnReason orderReturnReason) {
        return orderReturnReasonMapper.insertOrderReturnReason(orderReturnReason);
    }

    /**
     * 修改退货原因
     *
     * @param orderReturnReason 退货原因
     * @return 结果
     */
    @Override
    public int updateOrderReturnReason(OrderReturnReason orderReturnReason) {
        return orderReturnReasonMapper.updateOrderReturnReason(orderReturnReason);
    }

    /**
     * 批量删除退货原因
     *
     * @param ids 需要删除的退货原因主键
     * @return 结果
     */
    @Override
    public int deleteOrderReturnReasonByIds(Long[] ids) {
        return orderReturnReasonMapper.deleteOrderReturnReasonByIds(ids);
    }

    /**
     * 删除退货原因信息
     *
     * @param id 退货原因主键
     * @return 结果
     */
    @Override
    public int deleteOrderReturnReasonById(Long id) {
        return orderReturnReasonMapper.deleteOrderReturnReasonById(id);
    }
}
