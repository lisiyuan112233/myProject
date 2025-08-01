package com.sia.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.ware.mapper.PurchaseDetailMapper;
import com.sia.ware.domain.PurchaseDetail;
import com.sia.ware.service.IPurchaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购信息详情Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailMapper, PurchaseDetail> implements IPurchaseDetailService
{
    @Autowired
    private PurchaseDetailMapper purchaseDetailMapper;

    /**
     * 查询采购信息详情
     *
     * @param id 采购信息详情主键
     * @return 采购信息详情
     */
    @Override
    public PurchaseDetail selectPurchaseDetailById(Long id)
    {
        return purchaseDetailMapper.selectPurchaseDetailById(id);
    }

    /**
     * 查询采购信息详情列表
     *
     * @param purchaseDetail 采购信息详情
     * @return 采购信息详情
     */
    @Override
    public List<PurchaseDetail> selectPurchaseDetailList(PurchaseDetail purchaseDetail)
    {
        return purchaseDetailMapper.selectPurchaseDetailList(purchaseDetail);
    }

    /**
     * 新增采购信息详情
     *
     * @param purchaseDetail 采购信息详情
     * @return 结果
     */
    @Override
    public int insertPurchaseDetail(PurchaseDetail purchaseDetail)
    {
        return purchaseDetailMapper.insertPurchaseDetail(purchaseDetail);
    }

    /**
     * 修改采购信息详情
     *
     * @param purchaseDetail 采购信息详情
     * @return 结果
     */
    @Override
    public int updatePurchaseDetail(PurchaseDetail purchaseDetail)
    {
        return purchaseDetailMapper.updatePurchaseDetail(purchaseDetail);
    }

    /**
     * 批量删除采购信息详情
     *
     * @param ids 需要删除的采购信息详情主键
     * @return 结果
     */
    @Override
    public int deletePurchaseDetailByIds(Long[] ids)
    {
        return purchaseDetailMapper.deletePurchaseDetailByIds(ids);
    }

    /**
     * 删除采购信息详情信息
     *
     * @param id 采购信息详情主键
     * @return 结果
     */
    @Override
    public int deletePurchaseDetailById(Long id)
    {
        return purchaseDetailMapper.deletePurchaseDetailById(id);
    }
}
