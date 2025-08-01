package com.sia.ware.controller;

import java.util.List;

import com.sia.ware.service.IWareOrderTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.WareOrderTask;
import com.sia.ware.common.Result;

/**
 * 库存工作单Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/wareOrderTask")
public class WareOrderTaskController {
    @Autowired
    private IWareOrderTaskService wareOrderTaskService;

    /**
     * 查询库存工作单列表
     */
    @GetMapping("/list")
    public Result<List<WareOrderTask>> list(WareOrderTask wareOrderTask) {
        List<WareOrderTask> list = wareOrderTaskService.selectWareOrderTaskList(wareOrderTask);
        return Result.success(list);
    }

    /**
     * 获取库存工作单详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<WareOrderTask> getInfo(@PathVariable("id") Long id) {
        return Result.success(wareOrderTaskService.selectWareOrderTaskById(id));
    }

    /**
     * 新增库存工作单
     */
    @PostMapping
    public Result<String> add(@RequestBody WareOrderTask wareOrderTask) {
        int rows = wareOrderTaskService.insertWareOrderTask(wareOrderTask);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改库存工作单
     */
    @PutMapping
    public Result<String> edit(@RequestBody WareOrderTask wareOrderTask) {
        int rows = wareOrderTaskService.updateWareOrderTask(wareOrderTask);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除库存工作单
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = wareOrderTaskService.deleteWareOrderTaskByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
