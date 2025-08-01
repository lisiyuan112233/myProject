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
import com.sia.coupon.domain.SeckillPromotion;
import com.sia.coupon.service.ISeckillPromotionService;
import com.sia.coupon.common.Result;

/**
 * 秒杀活动Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/seckillPromotion")
public class SeckillPromotionController
{
    @Autowired
    private ISeckillPromotionService seckillPromotionService;

    /**
     * 查询秒杀活动列表
     */
    @GetMapping("/list")
    public Result<List<SeckillPromotion>> list(SeckillPromotion seckillPromotion) {
        List<SeckillPromotion> list = seckillPromotionService.selectSeckillPromotionList(seckillPromotion);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取秒杀活动详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SeckillPromotion> getInfo(@PathVariable("id") Long id) {
        SeckillPromotion seckillPromotion = seckillPromotionService.selectSeckillPromotionById(id);
        return seckillPromotion != null ? Result.success(seckillPromotion, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增秒杀活动
     */
    @PostMapping
    public Result<Void> add(@RequestBody SeckillPromotion seckillPromotion) {
        int rows = seckillPromotionService.insertSeckillPromotion(seckillPromotion);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改秒杀活动
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SeckillPromotion seckillPromotion) {
        int rows = seckillPromotionService.updateSeckillPromotion(seckillPromotion);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除秒杀活动
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = seckillPromotionService.deleteSeckillPromotionByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

