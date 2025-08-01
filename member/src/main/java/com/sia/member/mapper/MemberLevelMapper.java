package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.MemberLevel;

/**
 * 会员等级Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface MemberLevelMapper extends BaseMapper<MemberLevel> {
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
     * 删除会员等级
     *
     * @param id 会员等级主键
     * @return 结果
     */
    public int deleteMemberLevelById(Long id);

    /**
     * 批量删除会员等级
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMemberLevelByIds(Long[] ids);
}
