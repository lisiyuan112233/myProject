package com.sia.ware.service;

import java.util.List;
import com.sia.ware.domain.PurchaseDetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 【请填写功能名称】Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IPurchaseDetailService extends IService<PurchaseDetail> {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PurchaseDetail selectPurchaseDetailById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param purchaseDetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PurchaseDetail> selectPurchaseDetailList(PurchaseDetail purchaseDetail);

    /**
     * 新增【请填写功能名称】
     *
     * @param purchaseDetail 【请填写功能名称】
     * @return 结果
     */
    public int insertPurchaseDetail(PurchaseDetail purchaseDetail);

    /**
     * 修改【请填写功能名称】
     *
     * @param purchaseDetail 【请填写功能名称】
     * @return 结果
     */
    public int updatePurchaseDetail(PurchaseDetail purchaseDetail);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePurchaseDetailByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePurchaseDetailById(Long id);
}
