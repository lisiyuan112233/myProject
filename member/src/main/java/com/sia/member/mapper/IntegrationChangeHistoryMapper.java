package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.IntegrationChangeHistory;

/**
 * 积分变化历史记录Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IntegrationChangeHistoryMapper extends BaseMapper<IntegrationChangeHistory> {
    /**
     * 查询积分变化历史记录
     *
     * @param id 积分变化历史记录主键
     * @return 积分变化历史记录
     */
    public IntegrationChangeHistory selectIntegrationChangeHistoryById(Long id);

    /**
     * 查询积分变化历史记录列表
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 积分变化历史记录集合
     */
    public List<IntegrationChangeHistory> selectIntegrationChangeHistoryList(IntegrationChangeHistory integrationChangeHistory);

    /**
     * 新增积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 结果
     */
    public int insertIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory);

    /**
     * 修改积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 结果
     */
    public int updateIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory);

    /**
     * 删除积分变化历史记录
     *
     * @param id 积分变化历史记录主键
     * @return 结果
     */
    public int deleteIntegrationChangeHistoryById(Long id);

    /**
     * 批量删除积分变化历史记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIntegrationChangeHistoryByIds(Long[] ids);
}
