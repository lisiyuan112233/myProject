package com.sia.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.coupon.mapper.SeckillSkuRelationMapper;
import com.sia.coupon.domain.SeckillSkuRelation;
import com.sia.coupon.service.ISeckillSkuRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 秒杀活动商品关联Service业务层处理
 * 
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationMapper, SeckillSkuRelation> implements ISeckillSkuRelationService
{
    @Autowired
    private SeckillSkuRelationMapper seckillSkuRelationMapper;

    /**
     * 查询秒杀活动商品关联
     * 
     * @param id 秒杀活动商品关联主键
     * @return 秒杀活动商品关联
     */
    @Override
    public SeckillSkuRelation selectSeckillSkuRelationById(Long id)
    {
        return seckillSkuRelationMapper.selectSeckillSkuRelationById(id);
    }

    /**
     * 查询秒杀活动商品关联列表
     * 
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 秒杀活动商品关联
     */
    @Override
    public List<SeckillSkuRelation> selectSeckillSkuRelationList(SeckillSkuRelation seckillSkuRelation)
    {
        return seckillSkuRelationMapper.selectSeckillSkuRelationList(seckillSkuRelation);
    }

    /**
     * 新增秒杀活动商品关联
     * 
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 结果
     */
    @Override
    public int insertSeckillSkuRelation(SeckillSkuRelation seckillSkuRelation)
    {
        return seckillSkuRelationMapper.insertSeckillSkuRelation(seckillSkuRelation);
    }

    /**
     * 修改秒杀活动商品关联
     * 
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return 结果
     */
    @Override
    public int updateSeckillSkuRelation(SeckillSkuRelation seckillSkuRelation)
    {
        return seckillSkuRelationMapper.updateSeckillSkuRelation(seckillSkuRelation);
    }

    /**
     * 批量删除秒杀活动商品关联
     * 
     * @param ids 需要删除的秒杀活动商品关联主键
     * @return 结果
     */
    @Override
    public int deleteSeckillSkuRelationByIds(Long[] ids)
    {
        return seckillSkuRelationMapper.deleteSeckillSkuRelationByIds(ids);
    }

    /**
     * 删除秒杀活动商品关联信息
     * 
     * @param id 秒杀活动商品关联主键
     * @return 结果
     */
    @Override
    public int deleteSeckillSkuRelationById(Long id)
    {
        return seckillSkuRelationMapper.deleteSeckillSkuRelationById(id);
    }
}

