package com.sia.coupon.service;

import java.util.List;
import com.sia.coupon.domain.SeckillSkuRelation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 秒杀活动商品关联Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface ISeckillSkuRelationService extends IService<SeckillSkuRelation> {
    /**
     * 查询秒杀活动商品关联
     *
     * @param id 秒杀活动商品关联主键
     * @return 秒杀活动商品关联
     */
    public SeckillSkuRelation selectSeckillSkuRelationById(Long id);

    /**
     * 查询秒杀活动商品关联列表
     *
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 秒杀活动商品关联集合
     */
    public List<SeckillSkuRelation> selectSeckillSkuRelationList(SeckillSkuRelation seckillSkuRelation);

    /**
     * 新增秒杀活动商品关联
     *
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 结果
     */
    public int insertSeckillSkuRelation(SeckillSkuRelation seckillSkuRelation);

    /**
     * 修改秒杀活动商品关联
     *
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 结果
     */
    public int updateSeckillSkuRelation(SeckillSkuRelation seckillSkuRelation);

    /**
     * 批量删除秒杀活动商品关联
     *
     * @param ids 需要删除的秒杀活动商品关联主键集合
     * @return 结果
     */
    public int deleteSeckillSkuRelationByIds(Long[] ids);

    /**
     * 删除秒杀活动商品关联信息
     *
     * @param id 秒杀活动商品关联主键
     * @return 结果
     */
    public int deleteSeckillSkuRelationById(Long id);
}
