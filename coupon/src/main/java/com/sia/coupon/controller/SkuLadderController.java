package com.sia.coupon.controller;

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
import com.sia.coupon.domain.SkuLadder;
import com.sia.coupon.service.ISkuLadderService;
import com.sia.coupon.common.Result;

/**
 * 商品阶梯价格Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/skuLadder")
public class SkuLadderController
{
    @Autowired
    private ISkuLadderService skuLadderService;

    /**
     * 查询商品阶梯价格列表
     */
    @GetMapping("/list")
    public Result<List<SkuLadder>> list(SkuLadder skuLadder) {
        List<SkuLadder> list = skuLadderService.selectSkuLadderList(skuLadder);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取商品阶梯价格详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SkuLadder> getInfo(@PathVariable("id") Long id) {
        SkuLadder skuLadder = skuLadderService.selectSkuLadderById(id);
        return skuLadder != null ? Result.success(skuLadder, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增商品阶梯价格
     */
    @PostMapping
    public Result<Void> add(@RequestBody SkuLadder skuLadder) {
        int rows = skuLadderService.insertSkuLadder(skuLadder);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改商品阶梯价格
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SkuLadder skuLadder) {
        int rows = skuLadderService.updateSkuLadder(skuLadder);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除商品阶梯价格
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = skuLadderService.deleteSkuLadderByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

