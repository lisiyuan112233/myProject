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
import com.sia.order.domain.PaymentInfo;
import com.sia.order.service.IPaymentInfoService;
import com.sia.order.common.Result;

/**
 * 支付信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/paymentInfo")
public class PaymentInfoController
{
    @Autowired
    private IPaymentInfoService paymentInfoService;

    /**
     * 查询支付信息列表
     */
    @GetMapping("/list")
    public Result<List<PaymentInfo>> list(PaymentInfo paymentInfo)
    {
        List<PaymentInfo> list = paymentInfoService.selectPaymentInfoList(paymentInfo);
        return Result.success("查询成功", list);
    }

    /**
     * 获取支付信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PaymentInfo> getInfo(@PathVariable("id") Long id)
    {
        PaymentInfo paymentInfo = paymentInfoService.selectPaymentInfoById(id);
        return paymentInfo != null ? Result.success("查询成功", paymentInfo) : Result.error("数据不存在");
    }

    /**
     * 新增支付信息
     */
    @PostMapping
    public Result<String> add(@RequestBody PaymentInfo paymentInfo)
    {
        int rows = paymentInfoService.insertPaymentInfo(paymentInfo);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改支付信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody PaymentInfo paymentInfo)
    {
        int rows = paymentInfoService.updatePaymentInfo(paymentInfo);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除支付信息
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = paymentInfoService.deletePaymentInfoByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
