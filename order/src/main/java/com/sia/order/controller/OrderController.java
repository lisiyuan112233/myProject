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
import com.sia.order.domain.Order;
import com.sia.order.service.IOrderService;
import com.sia.order.common.Result;

/**
 * 订单Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/order")
public class OrderController
{
    @Autowired
    private IOrderService orderService;

    /**
     * 查询订单列表
     */
    @GetMapping("/list")
    public Result<List<Order>> list(Order order)
    {
        List<Order> list = orderService.selectOrderList(order);
        return Result.success("查询成功", list);
    }

    /**
     * 获取订单详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<Order> getInfo(@PathVariable("id") Long id)
    {
        Order order = orderService.selectOrderById(id);
        return order != null ? Result.success("查询成功", order) : Result.error("数据不存在");
    }

    /**
     * 新增订单
     */
    @PostMapping
    public Result<String> add(@RequestBody Order order)
    {
        int rows = orderService.insertOrder(order);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改订单
     */
    @PutMapping
    public Result<String> edit(@RequestBody Order order)
    {
        int rows = orderService.updateOrder(order);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除订单
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderService.deleteOrderByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
