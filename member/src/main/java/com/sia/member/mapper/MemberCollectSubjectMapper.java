package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.MemberCollectSubject;

/**
 * 会员收藏的专题活动Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface MemberCollectSubjectMapper extends BaseMapper<MemberCollectSubject> {
    /**
     * 查询会员收藏的专题活�?
     *
     * @param id 会员收藏的专题活动主�?
     * @return 会员收藏的专题活�?
     */
    public MemberCollectSubject selectMemberCollectSubjectById(Long id);

    /**
     * 查询会员收藏的专题活动列�?
     *
     * @param memberCollectSubject 会员收藏的专题活�?
     * @return 会员收藏的专题活动集�?
     */
    public List<MemberCollectSubject> selectMemberCollectSubjectList(MemberCollectSubject memberCollectSubject);

    /**
     * 新增会员收藏的专题活�?
     *
     * @param memberCollectSubject 会员收藏的专题活�?
     * @return 结果
     */
    public int insertMemberCollectSubject(MemberCollectSubject memberCollectSubject);

    /**
     * 修改会员收藏的专题活�?
     *
     * @param memberCollectSubject 会员收藏的专题活�?
     * @return 结果
     */
    public int updateMemberCollectSubject(MemberCollectSubject memberCollectSubject);

    /**
     * 删除会员收藏的专题活�?
     *
     * @param id 会员收藏的专题活动主�?
     * @return 结果
     */
    public int deleteMemberCollectSubjectById(Long id);

    /**
     * 批量删除会员收藏的专题活�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMemberCollectSubjectByIds(Long[] ids);
}
