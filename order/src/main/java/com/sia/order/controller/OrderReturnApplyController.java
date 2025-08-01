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
import com.sia.order.domain.OrderReturnApply;
import com.sia.order.service.IOrderReturnApplyService;
import com.sia.order.common.Result;

/**
 * 订单退货申请Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/orderReturnApply")
public class OrderReturnApplyController
{
    @Autowired
    private IOrderReturnApplyService orderReturnApplyService;

    /**
     * 查询订单退货申请列表
     */
    @GetMapping("/list")
    public Result<List<OrderReturnApply>> list(OrderReturnApply orderReturnApply)
    {
        List<OrderReturnApply> list = orderReturnApplyService.selectOrderReturnApplyList(orderReturnApply);
        return Result.success("查询成功", list);
    }

    /**
     * 获取订单退货申请详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<OrderReturnApply> getInfo(@PathVariable("id") Long id)
    {
        OrderReturnApply orderReturnApply = orderReturnApplyService.selectOrderReturnApplyById(id);
        return orderReturnApply != null ? Result.success("查询成功", orderReturnApply) : Result.error("数据不存在");
    }

    /**
     * 新增订单退货申请
     */
    @PostMapping
    public Result<String> add(@RequestBody OrderReturnApply orderReturnApply)
    {
        int rows = orderReturnApplyService.insertOrderReturnApply(orderReturnApply);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改订单退货申请
     */
    @PutMapping
    public Result<String> edit(@RequestBody OrderReturnApply orderReturnApply)
    {
        int rows = orderReturnApplyService.updateOrderReturnApply(orderReturnApply);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除订单退货申请
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderReturnApplyService.deleteOrderReturnApplyByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
