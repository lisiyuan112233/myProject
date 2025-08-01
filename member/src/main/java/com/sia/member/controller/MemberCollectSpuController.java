package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberCollectSpu;
import com.sia.member.service.IMemberCollectSpuService;
import com.sia.member.common.Result;

/**
 * 会员收藏的商品Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberCollectSpu")
public class MemberCollectSpuController {
    @Autowired
    private IMemberCollectSpuService memberCollectSpuService;

    /**
     * 查询会员收藏的商品列表
     */
    @GetMapping("/list")
    public Result<List<MemberCollectSpu>> list(MemberCollectSpu memberCollectSpu) {
        List<MemberCollectSpu> list = memberCollectSpuService.selectMemberCollectSpuList(memberCollectSpu);
        return Result.success(list);
    }

    /**
     * 获取会员收藏的商品详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberCollectSpu> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberCollectSpuService.selectMemberCollectSpuById(id));
    }

    /**
     * 新增会员收藏的商品
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberCollectSpu memberCollectSpu) {
        int rows = memberCollectSpuService.insertMemberCollectSpu(memberCollectSpu);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员收藏的商品
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberCollectSpu memberCollectSpu) {
        int rows = memberCollectSpuService.updateMemberCollectSpu(memberCollectSpu);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员收藏的商品
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberCollectSpuService.deleteMemberCollectSpuByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
