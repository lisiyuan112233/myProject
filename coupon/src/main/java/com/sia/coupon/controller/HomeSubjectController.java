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
import com.sia.coupon.domain.HomeSubject;
import com.sia.coupon.service.IHomeSubjectService;
import com.sia.coupon.common.Result;

/**
 * 首页专题Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/homeSubject")
public class HomeSubjectController
{
    @Autowired
    private IHomeSubjectService homeSubjectService;

    /**
     * 查询首页专题列表
     */
    @GetMapping("/list")
    public Result<List<HomeSubject>> list(HomeSubject homeSubject) {
        List<HomeSubject> list = homeSubjectService.selectHomeSubjectList(homeSubject);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取首页专题详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<HomeSubject> getInfo(@PathVariable("id") Long id) {
        HomeSubject homeSubject = homeSubjectService.selectHomeSubjectById(id);
        return homeSubject != null ? Result.success(homeSubject, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增首页专题
     */
    @PostMapping
    public Result<Void> add(@RequestBody HomeSubject homeSubject) {
        int rows = homeSubjectService.insertHomeSubject(homeSubject);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改首页专题
     */
    @PutMapping
    public Result<Void> edit(@RequestBody HomeSubject homeSubject) {
        int rows = homeSubjectService.updateHomeSubject(homeSubject);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除首页专题
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = homeSubjectService.deleteHomeSubjectByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

