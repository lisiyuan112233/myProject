package com.sia.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.member.mapper.MemberCollectSubjectMapper;
import com.sia.member.domain.MemberCollectSubject;
import com.sia.member.service.IMemberCollectSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的专题活动Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectMapper, MemberCollectSubject> implements IMemberCollectSubjectService
{
    @Autowired
    private MemberCollectSubjectMapper memberCollectSubjectMapper;

    /**
     * 查询会员收藏的专题活动
     *
     * @param id 会员收藏的专题活动主键
     * @return 会员收藏的专题活动
     */
    @Override
    public MemberCollectSubject selectMemberCollectSubjectById(Long id)
    {
        return memberCollectSubjectMapper.selectMemberCollectSubjectById(id);
    }

    /**
     * 查询会员收藏的专题活动列表
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 会员收藏的专题活动
     */
    @Override
    public List<MemberCollectSubject> selectMemberCollectSubjectList(MemberCollectSubject memberCollectSubject)
    {
        return memberCollectSubjectMapper.selectMemberCollectSubjectList(memberCollectSubject);
    }

    /**
     * 新增会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 结果
     */
    @Override
    public int insertMemberCollectSubject(MemberCollectSubject memberCollectSubject)
    {
        return memberCollectSubjectMapper.insertMemberCollectSubject(memberCollectSubject);
    }

    /**
     * 修改会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 结果
     */
    @Override
    public int updateMemberCollectSubject(MemberCollectSubject memberCollectSubject)
    {
        return memberCollectSubjectMapper.updateMemberCollectSubject(memberCollectSubject);
    }

    /**
     * 批量删除会员收藏的专题活动
     *
     * @param ids 需要删除的会员收藏的专题活动主键
     * @return 结果
     */
    @Override
    public int deleteMemberCollectSubjectByIds(Long[] ids)
    {
        return memberCollectSubjectMapper.deleteMemberCollectSubjectByIds(ids);
    }

    /**
     * 删除会员收藏的专题活动信息
     *
     * @param id 会员收藏的专题活动主键
     * @return 结果
     */
    @Override
    public int deleteMemberCollectSubjectById(Long id)
    {
        return memberCollectSubjectMapper.deleteMemberCollectSubjectById(id);
    }
}
