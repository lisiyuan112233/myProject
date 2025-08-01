package com.sia.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.order.mapper.RefundInfoMapper;
import com.sia.order.domain.RefundInfo;
import com.sia.order.service.IRefundInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 退款信息Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements IRefundInfoService
{
    @Autowired
    private RefundInfoMapper refundInfoMapper;

    /**
     * 查询退款信息
     *
     * @param id 退款信息主键
     * @return 退款信息
     */
    @Override
    public RefundInfo selectRefundInfoById(Long id)
    {
        return refundInfoMapper.selectRefundInfoById(id);
    }

    /**
     * 查询退款信息列表
     *
     * @param refundInfo 退款信息
     * @return 退款信息
     */
    @Override
    public List<RefundInfo> selectRefundInfoList(RefundInfo refundInfo)
    {
        return refundInfoMapper.selectRefundInfoList(refundInfo);
    }

    /**
     * 新增退款信息
     *
     * @param refundInfo 退款信息
     * @return 结果
     */
    @Override
    public int insertRefundInfo(RefundInfo refundInfo)
    {
        return refundInfoMapper.insertRefundInfo(refundInfo);
    }

    /**
     * 修改退款信息
     *
     * @param refundInfo 退款信息
     * @return 结果
     */
    @Override
    public int updateRefundInfo(RefundInfo refundInfo)
    {
        return refundInfoMapper.updateRefundInfo(refundInfo);
    }

    /**
     * 批量删除退款信息
     *
     * @param ids 需要删除的退款信息主键
     * @return 结果
     */
    @Override
    public int deleteRefundInfoByIds(Long[] ids)
    {
        return refundInfoMapper.deleteRefundInfoByIds(ids);
    }

    /**
     * 删除退款信息信息
     *
     * @param id 退款信息主键
     * @return 结果
     */
    @Override
    public int deleteRefundInfoById(Long id)
    {
        return refundInfoMapper.deleteRefundInfoById(id);
    }
}
