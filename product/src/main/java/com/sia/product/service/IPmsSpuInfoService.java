package com.sia.product.service;

import java.util.List;
import com.sia.product.domain.PmsSpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * spu信息Service接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface IPmsSpuInfoService extends IService<PmsSpuInfo> {
    /**
     * 查询spu信息
     *
     * @param id spu信息主键
     * @return spu信息
     */
    public PmsSpuInfo selectPmsSpuInfoById(Long id);

    /**
     * 查询spu信息列表
     *
     * @param pmsSpuInfo spu信息
     * @return spu信息集合
     */
    public List<PmsSpuInfo> selectPmsSpuInfoList(PmsSpuInfo pmsSpuInfo);

    /**
     * 新增spu信息
     *
     * @param pmsSpuInfo spu信息
     * @return 结果
     */
    public int insertPmsSpuInfo(PmsSpuInfo pmsSpuInfo);

    /**
     * 修改spu信息
     *
     * @param pmsSpuInfo spu信息
     * @return 结果
     */
    public int updatePmsSpuInfo(PmsSpuInfo pmsSpuInfo);

    /**
     * 批量删除spu信息
     *
     * @param ids 需要删除的spu信息主键集合
     * @return 结果
     */
    public int deletePmsSpuInfoByIds(Long[] ids);

    /**
     * 删除spu信息信息
     *
     * @param id spu信息主键
     * @return 结果
     */
    public int deletePmsSpuInfoById(Long id);
}
