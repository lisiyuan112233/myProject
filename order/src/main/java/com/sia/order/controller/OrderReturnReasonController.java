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
import com.sia.order.domain.OrderReturnReason;
import com.sia.order.service.IOrderReturnReasonService;
import com.sia.order.common.Result;

/**
 * 退货原因Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/orderReturnReason")
public class OrderReturnReasonController
{
    @Autowired
    private IOrderReturnReasonService orderReturnReasonService;

    /**
     * 查询退货原因列表
     */
    @GetMapping("/list")
    public Result<List<OrderReturnReason>> list(OrderReturnReason orderReturnReason)
    {
        List<OrderReturnReason> list = orderReturnReasonService.selectOrderReturnReasonList(orderReturnReason);
        return Result.success("查询成功", list);
    }

    /**
     * 获取退货原因详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<OrderReturnReason> getInfo(@PathVariable("id") Long id)
    {
        OrderReturnReason orderReturnReason = orderReturnReasonService.selectOrderReturnReasonById(id);
        return orderReturnReason != null ? Result.success("查询成功", orderReturnReason) : Result.error("数据不存在");
    }

    /**
     * 新增退货原因
     */
    @PostMapping
    public Result<String> add(@RequestBody OrderReturnReason orderReturnReason)
    {
        int rows = orderReturnReasonService.insertOrderReturnReason(orderReturnReason);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改退货原因
     */
    @PutMapping
    public Result<String> edit(@RequestBody OrderReturnReason orderReturnReason)
    {
        int rows = orderReturnReasonService.updateOrderReturnReason(orderReturnReason);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除退货原因
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = orderReturnReasonService.deleteOrderReturnReasonByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
