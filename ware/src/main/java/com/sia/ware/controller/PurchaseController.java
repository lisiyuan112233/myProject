package com.sia.ware.controller;

import java.util.List;

import com.sia.ware.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.Purchase;
import com.sia.ware.common.Result;

/**
 * 采购信息Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/purchase")
public class PurchaseController {
    @Autowired
    private IPurchaseService purchaseService;

    /**
     * 查询采购信息列表
     */
    @GetMapping("/list")
    public Result<List<Purchase>> list(Purchase purchase) {
        List<Purchase> list = purchaseService.selectPurchaseList(purchase);
        return Result.success(list);
    }

    /**
     * 获取采购信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<Purchase> getInfo(@PathVariable("id") Long id) {
        return Result.success(purchaseService.selectPurchaseById(id));
    }

    /**
     * 新增采购信息
     */
    @PostMapping
    public Result<String> add(@RequestBody Purchase purchase) {
        int rows = purchaseService.insertPurchase(purchase);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改采购信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody Purchase purchase) {
        int rows = purchaseService.updatePurchase(purchase);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除采购信息
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = purchaseService.deletePurchaseByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
