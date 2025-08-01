package com.sia.member.service;

import java.util.List;
import com.sia.member.domain.MemberStatisticsInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 会员统计信息Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IMemberStatisticsInfoService extends IService<MemberStatisticsInfo> {
    /**
     * 查询会员统计信息
     *
     * @param id 会员统计信息主键
     * @return 会员统计信息
     */
    public MemberStatisticsInfo selectMemberStatisticsInfoById(Long id);

    /**
     * 查询会员统计信息列表
     *
     * @param memberStatisticsInfo 会员统计信息
     * @return 会员统计信息集合
     */
    public List<MemberStatisticsInfo> selectMemberStatisticsInfoList(MemberStatisticsInfo memberStatisticsInfo);

    /**
     * 新增会员统计信息
     *
     * @param memberStatisticsInfo 会员统计信息
     * @return 结果
     */
    public int insertMemberStatisticsInfo(MemberStatisticsInfo memberStatisticsInfo);

    /**
     * 修改会员统计信息
     *
     * @param memberStatisticsInfo 会员统计信息
     * @return 结果
     */
    public int updateMemberStatisticsInfo(MemberStatisticsInfo memberStatisticsInfo);

    /**
     * 批量删除会员统计信息
     *
     * @param ids 需要删除的会员统计信息主键集合
     * @return 结果
     */
    public int deleteMemberStatisticsInfoByIds(Long[] ids);

    /**
     * 删除会员统计信息信息
     *
     * @param id 会员统计信息主键
     * @return 结果
     */
    public int deleteMemberStatisticsInfoById(Long id);
}
