package com.sia.ware.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.ware.domain.WareOrderTaskDetail;

/**
 * 库存工作单Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface WareOrderTaskDetailMapper extends BaseMapper<WareOrderTaskDetail> {
    /**
     * 查询库存工作�?
     *
     * @param id 库存工作单主�?
     * @return 库存工作�?
     */
    public WareOrderTaskDetail selectWareOrderTaskDetailById(Long id);

    /**
     * 查询库存工作单列�?
     *
     * @param wareOrderTaskDetail 库存工作�?
     * @return 库存工作单集�?
     */
    public List<WareOrderTaskDetail> selectWareOrderTaskDetailList(WareOrderTaskDetail wareOrderTaskDetail);

    /**
     * 新增库存工作�?
     *
     * @param wareOrderTaskDetail 库存工作�?
     * @return 结果
     */
    public int insertWareOrderTaskDetail(WareOrderTaskDetail wareOrderTaskDetail);

    /**
     * 修改库存工作�?
     *
     * @param wareOrderTaskDetail 库存工作�?
     * @return 结果
     */
    public int updateWareOrderTaskDetail(WareOrderTaskDetail wareOrderTaskDetail);

    /**
     * 删除库存工作�?
     *
     * @param id 库存工作单主�?
     * @return 结果
     */
    public int deleteWareOrderTaskDetailById(Long id);

    /**
     * 批量删除库存工作�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWareOrderTaskDetailByIds(Long[] ids);
}
