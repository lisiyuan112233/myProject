package com.sia.order.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sia.order.domain.OrderOperateHistory;
import com.sia.order.service.IOrderOperateHistoryService;
import com.sia.order.common.Result;

/**
 * 订单操作历史记录Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/orderOperateHistory")
public class OrderOperateHistoryController
{
    @Autowired
    private IOrderOperateHistoryService orderOperateHistoryService;

    /**
     * 查询订单操作历史记录列表
     */
    @GetMapping("/list")
    public Result<List<OrderOperateHistory>> list(OrderOperateHistory orderOperateHistory)
    {
        List<OrderOperateHistory> list = orderOperateHistoryService.selectOrderOperateHistoryList(orderOperateHistory);
        return Result.success("查询成功", list);
    }

    /**
     * 获取订单操作历史记录详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<OrderOperateHistory> getInfo(@PathVariable("id") Long id)
    {
        OrderOperateHistory orderOperateHistory = orderOperateHistoryService.selectOrderOperateHistoryById(id);
        return orderOperateHistory != null ? Result.success("查询成功", orderOperateHistory) : Result.error("数据不存在");
    }

    /**
     * 新增订单操作历史记录
     */
    @PostMapping
    public Result<String> add(@RequestBody OrderOperateHistory orderOperateHistory)
    {
        int rows = orderOperateHistoryService.insertOrderOperateHistory(orderOperateHistory);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改订单操作历史记录
     */
    @PutMapping
    public Result<String> edit(@RequestBody OrderOperateHistory orderOperateHistory)
    {
        int rows = orderOperateHistoryService.updateOrderOperateHistory(orderOperateHistory);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除订单操作历史记录
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderOperateHistoryService.deleteOrderOperateHistoryByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
