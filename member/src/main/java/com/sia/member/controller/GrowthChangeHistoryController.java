package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.GrowthChangeHistory;
import com.sia.member.service.IGrowthChangeHistoryService;
import com.sia.member.common.Result;

/**
 * 成长值变化历史记录Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/growthChangeHistory")
public class GrowthChangeHistoryController {
    @Autowired
    private IGrowthChangeHistoryService growthChangeHistoryService;

    /**
     * 查询成长值变化历史记录列表
     */
    @GetMapping("/list")
    public Result<List<GrowthChangeHistory>> list(GrowthChangeHistory growthChangeHistory) {
        List<GrowthChangeHistory> list = growthChangeHistoryService.selectGrowthChangeHistoryList(growthChangeHistory);
        return Result.success(list);
    }

    /**
     * 获取成长值变化历史记录详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<GrowthChangeHistory> getInfo(@PathVariable("id") Long id) {
        return Result.success(growthChangeHistoryService.selectGrowthChangeHistoryById(id));
    }

    /**
     * 新增成长值变化历史记录
     */
    @PostMapping
    public Result<String> add(@RequestBody GrowthChangeHistory growthChangeHistory) {
        int rows = growthChangeHistoryService.insertGrowthChangeHistory(growthChangeHistory);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改成长值变化历史记录
     */
    @PutMapping
    public Result<String> edit(@RequestBody GrowthChangeHistory growthChangeHistory) {
        int rows = growthChangeHistoryService.updateGrowthChangeHistory(growthChangeHistory);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除成长值变化历史记录
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = growthChangeHistoryService.deleteGrowthChangeHistoryByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
