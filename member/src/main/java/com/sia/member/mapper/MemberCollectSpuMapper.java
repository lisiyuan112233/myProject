package com.sia.member.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.member.domain.MemberCollectSpu;

/**
 * 会员收藏的商品Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface MemberCollectSpuMapper extends BaseMapper<MemberCollectSpu> {
    /**
     * 查询会员收藏的商�?
     *
     * @param id 会员收藏的商品主�?
     * @return 会员收藏的商�?
     */
    public MemberCollectSpu selectMemberCollectSpuById(Long id);

    /**
     * 查询会员收藏的商品列�?
     *
     * @param memberCollectSpu 会员收藏的商�?
     * @return 会员收藏的商品集�?
     */
    public List<MemberCollectSpu> selectMemberCollectSpuList(MemberCollectSpu memberCollectSpu);

    /**
     * 新增会员收藏的商�?
     *
     * @param memberCollectSpu 会员收藏的商�?
     * @return 结果
     */
    public int insertMemberCollectSpu(MemberCollectSpu memberCollectSpu);

    /**
     * 修改会员收藏的商�?
     *
     * @param memberCollectSpu 会员收藏的商�?
     * @return 结果
     */
    public int updateMemberCollectSpu(MemberCollectSpu memberCollectSpu);

    /**
     * 删除会员收藏的商�?
     *
     * @param id 会员收藏的商品主�?
     * @return 结果
     */
    public int deleteMemberCollectSpuById(Long id);

    /**
     * 批量删除会员收藏的商�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMemberCollectSpuByIds(Long[] ids);
}
