package com.sia.member.service;

import java.util.List;
import com.sia.member.domain.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 会员等级Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IMemberLevelService extends IService<MemberLevel> {
    /**
     * 查询会员等级
     *
     * @param id 会员等级主键
     * @return 会员等级
     */
    public MemberLevel selectMemberLevelById(Long id);

    /**
     * 查询会员等级列表
     *
     * @param memberLevel 会员等级
     * @return 会员等级集合
     */
    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

    /**
     * 新增会员等级
     *
     * @param memberLevel 会员等级
     * @return 结果
     */
    public int insertMemberLevel(MemberLevel memberLevel);

    /**
     * 修改会员等级
     *
     * @param memberLevel 会员等级
     * @return 结果
     */
    public int updateMemberLevel(MemberLevel memberLevel);

    /**
     * 批量删除会员等级
     *
     * @param ids 需要删除的会员等级主键集合
     * @return 结果
     */
    public int deleteMemberLevelByIds(Long[] ids);

    /**
     * 删除会员等级信息
     *
     * @param id 会员等级主键
     * @return 结果
     */
    public int deleteMemberLevelById(Long id);
}
