package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.IntegrationChangeHistory;
import com.sia.member.service.IIntegrationChangeHistoryService;
import com.sia.member.common.Result;

/**
 * 积分变化历史记录Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/integrationChangeHistory")
public class IntegrationChangeHistoryController {
    @Autowired
    private IIntegrationChangeHistoryService integrationChangeHistoryService;

    /**
     * 查询积分变化历史记录列表
     */
    @GetMapping("/list")
    public Result<List<IntegrationChangeHistory>> list(IntegrationChangeHistory integrationChangeHistory) {
        List<IntegrationChangeHistory> list = integrationChangeHistoryService.selectIntegrationChangeHistoryList(integrationChangeHistory);
        return Result.success(list);
    }

    /**
     * 获取积分变化历史记录详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<IntegrationChangeHistory> getInfo(@PathVariable("id") Long id) {
        return Result.success(integrationChangeHistoryService.selectIntegrationChangeHistoryById(id));
    }

    /**
     * 新增积分变化历史记录
     */
    @PostMapping
    public Result<String> add(@RequestBody IntegrationChangeHistory integrationChangeHistory) {
        int rows = integrationChangeHistoryService.insertIntegrationChangeHistory(integrationChangeHistory);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改积分变化历史记录
     */
    @PutMapping
    public Result<String> edit(@RequestBody IntegrationChangeHistory integrationChangeHistory) {
        int rows = integrationChangeHistoryService.updateIntegrationChangeHistory(integrationChangeHistory);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除积分变化历史记录
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = integrationChangeHistoryService.deleteIntegrationChangeHistoryByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
