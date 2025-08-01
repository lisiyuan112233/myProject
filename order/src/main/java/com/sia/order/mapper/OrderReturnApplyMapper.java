package com.sia.order.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.order.domain.OrderReturnApply;

/**
 * 订单退货申请Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface OrderReturnApplyMapper extends BaseMapper<OrderReturnApply> {
    /**
     * 查询订单退货申�?
     *
     * @param id 订单退货申请主�?
     * @return 订单退货申�?
     */
    public OrderReturnApply selectOrderReturnApplyById(Long id);

    /**
     * 查询订单退货申请列�?
     *
     * @param orderReturnApply 订单退货申�?
     * @return 订单退货申请集�?
     */
    public List<OrderReturnApply> selectOrderReturnApplyList(OrderReturnApply orderReturnApply);

    /**
     * 新增订单退货申�?
     *
     * @param orderReturnApply 订单退货申�?
     * @return 结果
     */
    public int insertOrderReturnApply(OrderReturnApply orderReturnApply);

    /**
     * 修改订单退货申�?
     *
     * @param orderReturnApply 订单退货申�?
     * @return 结果
     */
    public int updateOrderReturnApply(OrderReturnApply orderReturnApply);

    /**
     * 删除订单退货申�?
     *
     * @param id 订单退货申请主�?
     * @return 结果
     */
    public int deleteOrderReturnApplyById(Long id);

    /**
     * 批量删除订单退货申�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderReturnApplyByIds(Long[] ids);
}
