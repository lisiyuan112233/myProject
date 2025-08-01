package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberStatisticsInfo;
import com.sia.member.service.IMemberStatisticsInfoService;
import com.sia.member.common.Result;

/**
 * 会员统计信息Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberStatisticsInfo")
public class MemberStatisticsInfoController {
    @Autowired
    private IMemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 查询会员统计信息列表
     */
    @GetMapping("/list")
    public Result<List<MemberStatisticsInfo>> list(MemberStatisticsInfo memberStatisticsInfo) {
        List<MemberStatisticsInfo> list = memberStatisticsInfoService.selectMemberStatisticsInfoList(memberStatisticsInfo);
        return Result.success(list);
    }

    /**
     * 获取会员统计信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberStatisticsInfo> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberStatisticsInfoService.selectMemberStatisticsInfoById(id));
    }

    /**
     * 新增会员统计信息
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberStatisticsInfo memberStatisticsInfo) {
        int rows = memberStatisticsInfoService.insertMemberStatisticsInfo(memberStatisticsInfo);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员统计信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberStatisticsInfo memberStatisticsInfo) {
        int rows = memberStatisticsInfoService.updateMemberStatisticsInfo(memberStatisticsInfo);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员统计信息
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberStatisticsInfoService.deleteMemberStatisticsInfoByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
