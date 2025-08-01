package com.sia.coupon.service;

import java.util.List;
import com.sia.coupon.domain.HomeAdv;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 首页轮播广告Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IHomeAdvService extends IService<HomeAdv> {
    /**
     * 查询首页轮播广告
     *
     * @param id 首页轮播广告主键
     * @return 首页轮播广告
     */
    public HomeAdv selectHomeAdvById(Long id);

    /**
     * 查询首页轮播广告列表
     *
     * @param homeAdv 首页轮播广告
     * @return 首页轮播广告集合
     */
    public List<HomeAdv> selectHomeAdvList(HomeAdv homeAdv);

    /**
     * 新增首页轮播广告
     *
     * @param homeAdv 首页轮播广告
     * @return 结果
     */
    public int insertHomeAdv(HomeAdv homeAdv);

    /**
     * 修改首页轮播广告
     *
     * @param homeAdv 首页轮播广告
     * @return 结果
     */
    public int updateHomeAdv(HomeAdv homeAdv);

    /**
     * 批量删除首页轮播广告
     *
     * @param ids 需要删除的首页轮播广告主键集合
     * @return 结果
     */
    public int deleteHomeAdvByIds(Long[] ids);

    /**
     * 删除首页轮播广告信息
     *
     * @param id 首页轮播广告主键
     * @return 结果
     */
    public int deleteHomeAdvById(Long id);
}
