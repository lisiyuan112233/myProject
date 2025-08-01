package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.GrowthChangeHistory;

/**
 * 成长值变化历史记录Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface GrowthChangeHistoryMapper extends BaseMapper<GrowthChangeHistory> {
    /**
     * 查询成长值变化历史记�?
     *
     * @param id 成长值变化历史记录主�?
     * @return 成长值变化历史记�?
     */
    public GrowthChangeHistory selectGrowthChangeHistoryById(Long id);

    /**
     * 查询成长值变化历史记录列�?
     *
     * @param growthChangeHistory 成长值变化历史记�?
     * @return 成长值变化历史记录集�?
     */
    public List<GrowthChangeHistory> selectGrowthChangeHistoryList(GrowthChangeHistory growthChangeHistory);

    /**
     * 新增成长值变化历史记�?
     *
     * @param growthChangeHistory 成长值变化历史记�?
     * @return 结果
     */
    public int insertGrowthChangeHistory(GrowthChangeHistory growthChangeHistory);

    /**
     * 修改成长值变化历史记�?
     *
     * @param growthChangeHistory 成长值变化历史记�?
     * @return 结果
     */
    public int updateGrowthChangeHistory(GrowthChangeHistory growthChangeHistory);

    /**
     * 删除成长值变化历史记�?
     *
     * @param id 成长值变化历史记录主�?
     * @return 结果
     */
    public int deleteGrowthChangeHistoryById(Long id);

    /**
     * 批量删除成长值变化历史记�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGrowthChangeHistoryByIds(Long[] ids);
}
