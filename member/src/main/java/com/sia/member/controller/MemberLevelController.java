package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberLevel;
import com.sia.member.service.IMemberLevelService;
import com.sia.member.common.Result;

/**
 * 会员等级Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberLevel")
public class MemberLevelController {
    @Autowired
    private IMemberLevelService memberLevelService;

    /**
     * 查询会员等级列表
     */
    @GetMapping("/list")
    public Result<List<MemberLevel>> list(MemberLevel memberLevel) {
        List<MemberLevel> list = memberLevelService.selectMemberLevelList(memberLevel);
        return Result.success(list);
    }

    /**
     * 获取会员等级详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberLevel> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberLevelService.selectMemberLevelById(id));
    }

    /**
     * 新增会员等级
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberLevel memberLevel) {
        int rows = memberLevelService.insertMemberLevel(memberLevel);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员等级
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberLevel memberLevel) {
        int rows = memberLevelService.updateMemberLevel(memberLevel);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员等级
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberLevelService.deleteMemberLevelByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
