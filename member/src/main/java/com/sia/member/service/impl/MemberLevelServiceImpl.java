package com.sia.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.member.mapper.MemberLevelMapper;
import com.sia.member.domain.MemberLevel;
import com.sia.member.service.IMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 会员等级Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements IMemberLevelService
{
    @Autowired
    private MemberLevelMapper memberLevelMapper;

    /**
     * 查询会员等级
     *
     * @param id 会员等级主键
     * @return 会员等级
     */
    @Override
    public MemberLevel selectMemberLevelById(Long id)
    {
        return memberLevelMapper.selectMemberLevelById(id);
    }

    /**
     * 查询会员等级列表
     *
     * @param memberLevel 会员等级
     * @return 会员等级
     */
    @Override
    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel)
    {
        return memberLevelMapper.selectMemberLevelList(memberLevel);
    }

    /**
     * 新增会员等级
     *
     * @param memberLevel 会员等级
     * @return 结果
     */
    @Override
    public int insertMemberLevel(MemberLevel memberLevel)
    {
        return memberLevelMapper.insertMemberLevel(memberLevel);
    }

    /**
     * 修改会员等级
     *
     * @param memberLevel 会员等级
     * @return 结果
     */
    @Override
    public int updateMemberLevel(MemberLevel memberLevel)
    {
        return memberLevelMapper.updateMemberLevel(memberLevel);
    }

    /**
     * 批量删除会员等级
     *
     * @param ids 需要删除的会员等级主键
     * @return 结果
     */
    @Override
    public int deleteMemberLevelByIds(Long[] ids)
    {
        return memberLevelMapper.deleteMemberLevelByIds(ids);
    }

    /**
     * 删除会员等级信息
     *
     * @param id 会员等级主键
     * @return 结果
     */
    @Override
    public int deleteMemberLevelById(Long id)
    {
        return memberLevelMapper.deleteMemberLevelById(id);
    }
}
