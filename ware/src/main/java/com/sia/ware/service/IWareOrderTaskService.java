package com.sia.ware.service;

import java.util.List;
import com.sia.ware.domain.WareOrderTask;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 库存工作单Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IWareOrderTaskService extends IService<WareOrderTask> {
    /**
     * 查询库存工作单
     *
     * @param id 库存工作单主键
     * @return 库存工作单
     */
    public WareOrderTask selectWareOrderTaskById(Long id);

    /**
     * 查询库存工作单列表
     *
     * @param wareOrderTask 库存工作单
     * @return 库存工作单集合
     */
    public List<WareOrderTask> selectWareOrderTaskList(WareOrderTask wareOrderTask);

    /**
     * 新增库存工作单
     *
     * @param wareOrderTask 库存工作单
     * @return 结果
     */
    public int insertWareOrderTask(WareOrderTask wareOrderTask);

    /**
     * 修改库存工作单
     *
     * @param wareOrderTask 库存工作单
     * @return 结果
     */
    public int updateWareOrderTask(WareOrderTask wareOrderTask);

    /**
     * 批量删除库存工作单
     *
     * @param ids 需要删除的库存工作单主键集合
     * @return 结果
     */
    public int deleteWareOrderTaskByIds(Long[] ids);

    /**
     * 删除库存工作单信息
     *
     * @param id 库存工作单主键
     * @return 结果
     */
    public int deleteWareOrderTaskById(Long id);
}
