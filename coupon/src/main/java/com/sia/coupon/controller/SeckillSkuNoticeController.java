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
import com.sia.coupon.domain.SeckillSkuNotice;
import com.sia.coupon.service.ISeckillSkuNoticeService;
import com.sia.coupon.common.Result;

/**
 * 秒杀商品通知订阅Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/seckillSkuNotice")
public class SeckillSkuNoticeController
{
    @Autowired
    private ISeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 查询秒杀商品通知订阅列表
     */
    @GetMapping("/list")
    public Result<List<SeckillSkuNotice>> list(SeckillSkuNotice seckillSkuNotice) {
        List<SeckillSkuNotice> list = seckillSkuNoticeService.selectSeckillSkuNoticeList(seckillSkuNotice);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取秒杀商品通知订阅详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SeckillSkuNotice> getInfo(@PathVariable("id") Long id) {
        SeckillSkuNotice seckillSkuNotice = seckillSkuNoticeService.selectSeckillSkuNoticeById(id);
        return seckillSkuNotice != null ? Result.success(seckillSkuNotice, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增秒杀商品通知订阅
     */
    @PostMapping
    public Result<Void> add(@RequestBody SeckillSkuNotice seckillSkuNotice) {
        int rows = seckillSkuNoticeService.insertSeckillSkuNotice(seckillSkuNotice);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改秒杀商品通知订阅
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SeckillSkuNotice seckillSkuNotice) {
        int rows = seckillSkuNoticeService.updateSeckillSkuNotice(seckillSkuNotice);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除秒杀商品通知订阅
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = seckillSkuNoticeService.deleteSeckillSkuNoticeByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

