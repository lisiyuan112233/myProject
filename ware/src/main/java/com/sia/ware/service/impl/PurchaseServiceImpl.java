package com.sia.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.ware.domain.Purchase;
import com.sia.ware.service.IPurchaseService;
import com.sia.ware.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 采购信息Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements IPurchaseService
{
    @Autowired
    private PurchaseMapper purchaseMapper;

    /**
     * 查询采购信息
     *
     * @param id 采购信息主键
     * @return 采购信息
     */
    @Override
    public Purchase selectPurchaseById(Long id)
    {
        return purchaseMapper.selectPurchaseById(id);
    }

    /**
     * 查询采购信息列表
     *
     * @param purchase 采购信息
     * @return 采购信息
     */
    @Override
    public List<Purchase> selectPurchaseList(Purchase purchase)
    {
        return purchaseMapper.selectPurchaseList(purchase);
    }

    /**
     * 新增采购信息
     *
     * @param purchase 采购信息
     * @return 结果
     */
    @Override
    public int insertPurchase(Purchase purchase)
    {
        return purchaseMapper.insertPurchase(purchase);
    }

    /**
     * 修改采购信息
     *
     * @param purchase 采购信息
     * @return 结果
     */
    @Override
    public int updatePurchase(Purchase purchase)
    {
        return purchaseMapper.updatePurchase(purchase);
    }

    /**
     * 批量删除采购信息
     *
     * @param ids 需要删除的采购信息主键
     * @return 结果
     */
    @Override
    public int deletePurchaseByIds(Long[] ids)
    {
        return purchaseMapper.deletePurchaseByIds(ids);
    }

    /**
     * 删除采购信息信息
     *
     * @param id 采购信息主键
     * @return 结果
     */
    @Override
    public int deletePurchaseById(Long id)
    {
        return purchaseMapper.deletePurchaseById(id);
    }
}
