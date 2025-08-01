package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.product.mapper.PmsSkuInfoMapper;
import com.sia.product.domain.PmsSkuInfo;
import com.sia.product.service.IPmsSkuInfoService;

/**
 * sku信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@Service
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoMapper, PmsSkuInfo> implements IPmsSkuInfoService {
    @Autowired
    private PmsSkuInfoMapper pmsSkuInfoMapper;

    /**
     * 查询sku信息
     *
     * @param skuId sku信息主键
     * @return sku信息
     */
    @Override
    public PmsSkuInfo selectPmsSkuInfoBySkuId(Long skuId) {
        return pmsSkuInfoMapper.selectPmsSkuInfoBySkuId(skuId);
    }

    /**
     * 查询sku信息列表
     *
     * @param pmsSkuInfo sku信息
     * @return sku信息
     */
    @Override
    public List<PmsSkuInfo> selectPmsSkuInfoList(PmsSkuInfo pmsSkuInfo) {
        return pmsSkuInfoMapper.selectPmsSkuInfoList(pmsSkuInfo);
    }

    /**
     * 新增sku信息
     *
     * @param pmsSkuInfo sku信息
     * @return 结果
     */
    @Override
    public int insertPmsSkuInfo(PmsSkuInfo pmsSkuInfo) {
            return pmsSkuInfoMapper.insertPmsSkuInfo(pmsSkuInfo);
    }

    /**
     * 修改sku信息
     *
     * @param pmsSkuInfo sku信息
     * @return 结果
     */
    @Override
    public int updatePmsSkuInfo(PmsSkuInfo pmsSkuInfo) {
        return pmsSkuInfoMapper.updatePmsSkuInfo(pmsSkuInfo);
    }

    /**
     * 批量删除sku信息
     *
     * @param skuIds 需要删除的sku信息主键
     * @return 结果
     */
    @Override
    public int deletePmsSkuInfoBySkuIds(Long[] skuIds) {
        return pmsSkuInfoMapper.deletePmsSkuInfoBySkuIds(skuIds);
    }

    /**
     * 删除sku信息信息
     *
     * @param skuId sku信息主键
     * @return 结果
     */
    @Override
    public int deletePmsSkuInfoBySkuId(Long skuId) {
        return pmsSkuInfoMapper.deletePmsSkuInfoBySkuId(skuId);
    }
}
