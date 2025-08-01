package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.product.mapper.PmsSpuInfoDescMapper;
import com.sia.product.domain.PmsSpuInfoDesc;
import com.sia.product.service.IPmsSpuInfoDescService;

/**
 * spu信息介绍Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@Service
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescMapper, PmsSpuInfoDesc> implements IPmsSpuInfoDescService {
    @Autowired
    private PmsSpuInfoDescMapper pmsSpuInfoDescMapper;

    /**
     * 查询spu信息介绍
     *
     * @param spuId spu信息介绍主键
     * @return spu信息介绍
     */
    @Override
    public PmsSpuInfoDesc selectPmsSpuInfoDescBySpuId(Long spuId) {
        return pmsSpuInfoDescMapper.selectPmsSpuInfoDescBySpuId(spuId);
    }

    /**
     * 查询spu信息介绍列表
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return spu信息介绍
     */
    @Override
    public List<PmsSpuInfoDesc> selectPmsSpuInfoDescList(PmsSpuInfoDesc pmsSpuInfoDesc) {
        return pmsSpuInfoDescMapper.selectPmsSpuInfoDescList(pmsSpuInfoDesc);
    }

    /**
     * 新增spu信息介绍
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return 结果
     */
    @Override
    public int insertPmsSpuInfoDesc(PmsSpuInfoDesc pmsSpuInfoDesc) {
            return pmsSpuInfoDescMapper.insertPmsSpuInfoDesc(pmsSpuInfoDesc);
    }

    /**
     * 修改spu信息介绍
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return 结果
     */
    @Override
    public int updatePmsSpuInfoDesc(PmsSpuInfoDesc pmsSpuInfoDesc) {
        return pmsSpuInfoDescMapper.updatePmsSpuInfoDesc(pmsSpuInfoDesc);
    }

    /**
     * 批量删除spu信息介绍
     *
     * @param spuIds 需要删除的spu信息介绍主键
     * @return 结果
     */
    @Override
    public int deletePmsSpuInfoDescBySpuIds(Long[] spuIds) {
        return pmsSpuInfoDescMapper.deletePmsSpuInfoDescBySpuIds(spuIds);
    }

    /**
     * 删除spu信息介绍信息
     *
     * @param spuId spu信息介绍主键
     * @return 结果
     */
    @Override
    public int deletePmsSpuInfoDescBySpuId(Long spuId) {
        return pmsSpuInfoDescMapper.deletePmsSpuInfoDescBySpuId(spuId);
    }
}
