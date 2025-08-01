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
import com.sia.order.domain.OrderSetting;
import com.sia.order.service.IOrderSettingService;
import com.sia.order.common.Result;

/**
 * 订单配置信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/orderSetting")
public class OrderSettingController
{
    @Autowired
    private IOrderSettingService orderSettingService;

    /**
     * 查询订单配置信息列表
     */
    @GetMapping("/list")
    public Result<List<OrderSetting>> list(OrderSetting orderSetting)
    {
        List<OrderSetting> list = orderSettingService.selectOrderSettingList(orderSetting);
        return Result.success("查询成功", list);
    }

    /**
     * 获取订单配置信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<OrderSetting> getInfo(@PathVariable("id") Long id)
    {
        OrderSetting orderSetting = orderSettingService.selectOrderSettingById(id);
        return orderSetting != null ? Result.success("查询成功", orderSetting) : Result.error("数据不存在");
    }

    /**
     * 新增订单配置信息
     */
    @PostMapping
    public Result<String> add(@RequestBody OrderSetting orderSetting)
    {
        int rows = orderSettingService.insertOrderSetting(orderSetting);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改订单配置信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody OrderSetting orderSetting)
    {
        int rows = orderSettingService.updateOrderSetting(orderSetting);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除订单配置信息
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderSettingService.deleteOrderSettingByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
