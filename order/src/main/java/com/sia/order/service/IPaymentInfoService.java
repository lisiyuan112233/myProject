package com.sia.order.service;

import java.util.List;
import com.sia.order.domain.PaymentInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 支付信息Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IPaymentInfoService extends IService<PaymentInfo> {
    /**
     * 查询支付信息
     *
     * @param id 支付信息主键
     * @return 支付信息
     */
    public PaymentInfo selectPaymentInfoById(Long id);

    /**
     * 查询支付信息列表
     *
     * @param paymentInfo 支付信息
     * @return 支付信息集合
     */
    public List<PaymentInfo> selectPaymentInfoList(PaymentInfo paymentInfo);

    /**
     * 新增支付信息
     *
     * @param paymentInfo 支付信息
     * @return 结果
     */
    public int insertPaymentInfo(PaymentInfo paymentInfo);

    /**
     * 修改支付信息
     *
     * @param paymentInfo 支付信息
     * @return 结果
     */
    public int updatePaymentInfo(PaymentInfo paymentInfo);

    /**
     * 批量删除支付信息
     *
     * @param ids 需要删除的支付信息主键集合
     * @return 结果
     */
    public int deletePaymentInfoByIds(Long[] ids);

    /**
     * 删除支付信息信息
     *
     * @param id 支付信息主键
     * @return 结果
     */
    public int deletePaymentInfoById(Long id);
}
