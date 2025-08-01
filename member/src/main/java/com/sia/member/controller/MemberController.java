package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.Member;
import com.sia.member.service.IMemberService;
import com.sia.member.common.Result;

/**
 * 会员Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/member")
public class MemberController {
    @Autowired
    private IMemberService memberService;

    /**
     * 查询会员列表
     */
    @GetMapping("/list")
    public Result<List<Member>> list(Member member) {
        List<Member> list = memberService.selectMemberList(member);
        return Result.success(list);
    }

    /**
     * 获取会员详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<Member> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberService.selectMemberById(id));
    }

    /**
     * 新增会员
     */
    @PostMapping
    public Result<String> add(@RequestBody Member member) {
        int rows = memberService.insertMember(member);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员
     */
    @PutMapping
    public Result<String> edit(@RequestBody Member member) {
        int rows = memberService.updateMember(member);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberService.deleteMemberByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
