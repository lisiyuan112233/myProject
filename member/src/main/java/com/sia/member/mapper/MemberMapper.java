package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.Member;

/**
 * 会员Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface MemberMapper extends BaseMapper<Member> {
    /**
     * 查询会员
     *
     * @param id 会员主键
     * @return 会员
     */
    public Member selectMemberById(Long id);

    /**
     * 查询会员列表
     *
     * @param member 会员
     * @return 会员集合
     */
    public List<Member> selectMemberList(Member member);

    /**
     * 新增会员
     *
     * @param member 会员
     * @return 结果
     */
    public int insertMember(Member member);

    /**
     * 修改会员
     *
     * @param member 会员
     * @return 结果
     */
    public int updateMember(Member member);

    /**
     * 删除会员
     *
     * @param id 会员主键
     * @return 结果
     */
    public int deleteMemberById(Long id);

    /**
     * 批量删除会员
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMemberByIds(Long[] ids);
}
