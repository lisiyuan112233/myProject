package com.sia.ware.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.WareOrderTaskDetail;
import com.sia.ware.service.IWareOrderTaskDetailService;
import com.sia.ware.common.Result;

/**
 * 库存工作单详情Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/wareOrderTaskDetail")
public class WareOrderTaskDetailController {
    @Autowired
    private IWareOrderTaskDetailService wareOrderTaskDetailService;

    /**
     * 查询库存工作单详情列表
     */
    @GetMapping("/list")
    public Result<List<WareOrderTaskDetail>> list(WareOrderTaskDetail wareOrderTaskDetail) {
        List<WareOrderTaskDetail> list = wareOrderTaskDetailService.selectWareOrderTaskDetailList(wareOrderTaskDetail);
        return Result.success(list);
    }

    /**
     * 获取库存工作单详情详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<WareOrderTaskDetail> getInfo(@PathVariable("id") Long id) {
        return Result.success(wareOrderTaskDetailService.selectWareOrderTaskDetailById(id));
    }

    /**
     * 新增库存工作单详情
     */
    @PostMapping
    public Result<String> add(@RequestBody WareOrderTaskDetail wareOrderTaskDetail) {
        int rows = wareOrderTaskDetailService.insertWareOrderTaskDetail(wareOrderTaskDetail);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改库存工作单详情
     */
    @PutMapping
    public Result<String> edit(@RequestBody WareOrderTaskDetail wareOrderTaskDetail) {
        int rows = wareOrderTaskDetailService.updateWareOrderTaskDetail(wareOrderTaskDetail);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除库存工作单详情
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = wareOrderTaskDetailService.deleteWareOrderTaskDetailByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
