package com.sia.member.service;

import java.util.List;
import com.sia.member.domain.MemberCollectSubject;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 会员收藏的专题活动Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IMemberCollectSubjectService extends IService<MemberCollectSubject> {
    /**
     * 查询会员收藏的专题活动
     *
     * @param id 会员收藏的专题活动主键
     * @return 会员收藏的专题活动
     */
    public MemberCollectSubject selectMemberCollectSubjectById(Long id);

    /**
     * 查询会员收藏的专题活动列表
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 会员收藏的专题活动集合
     */
    public List<MemberCollectSubject> selectMemberCollectSubjectList(MemberCollectSubject memberCollectSubject);

    /**
     * 新增会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 结果
     */
    public int insertMemberCollectSubject(MemberCollectSubject memberCollectSubject);

    /**
     * 修改会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return 结果
     */
    public int updateMemberCollectSubject(MemberCollectSubject memberCollectSubject);

    /**
     * 批量删除会员收藏的专题活动
     *
     * @param ids 需要删除的会员收藏的专题活动主键集合
     * @return 结果
     */
    public int deleteMemberCollectSubjectByIds(Long[] ids);

    /**
     * 删除会员收藏的专题活动信息
     *
     * @param id 会员收藏的专题活动主键
     * @return 结果
     */
    public int deleteMemberCollectSubjectById(Long id);
}
