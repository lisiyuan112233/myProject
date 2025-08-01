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
import com.sia.product.domain.PmsSpuComment;
import com.sia.product.service.IPmsSpuCommentService;
import com.sia.product.common.Result;

/**
 * 商品评价Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/comment")
public class PmsSpuCommentController
{
    @Autowired
    private IPmsSpuCommentService pmsSpuCommentService;

    /**
     * 查询商品评价列表
     */
    @GetMapping("/list")
    public Result<List<PmsSpuComment>> list(PmsSpuComment pmsSpuComment)
    {
        List<PmsSpuComment> list = pmsSpuCommentService.selectPmsSpuCommentList(pmsSpuComment);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取商品评价详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsSpuComment> getInfo(@PathVariable("id") Long id)
    {
        PmsSpuComment pmsSpuComment = pmsSpuCommentService.selectPmsSpuCommentById(id);
        return pmsSpuComment != null ? Result.success(pmsSpuComment) : Result.error(404, "数据不存在");
    }

    /**
     * 新增商品评价
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSpuComment pmsSpuComment)
    {
        int rows = pmsSpuCommentService.insertPmsSpuComment(pmsSpuComment);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改商品评价
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSpuComment pmsSpuComment)
    {
        int rows = pmsSpuCommentService.updatePmsSpuComment(pmsSpuComment);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除商品评价
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsSpuCommentService.deletePmsSpuCommentByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
