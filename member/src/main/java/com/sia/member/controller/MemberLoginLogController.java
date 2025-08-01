package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberLoginLog;
import com.sia.member.service.IMemberLoginLogService;
import com.sia.member.common.Result;

/**
 * 会员登录记录Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberLoginLog")
public class MemberLoginLogController {
    @Autowired
    private IMemberLoginLogService memberLoginLogService;

    /**
     * 查询会员登录记录列表
     */
    @GetMapping("/list")
    public Result<List<MemberLoginLog>> list(MemberLoginLog memberLoginLog) {
        List<MemberLoginLog> list = memberLoginLogService.selectMemberLoginLogList(memberLoginLog);
        return Result.success(list);
    }

    /**
     * 获取会员登录记录详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberLoginLog> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberLoginLogService.selectMemberLoginLogById(id));
    }

    /**
     * 新增会员登录记录
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberLoginLog memberLoginLog) {
        int rows = memberLoginLogService.insertMemberLoginLog(memberLoginLog);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员登录记录
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberLoginLog memberLoginLog) {
        int rows = memberLoginLogService.updateMemberLoginLog(memberLoginLog);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员登录记录
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberLoginLogService.deleteMemberLoginLogByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
