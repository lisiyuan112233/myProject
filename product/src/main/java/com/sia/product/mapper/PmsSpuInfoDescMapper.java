package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsSpuInfoDesc;

/**
 * spu信息介绍Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsSpuInfoDescMapper extends BaseMapper<PmsSpuInfoDesc> {
    /**
     * 查询spu信息介绍
     *
     * @param spuId spu信息介绍主键
     * @return spu信息介绍
     */
    public PmsSpuInfoDesc selectPmsSpuInfoDescBySpuId(Long spuId);

    /**
     * 查询spu信息介绍列表
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return spu信息介绍集合
     */
    public List<PmsSpuInfoDesc> selectPmsSpuInfoDescList(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 新增spu信息介绍
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return 结果
     */
    public int insertPmsSpuInfoDesc(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 修改spu信息介绍
     *
     * @param pmsSpuInfoDesc spu信息介绍
     * @return 结果
     */
    public int updatePmsSpuInfoDesc(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 删除spu信息介绍
     *
     * @param spuId spu信息介绍主键
     * @return 结果
     */
    public int deletePmsSpuInfoDescBySpuId(Long spuId);

    /**
     * 批量删除spu信息介绍
     *
     * @param spuIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsSpuInfoDescBySpuIds(Long[] spuIds);
}
