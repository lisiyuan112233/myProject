package com.sia.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.coupon.mapper.HomeSubjectSpuMapper;
import com.sia.coupon.domain.HomeSubjectSpu;
import com.sia.coupon.service.IHomeSubjectSpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 专题商品Service业务层处理
 * 
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuMapper, HomeSubjectSpu> implements IHomeSubjectSpuService
{
    @Autowired
    private HomeSubjectSpuMapper homeSubjectSpuMapper;

    /**
     * 查询专题商品
     * 
     * @param id 专题商品主键
     * @return 专题商品
     */
    @Override
    public HomeSubjectSpu selectHomeSubjectSpuById(Long id)
    {
        return homeSubjectSpuMapper.selectHomeSubjectSpuById(id);
    }

    /**
     * 查询专题商品列表
     * 
     * @param homeSubjectSpu 专题商品
     * @return 专题商品
     */
    @Override
    public List<HomeSubjectSpu> selectHomeSubjectSpuList(HomeSubjectSpu homeSubjectSpu)
    {
        return homeSubjectSpuMapper.selectHomeSubjectSpuList(homeSubjectSpu);
    }

    /**
     * 新增专题商品
     * 
     * @param homeSubjectSpu 专题商品
     * @return 结果
     */
    @Override
    public int insertHomeSubjectSpu(HomeSubjectSpu homeSubjectSpu)
    {
        return homeSubjectSpuMapper.insertHomeSubjectSpu(homeSubjectSpu);
    }

    /**
     * 修改专题商品
     * 
     * @param homeSubjectSpu 专题商品
     * @return 结果
     */
    @Override
    public int updateHomeSubjectSpu(HomeSubjectSpu homeSubjectSpu)
    {
        return homeSubjectSpuMapper.updateHomeSubjectSpu(homeSubjectSpu);
    }

    /**
     * 批量删除专题商品
     * 
     * @param ids 需要删除的专题商品主键
     * @return 结果
     */
    @Override
    public int deleteHomeSubjectSpuByIds(Long[] ids)
    {
        return homeSubjectSpuMapper.deleteHomeSubjectSpuByIds(ids);
    }

    /**
     * 删除专题商品信息
     * 
     * @param id 专题商品主键
     * @return 结果
     */
    @Override
    public int deleteHomeSubjectSpuById(Long id)
    {
        return homeSubjectSpuMapper.deleteHomeSubjectSpuById(id);
    }
}

