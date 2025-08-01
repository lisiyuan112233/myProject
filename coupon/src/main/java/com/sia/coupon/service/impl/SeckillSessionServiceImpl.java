package com.sia.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.coupon.mapper.SeckillSessionMapper;
import com.sia.coupon.domain.SeckillSession;
import com.sia.coupon.service.ISeckillSessionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 秒杀活动场次Service业务层处理
 * 
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionMapper, SeckillSession> implements ISeckillSessionService
{
    @Autowired
    private SeckillSessionMapper seckillSessionMapper;

    /**
     * 查询秒杀活动场次
     * 
     * @param id 秒杀活动场次主键
     * @return 秒杀活动场次
     */
    @Override
    public SeckillSession selectSeckillSessionById(Long id)
    {
        return seckillSessionMapper.selectSeckillSessionById(id);
    }

    /**
     * 查询秒杀活动场次列表
     * 
     * @param seckillSession 秒杀活动场次
     * @return 秒杀活动场次
     */
    @Override
    public List<SeckillSession> selectSeckillSessionList(SeckillSession seckillSession)
    {
        return seckillSessionMapper.selectSeckillSessionList(seckillSession);
    }

    /**
     * 新增秒杀活动场次
     * 
     * @param seckillSession 秒杀活动场次
     * @return 结果
     */
    @Override
    public int insertSeckillSession(SeckillSession seckillSession)
    {
        return seckillSessionMapper.insertSeckillSession(seckillSession);
    }

    /**
     * 修改秒杀活动场次
     * 
     * @param seckillSession 秒杀活动场次
     * @return 结果
     */
    @Override
    public int updateSeckillSession(SeckillSession seckillSession)
    {
        return seckillSessionMapper.updateSeckillSession(seckillSession);
    }

    /**
     * 批量删除秒杀活动场次
     * 
     * @param ids 需要删除的秒杀活动场次主键
     * @return 结果
     */
    @Override
    public int deleteSeckillSessionByIds(Long[] ids)
    {
        return seckillSessionMapper.deleteSeckillSessionByIds(ids);
    }

    /**
     * 删除秒杀活动场次信息
     * 
     * @param id 秒杀活动场次主键
     * @return 结果
     */
    @Override
    public int deleteSeckillSessionById(Long id)
    {
        return seckillSessionMapper.deleteSeckillSessionById(id);
    }
}

