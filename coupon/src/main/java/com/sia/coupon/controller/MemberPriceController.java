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
import com.sia.coupon.domain.MemberPrice;
import com.sia.coupon.service.IMemberPriceService;
import com.sia.coupon.common.Result;

/**
 * 商品会员价格Controller
 * 
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/coupon/memberPrice")
public class MemberPriceController
{
    @Autowired
    private IMemberPriceService memberPriceService;

    /**
     * 查询商品会员价格列表
     */
    @GetMapping("/list")
    public Result<List<MemberPrice>> list(MemberPrice memberPrice) {
        List<MemberPrice> list = memberPriceService.selectMemberPriceList(memberPrice);
        return Result.success(list, "查询成功");
    }

    /**
     * 获取商品会员价格详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<MemberPrice> getInfo(@PathVariable("id") Long id) {
        MemberPrice memberPrice = memberPriceService.selectMemberPriceById(id);
        return memberPrice != null ? Result.success(memberPrice, "查询成功") : Result.error("数据不存在");
    }

    /**
     * 新增商品会员价格
     */
    @PostMapping
    public Result<Void> add(@RequestBody MemberPrice memberPrice) {
        int rows = memberPriceService.insertMemberPrice(memberPrice);
        return rows > 0 ? Result.success(null, "新增成功") : Result.error("新增失败");
    }

    /**
     * 修改商品会员价格
     */
    @PutMapping
    public Result<Void> edit(@RequestBody MemberPrice memberPrice) {
        int rows = memberPriceService.updateMemberPrice(memberPrice);
        return rows > 0 ? Result.success(null, "修改成功") : Result.error("修改失败");
    }

    /**
     * 删除商品会员价格
     */
	@DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids) {
        int rows = memberPriceService.deleteMemberPriceByIds(ids);
        return rows > 0 ? Result.success(null, "删除成功") : Result.error("删除失败");
    }
}

