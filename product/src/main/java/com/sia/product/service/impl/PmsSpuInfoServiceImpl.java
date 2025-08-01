package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.product.domain.PmsSpuInfo;
import com.sia.product.mapper.PmsSpuInfoMapper;
import com.sia.product.service.IPmsSpuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * spu信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@Service
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoMapper, PmsSpuInfo> implements IPmsSpuInfoService {
    @Autowired
    private PmsSpuInfoMapper pmsSpuInfoMapper;

    /**
     * 查询spu信息
     *
     * @param id spu信息主键
     * @return spu信息
     */
    @Override
    public PmsSpuInfo selectPmsSpuInfoById(Long id) {
        return pmsSpuInfoMapper.selectPmsSpuInfoById(id);
    }

    /**
     * 查询spu信息列表
     *
     * @param pmsSpuInfo spu信息
     * @return spu信息
     */
    @Override
    public List<PmsSpuInfo> selectPmsSpuInfoList(PmsSpuInfo pmsSpuInfo) {
        return pmsSpuInfoMapper.selectPmsSpuInfoList(pmsSpuInfo);
    }

    /**
     * 新增spu信息
     *
     * @param pmsSpuInfo spu信息
     * @return 结果
     */
    @Override
    public int insertPmsSpuInfo(PmsSpuInfo pmsSpuInfo) {
        return pmsSpuInfoMapper.insertPmsSpuInfo(pmsSpuInfo);
    }

    /**
     * 修改spu信息
     *
     * @param pmsSpuInfo spu信息
     * @return 结果
     */
    @Override
    public int updatePmsSpuInfo(PmsSpuInfo pmsSpuInfo) {
        return pmsSpuInfoMapper.updatePmsSpuInfo(pmsSpuInfo);
    }

    /**
     * 批量删除spu信息
     *
     * @param ids 需要删除的spu信息主键
     * @return 结果
     */
    @Override
    public int deletePmsSpuInfoByIds(Long[] ids) {
        return pmsSpuInfoMapper.deletePmsSpuInfoByIds(ids);
    }

    /**
     * 删除spu信息信息
     *
     * @param id spu信息主键
     * @return 结果
     */
    @Override
    public int deletePmsSpuInfoById(Long id) {
        return pmsSpuInfoMapper.deletePmsSpuInfoById(id);
    }
}
