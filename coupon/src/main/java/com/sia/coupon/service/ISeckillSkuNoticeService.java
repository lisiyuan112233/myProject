package com.sia.coupon.service;

import java.util.List;
import com.sia.coupon.domain.SeckillSkuNotice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 秒杀商品通知订阅Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface ISeckillSkuNoticeService extends IService<SeckillSkuNotice> {
    /**
     * 查询秒杀商品通知订阅
     *
     * @param id 秒杀商品通知订阅主键
     * @return 秒杀商品通知订阅
     */
    public SeckillSkuNotice selectSeckillSkuNoticeById(Long id);

    /**
     * 查询秒杀商品通知订阅列表
     *
     * @param seckillSkuNotice 秒杀商品通知订阅
     * @return 秒杀商品通知订阅集合
     */
    public List<SeckillSkuNotice> selectSeckillSkuNoticeList(SeckillSkuNotice seckillSkuNotice);

    /**
     * 新增秒杀商品通知订阅
     *
     * @param seckillSkuNotice 秒杀商品通知订阅
     * @return 结果
     */
    public int insertSeckillSkuNotice(SeckillSkuNotice seckillSkuNotice);

    /**
     * 修改秒杀商品通知订阅
     *
     * @param seckillSkuNotice 秒杀商品通知订阅
     * @return 结果
     */
    public int updateSeckillSkuNotice(SeckillSkuNotice seckillSkuNotice);

    /**
     * 批量删除秒杀商品通知订阅
     *
     * @param ids 需要删除的秒杀商品通知订阅主键集合
     * @return 结果
     */
    public int deleteSeckillSkuNoticeByIds(Long[] ids);

    /**
     * 删除秒杀商品通知订阅信息
     *
     * @param id 秒杀商品通知订阅主键
     * @return 结果
     */
    public int deleteSeckillSkuNoticeById(Long id);
}
