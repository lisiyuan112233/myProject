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
import com.sia.order.domain.RefundInfo;
import com.sia.order.service.IRefundInfoService;
import com.sia.order.common.Result;

/**
 * 退款信息Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/refundInfo")
public class RefundInfoController
{
    @Autowired
    private IRefundInfoService refundInfoService;

    /**
     * 查询退款信息列表
     */
    @GetMapping("/list")
    public Result<List<RefundInfo>> list(RefundInfo refundInfo)
    {
        List<RefundInfo> list = refundInfoService.selectRefundInfoList(refundInfo);
        return Result.success("查询成功", list);
    }

    /**
     * 获取退款信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<RefundInfo> getInfo(@PathVariable("id") Long id)
    {
        RefundInfo refundInfo = refundInfoService.selectRefundInfoById(id);
        return refundInfo != null ? Result.success("查询成功", refundInfo) : Result.error("数据不存在");
    }

    /**
     * 新增退款信息
     */
    @PostMapping
    public Result<String> add(@RequestBody RefundInfo refundInfo)
    {
        int rows = refundInfoService.insertRefundInfo(refundInfo);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改退款信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody RefundInfo refundInfo)
    {
        int rows = refundInfoService.updateRefundInfo(refundInfo);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除退款信息
     */
	@DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids)
    {
        int rows = refundInfoService.deleteRefundInfoByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
