package com.sia.order.service;

import java.util.List;
import com.sia.order.domain.OrderReturnApply;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 订单退货申请Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IOrderReturnApplyService extends IService<OrderReturnApply> {
    /**
     * 查询订单退货申请
     *
     * @param id 订单退货申请主键
     * @return 订单退货申请
     */
    public OrderReturnApply selectOrderReturnApplyById(Long id);

    /**
     * 查询订单退货申请列表
     *
     * @param orderReturnApply 订单退货申请
     * @return 订单退货申请集合
     */
    public List<OrderReturnApply> selectOrderReturnApplyList(OrderReturnApply orderReturnApply);

    /**
     * 新增订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return 结果
     */
    public int insertOrderReturnApply(OrderReturnApply orderReturnApply);

    /**
     * 修改订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return 结果
     */
    public int updateOrderReturnApply(OrderReturnApply orderReturnApply);

    /**
     * 批量删除订单退货申请
     *
     * @param ids 需要删除的订单退货申请主键集合
     * @return 结果
     */
    public int deleteOrderReturnApplyByIds(Long[] ids);

    /**
     * 删除订单退货申请信息
     *
     * @param id 订单退货申请主键
     * @return 结果
     */
    public int deleteOrderReturnApplyById(Long id);
}
