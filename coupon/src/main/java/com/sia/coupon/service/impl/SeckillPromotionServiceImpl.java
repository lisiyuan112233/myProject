package com.sia.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.coupon.mapper.SeckillPromotionMapper;
import com.sia.coupon.domain.SeckillPromotion;
import com.sia.coupon.service.ISeckillPromotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 秒杀活动Service业务层处理
 * 
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionMapper, SeckillPromotion> implements ISeckillPromotionService
{
    @Autowired
    private SeckillPromotionMapper seckillPromotionMapper;

    /**
     * 查询秒杀活动
     * 
     * @param id 秒杀活动主键
     * @return 秒杀活动
     */
    @Override
    public SeckillPromotion selectSeckillPromotionById(Long id)
    {
        return seckillPromotionMapper.selectSeckillPromotionById(id);
    }

    /**
     * 查询秒杀活动列表
     * 
     * @param seckillPromotion 秒杀活动
     * @return 秒杀活动
     */
    @Override
    public List<SeckillPromotion> selectSeckillPromotionList(SeckillPromotion seckillPromotion)
    {
        return seckillPromotionMapper.selectSeckillPromotionList(seckillPromotion);
    }

    /**
     * 新增秒杀活动
     * 
     * @param seckillPromotion 秒杀活动
     * @return 结果
     */
    @Override
    public int insertSeckillPromotion(SeckillPromotion seckillPromotion)
    {
        return seckillPromotionMapper.insertSeckillPromotion(seckillPromotion);
    }

    /**
     * 修改秒杀活动
     * 
     * @param seckillPromotion 秒杀活动
     * @return 结果
     */
    @Override
    public int updateSeckillPromotion(SeckillPromotion seckillPromotion)
    {
        return seckillPromotionMapper.updateSeckillPromotion(seckillPromotion);
    }

    /**
     * 批量删除秒杀活动
     * 
     * @param ids 需要删除的秒杀活动主键
     * @return 结果
     */
    @Override
    public int deleteSeckillPromotionByIds(Long[] ids)
    {
        return seckillPromotionMapper.deleteSeckillPromotionByIds(ids);
    }

    /**
     * 删除秒杀活动信息
     * 
     * @param id 秒杀活动主键
     * @return 结果
     */
    @Override
    public int deleteSeckillPromotionById(Long id)
    {
        return seckillPromotionMapper.deleteSeckillPromotionById(id);
    }
}

