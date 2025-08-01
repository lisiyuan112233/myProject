package com.sia.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.member.mapper.MemberLoginLogMapper;
import com.sia.member.domain.MemberLoginLog;
import com.sia.member.service.IMemberLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements IMemberLoginLogService
{
    @Autowired
    private MemberLoginLogMapper memberLoginLogMapper;

    /**
     * 查询会员登录记录
     *
     * @param id 会员登录记录主键
     * @return 会员登录记录
     */
    @Override
    public MemberLoginLog selectMemberLoginLogById(Long id)
    {
        return memberLoginLogMapper.selectMemberLoginLogById(id);
    }

    /**
     * 查询会员登录记录列表
     *
     * @param memberLoginLog 会员登录记录
     * @return 会员登录记录
     */
    @Override
    public List<MemberLoginLog> selectMemberLoginLogList(MemberLoginLog memberLoginLog)
    {
        return memberLoginLogMapper.selectMemberLoginLogList(memberLoginLog);
    }

    /**
     * 新增会员登录记录
     *
     * @param memberLoginLog 会员登录记录
     * @return 结果
     */
    @Override
    public int insertMemberLoginLog(MemberLoginLog memberLoginLog)
    {
        return memberLoginLogMapper.insertMemberLoginLog(memberLoginLog);
    }

    /**
     * 修改会员登录记录
     *
     * @param memberLoginLog 会员登录记录
     * @return 结果
     */
    @Override
    public int updateMemberLoginLog(MemberLoginLog memberLoginLog)
    {
        return memberLoginLogMapper.updateMemberLoginLog(memberLoginLog);
    }

    /**
     * 批量删除会员登录记录
     *
     * @param ids 需要删除的会员登录记录主键
     * @return 结果
     */
    @Override
    public int deleteMemberLoginLogByIds(Long[] ids)
    {
        return memberLoginLogMapper.deleteMemberLoginLogByIds(ids);
    }

    /**
     * 删除会员登录记录信息
     *
     * @param id 会员登录记录主键
     * @return 结果
     */
    @Override
    public int deleteMemberLoginLogById(Long id)
    {
        return memberLoginLogMapper.deleteMemberLoginLogById(id);
    }
}
