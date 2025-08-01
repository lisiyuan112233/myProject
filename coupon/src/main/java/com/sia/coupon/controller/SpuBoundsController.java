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
import com.sia.coupon.domain.SpuBounds;
import com.sia.coupon.service.ISpuBoundsService;
import com.sia.coupon.common.Result;

/**
 * 商品spu积分设置Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/spuBounds")
public class SpuBoundsController
{
    @Autowired
    private ISpuBoundsService spuBoundsService;

    /**
     * 查询商品spu积分设置列表
     */
    @GetMapping("/list")
    public Result<List<SpuBounds>> list(SpuBounds spuBounds) {
        List<SpuBounds> list = spuBoundsService.selectSpuBoundsList(spuBounds);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取商品spu积分设置详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SpuBounds> getInfo(@PathVariable("id") Long id) {
        SpuBounds spuBounds = spuBoundsService.selectSpuBoundsById(id);
        return spuBounds != null ? Result.success(spuBounds, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增商品spu积分设置
     */
    @PostMapping
    public Result<Void> add(@RequestBody SpuBounds spuBounds) {
        int rows = spuBoundsService.insertSpuBounds(spuBounds);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改商品spu积分设置
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SpuBounds spuBounds) {
        int rows = spuBoundsService.updateSpuBounds(spuBounds);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除商品spu积分设置
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = spuBoundsService.deleteSpuBoundsByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

