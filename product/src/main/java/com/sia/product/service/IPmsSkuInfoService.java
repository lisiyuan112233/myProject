package com.sia.product.service;

import java.util.List;
import com.sia.product.domain.PmsSkuInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * sku信息Service接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface IPmsSkuInfoService extends IService<PmsSkuInfo> {
    /**
     * 查询sku信息
     *
     * @param skuId sku信息主键
     * @return sku信息
     */
    public PmsSkuInfo selectPmsSkuInfoBySkuId(Long skuId);

    /**
     * 查询sku信息列表
     *
     * @param pmsSkuInfo sku信息
     * @return sku信息集合
     */
    public List<PmsSkuInfo> selectPmsSkuInfoList(PmsSkuInfo pmsSkuInfo);

    /**
     * 新增sku信息
     *
     * @param pmsSkuInfo sku信息
     * @return 结果
     */
    public int insertPmsSkuInfo(PmsSkuInfo pmsSkuInfo);

    /**
     * 修改sku信息
     *
     * @param pmsSkuInfo sku信息
     * @return 结果
     */
    public int updatePmsSkuInfo(PmsSkuInfo pmsSkuInfo);

    /**
     * 批量删除sku信息
     *
     * @param skuIds 需要删除的sku信息主键集合
     * @return 结果
     */
    public int deletePmsSkuInfoBySkuIds(Long[] skuIds);

    /**
     * 删除sku信息信息
     *
     * @param skuId sku信息主键
     * @return 结果
     */
    public int deletePmsSkuInfoBySkuId(Long skuId);
}
