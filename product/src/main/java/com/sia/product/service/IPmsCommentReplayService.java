package com.sia.product.service;

import java.util.List;
import com.sia.product.domain.PmsCommentReplay;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品评价回复关系Service接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface IPmsCommentReplayService extends IService<PmsCommentReplay> {
    /**
     * 查询商品评价回复关系
     *
     * @param id 商品评价回复关系主键
     * @return 商品评价回复关系
     */
    public PmsCommentReplay selectPmsCommentReplayById(Long id);

    /**
     * 查询商品评价回复关系列表
     *
     * @param pmsCommentReplay 商品评价回复关系
     * @return 商品评价回复关系集合
     */
    public List<PmsCommentReplay> selectPmsCommentReplayList(PmsCommentReplay pmsCommentReplay);

    /**
     * 新增商品评价回复关系
     *
     * @param pmsCommentReplay 商品评价回复关系
     * @return 结果
     */
    public int insertPmsCommentReplay(PmsCommentReplay pmsCommentReplay);

    /**
     * 修改商品评价回复关系
     *
     * @param pmsCommentReplay 商品评价回复关系
     * @return 结果
     */
    public int updatePmsCommentReplay(PmsCommentReplay pmsCommentReplay);

    /**
     * 批量删除商品评价回复关系
     *
     * @param ids 需要删除的商品评价回复关系主键集合
     * @return 结果
     */
    public int deletePmsCommentReplayByIds(Long[] ids);

    /**
     * 删除商品评价回复关系信息
     *
     * @param id 商品评价回复关系主键
     * @return 结果
     */
    public int deletePmsCommentReplayById(Long id);
}
