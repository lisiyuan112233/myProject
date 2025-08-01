package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberCollectSubject;
import com.sia.member.service.IMemberCollectSubjectService;
import com.sia.member.common.Result;

/**
 * 会员收藏的专题活动Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberCollectSubject")
public class MemberCollectSubjectController {
    @Autowired
    private IMemberCollectSubjectService memberCollectSubjectService;

    /**
     * 查询会员收藏的专题活动列表
     */
    @GetMapping("/list")
    public Result<List<MemberCollectSubject>> list(MemberCollectSubject memberCollectSubject) {
        List<MemberCollectSubject> list = memberCollectSubjectService.selectMemberCollectSubjectList(memberCollectSubject);
        return Result.success(list);
    }

    /**
     * 获取会员收藏的专题活动详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberCollectSubject> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberCollectSubjectService.selectMemberCollectSubjectById(id));
    }

    /**
     * 新增会员收藏的专题活动
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberCollectSubject memberCollectSubject) {
        int rows = memberCollectSubjectService.insertMemberCollectSubject(memberCollectSubject);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员收藏的专题活动
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberCollectSubject memberCollectSubject) {
        int rows = memberCollectSubjectService.updateMemberCollectSubject(memberCollectSubject);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员收藏的专题活动
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberCollectSubjectService.deleteMemberCollectSubjectByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
