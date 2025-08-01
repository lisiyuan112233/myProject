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
import com.sia.order.domain.OrderItem;
import com.sia.order.service.IOrderItemService;
import com.sia.order.common.Result;

/**
 * 订单项信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/orderItem")
public class OrderItemController
{
    @Autowired
    private IOrderItemService orderItemService;

    /**
     * 查询订单项信息列表
     */
    @GetMapping("/list")
    public Result<List<OrderItem>> list(OrderItem orderItem)
    {
        List<OrderItem> list = orderItemService.selectOrderItemList(orderItem);
        return Result.success("查询成功", list);
    }

    /**
     * 获取订单项信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<OrderItem> getInfo(@PathVariable("id") Long id)
    {
        OrderItem orderItem = orderItemService.selectOrderItemById(id);
        return orderItem != null ? Result.success("查询成功", orderItem) : Result.error("数据不存在");
    }

    /**
     * 新增订单项信息
     */
    @PostMapping
    public Result<String> add(@RequestBody OrderItem orderItem)
    {
        int rows = orderItemService.insertOrderItem(orderItem);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改订单项信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody OrderItem orderItem)
    {
        int rows = orderItemService.updateOrderItem(orderItem);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除订单项信息
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderItemService.deleteOrderItemByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
