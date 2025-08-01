package com.sia.ware.controller;

import java.util.List;

import com.sia.ware.service.IWareSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.WareSku;
import com.sia.ware.common.Result;

/**
 * 商品库存Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/wareSku")
public class WareSkuController {
    @Autowired
    private IWareSkuService wareSkuService;

    /**
     * 查询商品库存列表
     */
    @GetMapping("/list")
    public Result<List<WareSku>> list(WareSku wareSku) {
        List<WareSku> list = wareSkuService.selectWareSkuList(wareSku);
        return Result.success(list);
    }

    /**
     * 获取商品库存详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<WareSku> getInfo(@PathVariable("id") Long id) {
        return Result.success(wareSkuService.selectWareSkuById(id));
    }

    /**
     * 新增商品库存
     */
    @PostMapping
    public Result<String> add(@RequestBody WareSku wareSku) {
        int rows = wareSkuService.insertWareSku(wareSku);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改商品库存
     */
    @PutMapping
    public Result<String> edit(@RequestBody WareSku wareSku) {
        int rows = wareSkuService.updateWareSku(wareSku);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除商品库存
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = wareSkuService.deleteWareSkuByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
