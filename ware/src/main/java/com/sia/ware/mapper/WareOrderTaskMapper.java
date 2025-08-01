package com.sia.ware.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.ware.domain.WareOrderTask;

/**
 * 库存工作单Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface WareOrderTaskMapper extends BaseMapper<WareOrderTask> {
    /**
     * 查询库存工作�?
     *
     * @param id 库存工作单主�?
     * @return 库存工作�?
     */
    public WareOrderTask selectWareOrderTaskById(Long id);

    /**
     * 查询库存工作单列�?
     *
     * @param wareOrderTask 库存工作�?
     * @return 库存工作单集�?
     */
    public List<WareOrderTask> selectWareOrderTaskList(WareOrderTask wareOrderTask);

    /**
     * 新增库存工作�?
     *
     * @param wareOrderTask 库存工作�?
     * @return 结果
     */
    public int insertWareOrderTask(WareOrderTask wareOrderTask);

    /**
     * 修改库存工作�?
     *
     * @param wareOrderTask 库存工作�?
     * @return 结果
     */
    public int updateWareOrderTask(WareOrderTask wareOrderTask);

    /**
     * 删除库存工作�?
     *
     * @param id 库存工作单主�?
     * @return 结果
     */
    public int deleteWareOrderTaskById(Long id);

    /**
     * 批量删除库存工作�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWareOrderTaskByIds(Long[] ids);
}
