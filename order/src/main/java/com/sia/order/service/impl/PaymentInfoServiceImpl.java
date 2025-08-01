package com.sia.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.order.mapper.PaymentInfoMapper;
import com.sia.order.domain.PaymentInfo;
import com.sia.order.service.IPaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 支付信息表Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements IPaymentInfoService
{
    @Autowired
    private PaymentInfoMapper paymentInfoMapper;

    /**
     * 查询支付信息表
     *
     * @param id 支付信息表主键
     * @return 支付信息表
     */
    @Override
    public PaymentInfo selectPaymentInfoById(Long id)
    {
        return paymentInfoMapper.selectPaymentInfoById(id);
    }

    /**
     * 查询支付信息表列表
     *
     * @param paymentInfo 支付信息表
     * @return 支付信息表
     */
    @Override
    public List<PaymentInfo> selectPaymentInfoList(PaymentInfo paymentInfo)
    {
        return paymentInfoMapper.selectPaymentInfoList(paymentInfo);
    }

    /**
     * 新增支付信息表
     *
     * @param paymentInfo 支付信息表
     * @return 结果
     */
    @Override
    public int insertPaymentInfo(PaymentInfo paymentInfo)
    {
        return paymentInfoMapper.insertPaymentInfo(paymentInfo);
    }

    /**
     * 修改支付信息表
     *
     * @param paymentInfo 支付信息表
     * @return 结果
     */
    @Override
    public int updatePaymentInfo(PaymentInfo paymentInfo)
    {
        return paymentInfoMapper.updatePaymentInfo(paymentInfo);
    }

    /**
     * 批量删除支付信息表
     *
     * @param ids 需要删除的支付信息表主键
     * @return 结果
     */
    @Override
    public int deletePaymentInfoByIds(Long[] ids)
    {
        return paymentInfoMapper.deletePaymentInfoByIds(ids);
    }

    /**
     * 删除支付信息表信息
     *
     * @param id 支付信息表主键
     * @return 结果
     */
    @Override
    public int deletePaymentInfoById(Long id)
    {
        return paymentInfoMapper.deletePaymentInfoById(id);
    }
}
