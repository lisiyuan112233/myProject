package com.sia.product.controller;

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
import com.sia.product.domain.PmsCommentReplay;
import com.sia.product.service.IPmsCommentReplayService;
import com.sia.product.common.Result;

/**
 * 商品评价回复关系Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/replay")
public class PmsCommentReplayController
{
    @Autowired
    private IPmsCommentReplayService pmsCommentReplayService;

    /**
     * 查询商品评价回复关系列表
     */
    @GetMapping("/list")
    public Result<List<PmsCommentReplay>> list(PmsCommentReplay pmsCommentReplay)
    {
        List<PmsCommentReplay> list = pmsCommentReplayService.selectPmsCommentReplayList(pmsCommentReplay);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取商品评价回复关系详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsCommentReplay> getInfo(@PathVariable("id") Long id)
    {
        PmsCommentReplay pmsCommentReplay = pmsCommentReplayService.selectPmsCommentReplayById(id);
        return pmsCommentReplay != null ? Result.success(pmsCommentReplay) : Result.error(404, "数据不存在");
    }

    /**
     * 新增商品评价回复关系
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsCommentReplay pmsCommentReplay)
    {
        int rows = pmsCommentReplayService.insertPmsCommentReplay(pmsCommentReplay);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改商品评价回复关系
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsCommentReplay pmsCommentReplay)
    {
        int rows = pmsCommentReplayService.updatePmsCommentReplay(pmsCommentReplay);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除商品评价回复关系
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsCommentReplayService.deletePmsCommentReplayByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
