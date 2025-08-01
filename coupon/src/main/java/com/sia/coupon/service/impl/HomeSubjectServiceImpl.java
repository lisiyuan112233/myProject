package com.sia.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.coupon.mapper.HomeSubjectMapper;
import com.sia.coupon.domain.HomeSubject;
import com.sia.coupon.service.IHomeSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 首页专题Service业务层处理
 * 
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectMapper, HomeSubject> implements IHomeSubjectService
{
    @Autowired
    private HomeSubjectMapper homeSubjectMapper;

    /**
     * 查询首页专题
     * 
     * @param id 首页专题主键
     * @return 首页专题
     */
    @Override
    public HomeSubject selectHomeSubjectById(Long id)
    {
        return homeSubjectMapper.selectHomeSubjectById(id);
    }

    /**
     * 查询首页专题列表
     * 
     * @param homeSubject 首页专题
     * @return 首页专题
     */
    @Override
    public List<HomeSubject> selectHomeSubjectList(HomeSubject homeSubject)
    {
        return homeSubjectMapper.selectHomeSubjectList(homeSubject);
    }

    /**
     * 新增首页专题
     * 
     * @param homeSubject 首页专题
     * @return 结果
     */
    @Override
    public int insertHomeSubject(HomeSubject homeSubject)
    {
        return homeSubjectMapper.insertHomeSubject(homeSubject);
    }

    /**
     * 修改首页专题
     * 
     * @param homeSubject 首页专题
     * @return 结果
     */
    @Override
    public int updateHomeSubject(HomeSubject homeSubject)
    {
        return homeSubjectMapper.updateHomeSubject(homeSubject);
    }

    /**
     * 批量删除首页专题
     * 
     * @param ids 需要删除的首页专题主键
     * @return 结果
     */
    @Override
    public int deleteHomeSubjectByIds(Long[] ids)
    {
        return homeSubjectMapper.deleteHomeSubjectByIds(ids);
    }

    /**
     * 删除首页专题信息
     * 
     * @param id 首页专题主键
     * @return 结果
     */
    @Override
    public int deleteHomeSubjectById(Long id)
    {
        return homeSubjectMapper.deleteHomeSubjectById(id);
    }
}

