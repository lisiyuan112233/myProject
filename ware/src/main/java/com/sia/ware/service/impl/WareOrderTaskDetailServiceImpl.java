package com.sia.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.sia.ware.domain.WareOrderTaskDetail;
import com.sia.ware.service.IWareOrderTaskDetailService;
import com.sia.ware.mapper.WareOrderTaskDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 库存工作单详情Service业务层处理
 *
 * @author lsy
 * @date 2025-07-31
 */
@Service
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailMapper, WareOrderTaskDetail> implements IWareOrderTaskDetailService
{
    @Autowired
    private WareOrderTaskDetailMapper wareOrderTaskDetailMapper;

    /**
     * 查询库存工作单详情
     *
     * @param id 库存工作单详情主键
     * @return 库存工作单详情
     */
    @Override
    public WareOrderTaskDetail selectWareOrderTaskDetailById(Long id)
    {
        return wareOrderTaskDetailMapper.selectWareOrderTaskDetailById(id);
    }

    /**
     * 查询库存工作单详情列表
     *
     * @param wareOrderTaskDetail 库存工作单详情
     * @return 库存工作单详情
     */
    @Override
    public List<WareOrderTaskDetail> selectWareOrderTaskDetailList(WareOrderTaskDetail wareOrderTaskDetail)
    {
        return wareOrderTaskDetailMapper.selectWareOrderTaskDetailList(wareOrderTaskDetail);
    }

    /**
     * 新增库存工作单详情
     *
     * @param wareOrderTaskDetail 库存工作单详情
     * @return 结果
     */
    @Override
    public int insertWareOrderTaskDetail(WareOrderTaskDetail wareOrderTaskDetail)
    {
        return wareOrderTaskDetailMapper.insertWareOrderTaskDetail(wareOrderTaskDetail);
    }

    /**
     * 修改库存工作单详情
     *
     * @param wareOrderTaskDetail 库存工作单详情
     * @return 结果
     */
    @Override
    public int updateWareOrderTaskDetail(WareOrderTaskDetail wareOrderTaskDetail)
    {
        return wareOrderTaskDetailMapper.updateWareOrderTaskDetail(wareOrderTaskDetail);
    }

    /**
     * 批量删除库存工作单详情
     *
     * @param ids 需要删除的库存工作单详情主键
     * @return 结果
     */
    @Override
    public int deleteWareOrderTaskDetailByIds(Long[] ids)
    {
        return wareOrderTaskDetailMapper.deleteWareOrderTaskDetailByIds(ids);
    }

    /**
     * 删除库存工作单详情信息
     *
     * @param id 库存工作单详情主键
     * @return 结果
     */
    @Override
    public int deleteWareOrderTaskDetailById(Long id)
    {
        return wareOrderTaskDetailMapper.deleteWareOrderTaskDetailById(id);
    }
}
