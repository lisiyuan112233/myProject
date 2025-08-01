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
import com.sia.coupon.domain.HomeSubjectSpu;
import com.sia.coupon.service.IHomeSubjectSpuService;
import com.sia.coupon.common.Result;

/**
 * 专题商品Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/homeSubjectSpu")
public class HomeSubjectSpuController
{
    @Autowired
    private IHomeSubjectSpuService homeSubjectSpuService;

    /**
     * 查询专题商品列表
     */
    @GetMapping("/list")
    public Result<List<HomeSubjectSpu>> list(HomeSubjectSpu homeSubjectSpu) {
        List<HomeSubjectSpu> list = homeSubjectSpuService.selectHomeSubjectSpuList(homeSubjectSpu);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取专题商品详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<HomeSubjectSpu> getInfo(@PathVariable("id") Long id) {
        HomeSubjectSpu homeSubjectSpu = homeSubjectSpuService.selectHomeSubjectSpuById(id);
        return homeSubjectSpu != null ? Result.success(homeSubjectSpu, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增专题商品
     */
    @PostMapping
    public Result<Void> add(@RequestBody HomeSubjectSpu homeSubjectSpu) {
        int rows = homeSubjectSpuService.insertHomeSubjectSpu(homeSubjectSpu);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改专题商品
     */
    @PutMapping
    public Result<Void> edit(@RequestBody HomeSubjectSpu homeSubjectSpu) {
        int rows = homeSubjectSpuService.updateHomeSubjectSpu(homeSubjectSpu);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除专题商品
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = homeSubjectSpuService.deleteHomeSubjectSpuByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

