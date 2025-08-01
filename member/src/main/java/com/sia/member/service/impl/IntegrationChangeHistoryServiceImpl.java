package com.sia.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.member.mapper.IntegrationChangeHistoryMapper;
import com.sia.member.domain.IntegrationChangeHistory;
import com.sia.member.service.IIntegrationChangeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IIntegrationChangeHistoryService
{
    @Autowired
    private IntegrationChangeHistoryMapper integrationChangeHistoryMapper;

    /**
     * 查询积分变化历史记录
     *
     * @param id 积分变化历史记录主键
     * @return 积分变化历史记录
     */
    @Override
    public IntegrationChangeHistory selectIntegrationChangeHistoryById(Long id)
    {
        return integrationChangeHistoryMapper.selectIntegrationChangeHistoryById(id);
    }

    /**
     * 查询积分变化历史记录列表
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 积分变化历史记录
     */
    @Override
    public List<IntegrationChangeHistory> selectIntegrationChangeHistoryList(IntegrationChangeHistory integrationChangeHistory)
    {
        return integrationChangeHistoryMapper.selectIntegrationChangeHistoryList(integrationChangeHistory);
    }

    /**
     * 新增积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 结果
     */
    @Override
    public int insertIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory)
    {
        return integrationChangeHistoryMapper.insertIntegrationChangeHistory(integrationChangeHistory);
    }

    /**
     * 修改积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return 结果
     */
    @Override
    public int updateIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory)
    {
        return integrationChangeHistoryMapper.updateIntegrationChangeHistory(integrationChangeHistory);
    }

    /**
     * 批量删除积分变化历史记录
     *
     * @param ids 需要删除的积分变化历史记录主键
     * @return 结果
     */
    @Override
    public int deleteIntegrationChangeHistoryByIds(Long[] ids)
    {
        return integrationChangeHistoryMapper.deleteIntegrationChangeHistoryByIds(ids);
    }

    /**
     * 删除积分变化历史记录信息
     *
     * @param id 积分变化历史记录主键
     * @return 结果
     */
    @Override
    public int deleteIntegrationChangeHistoryById(Long id)
    {
        return integrationChangeHistoryMapper.deleteIntegrationChangeHistoryById(id);
    }
}
