package com.sia.order.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.order.domain.OrderReturnReason;

/**
 * 退货原因Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface OrderReturnReasonMapper extends BaseMapper<OrderReturnReason> {
    /**
     * 查询退货原�?
     *
     * @param id 退货原因主�?
     * @return 退货原�?
     */
    public OrderReturnReason selectOrderReturnReasonById(Long id);

    /**
     * 查询退货原因列�?
     *
     * @param orderReturnReason 退货原�?
     * @return 退货原因集�?
     */
    public List<OrderReturnReason> selectOrderReturnReasonList(OrderReturnReason orderReturnReason);

    /**
     * 新增退货原�?
     *
     * @param orderReturnReason 退货原�?
     * @return 结果
     */
    public int insertOrderReturnReason(OrderReturnReason orderReturnReason);

    /**
     * 修改退货原�?
     *
     * @param orderReturnReason 退货原�?
     * @return 结果
     */
    public int updateOrderReturnReason(OrderReturnReason orderReturnReason);

    /**
     * 删除退货原�?
     *
     * @param id 退货原因主�?
     * @return 结果
     */
    public int deleteOrderReturnReasonById(Long id);

    /**
     * 批量删除退货原�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrderReturnReasonByIds(Long[] ids);
}
