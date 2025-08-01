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
import com.sia.coupon.domain.SeckillSession;
import com.sia.coupon.service.ISeckillSessionService;
import com.sia.coupon.common.Result;

/**
 * 秒杀活动场次Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/seckillSession")
public class SeckillSessionController
{
    @Autowired
    private ISeckillSessionService seckillSessionService;

    /**
     * 查询秒杀活动场次列表
     */
    @GetMapping("/list")
    public Result<List<SeckillSession>> list(SeckillSession seckillSession) {
        List<SeckillSession> list = seckillSessionService.selectSeckillSessionList(seckillSession);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取秒杀活动场次详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<SeckillSession> getInfo(@PathVariable("id") Long id) {
        SeckillSession seckillSession = seckillSessionService.selectSeckillSessionById(id);
        return seckillSession != null ? Result.success(seckillSession, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增秒杀活动场次
     */
    @PostMapping
    public Result<Void> add(@RequestBody SeckillSession seckillSession) {
        int rows = seckillSessionService.insertSeckillSession(seckillSession);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改秒杀活动场次
     */
    @PutMapping
    public Result<Void> edit(@RequestBody SeckillSession seckillSession) {
        int rows = seckillSessionService.updateSeckillSession(seckillSession);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除秒杀活动场次
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = seckillSessionService.deleteSeckillSessionByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

