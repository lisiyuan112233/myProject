package com.sia.order.service;

import java.util.List;
import com.sia.order.domain.RefundInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 退款信息Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IRefundInfoService extends IService<RefundInfo> {
    /**
     * 查询退款信息
     *
     * @param id 退款信息主键
     * @return 退款信息
     */
    public RefundInfo selectRefundInfoById(Long id);

    /**
     * 查询退款信息列表
     *
     * @param refundInfo 退款信息
     * @return 退款信息集合
     */
    public List<RefundInfo> selectRefundInfoList(RefundInfo refundInfo);

    /**
     * 新增退款信息
     *
     * @param refundInfo 退款信息
     * @return 结果
     */
    public int insertRefundInfo(RefundInfo refundInfo);

    /**
     * 修改退款信息
     *
     * @param refundInfo 退款信息
     * @return 结果
     */
    public int updateRefundInfo(RefundInfo refundInfo);

    /**
     * 批量删除退款信息
     *
     * @param ids 需要删除的退款信息主键集合
     * @return 结果
     */
    public int deleteRefundInfoByIds(Long[] ids);

    /**
     * 删除退款信息信息
     *
     * @param id 退款信息主键
     * @return 结果
     */
    public int deleteRefundInfoById(Long id);
}
