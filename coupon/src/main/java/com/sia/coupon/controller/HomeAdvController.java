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
import com.sia.coupon.domain.HomeAdv;
import com.sia.coupon.service.IHomeAdvService;
import com.sia.coupon.common.Result;

/**
 * 首页轮播广告Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/homeAdv")
public class HomeAdvController
{
    @Autowired
    private IHomeAdvService homeAdvService;

    /**
     * 查询首页轮播广告列表
     */
    @GetMapping("/list")
    public Result<List<HomeAdv>> list(HomeAdv homeAdv)
    {
        List<HomeAdv> list = homeAdvService.selectHomeAdvList(homeAdv);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取首页轮播广告详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<HomeAdv> getInfo(@PathVariable("id") Long id)
    {
        HomeAdv homeAdv = homeAdvService.selectHomeAdvById(id);
        return homeAdv != null ? Result.success(homeAdv, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增首页轮播广告
     */
    @PostMapping
    public Result<Void> add(@RequestBody HomeAdv homeAdv)
    {
        int rows = homeAdvService.insertHomeAdv(homeAdv);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改首页轮播广告
     */
    @PutMapping
    public Result<Void> edit(@RequestBody HomeAdv homeAdv)
    {
        int rows = homeAdvService.updateHomeAdv(homeAdv);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除首页轮播广告
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = homeAdvService.deleteHomeAdvByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

