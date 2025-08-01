package com.sia.member.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.member.domain.MemberReceiveAddress;
import com.sia.member.service.IMemberReceiveAddressService;
import com.sia.member.common.Result;

/**
 * 会员收货地址Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/member/memberReceiveAddress")
public class MemberReceiveAddressController {
    @Autowired
    private IMemberReceiveAddressService memberReceiveAddressService;

    /**
     * 查询会员收货地址列表
     */
    @GetMapping("/list")
    public Result<List<MemberReceiveAddress>> list(MemberReceiveAddress memberReceiveAddress) {
        List<MemberReceiveAddress> list = memberReceiveAddressService.selectMemberReceiveAddressList(memberReceiveAddress);
        return Result.success(list);
    }

    /**
     * 获取会员收货地址详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberReceiveAddress> getInfo(@PathVariable("id") Long id) {
        return Result.success(memberReceiveAddressService.selectMemberReceiveAddressById(id));
    }

    /**
     * 新增会员收货地址
     */
    @PostMapping
    public Result<String> add(@RequestBody MemberReceiveAddress memberReceiveAddress) {
        int rows = memberReceiveAddressService.insertMemberReceiveAddress(memberReceiveAddress);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改会员收货地址
     */
    @PutMapping
    public Result<String> edit(@RequestBody MemberReceiveAddress memberReceiveAddress) {
        int rows = memberReceiveAddressService.updateMemberReceiveAddress(memberReceiveAddress);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除会员收货地址
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = memberReceiveAddressService.deleteMemberReceiveAddressByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
