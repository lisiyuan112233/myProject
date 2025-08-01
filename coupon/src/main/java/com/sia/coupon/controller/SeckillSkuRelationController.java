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
import com.sia.coupon.domain.SeckillSkuRelation;
import com.sia.coupon.service.ISeckillSkuRelationService;
import com.sia.coupon.common.Result;

/**
 * 秒杀商品关联Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/seckillSkuRelation")
public class SeckillSkuRelationController
{
    @Autowired
    private ISeckillSkuRelationService seckillSkuRelationService;

    /**
     * 查询秒杀商品关联列表
     */
    @GetMapping("/list")
    public Result<List<SeckillSkuRelation>> list(SeckillSkuRelation seckillSkuRelation) {
        List<SeckillSkuRelation> list = seckillSkuRelationService.selectSeckillSkuRelationList(seckillSkuRelation);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取秒杀商品关联详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SeckillSkuRelation> getInfo(@PathVariable("id") Long id) {
        SeckillSkuRelation seckillSkuRelation = seckillSkuRelationService.selectSeckillSkuRelationById(id);
        return seckillSkuRelation != null ? Result.success(seckillSkuRelation, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增秒杀商品关联
     */
    @PostMapping
    public Result<Void> add(@RequestBody SeckillSkuRelation seckillSkuRelation) {
        int rows = seckillSkuRelationService.insertSeckillSkuRelation(seckillSkuRelation);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改秒杀商品关联
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SeckillSkuRelation seckillSkuRelation) {
        int rows = seckillSkuRelationService.updateSeckillSkuRelation(seckillSkuRelation);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除秒杀商品关联
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = seckillSkuRelationService.deleteSeckillSkuRelationByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

