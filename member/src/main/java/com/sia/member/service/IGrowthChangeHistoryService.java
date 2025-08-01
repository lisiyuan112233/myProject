package com.sia.member.service;

import java.util.List;
import com.sia.member.domain.GrowthChangeHistory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 成长值变化历史记录Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IGrowthChangeHistoryService extends IService<GrowthChangeHistory> {
    /**
     * 查询成长值变化历史记录
     *
     * @param id 成长值变化历史记录主键
     * @return 成长值变化历史记录
     */
    public GrowthChangeHistory selectGrowthChangeHistoryById(Long id);

    /**
     * 查询成长值变化历史记录列表
     *
     * @param growthChangeHistory 成长值变化历史记录
     * @return 成长值变化历史记录集合
     */
    public List<GrowthChangeHistory> selectGrowthChangeHistoryList(GrowthChangeHistory growthChangeHistory);

    /**
     * 新增成长值变化历史记录
     *
     * @param growthChangeHistory 成长值变化历史记录
     * @return 结果
     */
    public int insertGrowthChangeHistory(GrowthChangeHistory growthChangeHistory);

    /**
     * 修改成长值变化历史记录
     *
     * @param growthChangeHistory 成长值变化历史记录
     * @return 结果
     */
    public int updateGrowthChangeHistory(GrowthChangeHistory growthChangeHistory);

    /**
     * 批量删除成长值变化历史记录
     *
     * @param ids 需要删除的成长值变化历史记录主键集合
     * @return 结果
     */
    public int deleteGrowthChangeHistoryByIds(Long[] ids);

    /**
     * 删除成长值变化历史记录信息
     *
     * @param id 成长值变化历史记录主键
     * @return 结果
     */
    public int deleteGrowthChangeHistoryById(Long id);
}
