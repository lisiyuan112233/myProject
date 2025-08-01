package com.sia.ware.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.PurchaseDetail;
import com.sia.ware.service.IPurchaseDetailService;
import com.sia.ware.common.Result;

/**
 * 采购信息详情Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/purchaseDetail")
public class PurchaseDetailController {
    @Autowired
    private IPurchaseDetailService purchaseDetailService;

    /**
     * 查询采购信息详情列表
     */
    @GetMapping("/list")
    public Result<List<PurchaseDetail>> list(PurchaseDetail purchaseDetail) {
        List<PurchaseDetail> list = purchaseDetailService.selectPurchaseDetailList(purchaseDetail);
        return Result.success(list);
    }

    /**
     * 获取采购信息详情详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PurchaseDetail> getInfo(@PathVariable("id") Long id) {
        return Result.success(purchaseDetailService.selectPurchaseDetailById(id));
    }

    /**
     * 新增采购信息详情
     */
    @PostMapping
    public Result<String> add(@RequestBody PurchaseDetail purchaseDetail) {
        int rows = purchaseDetailService.insertPurchaseDetail(purchaseDetail);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改采购信息详情
     */
    @PutMapping
    public Result<String> edit(@RequestBody PurchaseDetail purchaseDetail) {
        int rows = purchaseDetailService.updatePurchaseDetail(purchaseDetail);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除采购信息详情
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = purchaseDetailService.deletePurchaseDetailByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
