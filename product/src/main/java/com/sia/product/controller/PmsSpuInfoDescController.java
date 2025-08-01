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
import com.sia.product.domain.PmsSpuInfoDesc;
import com.sia.product.service.IPmsSpuInfoDescService;
import com.sia.product.common.Result;

/**
 * spu信息介绍Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/desc")
public class PmsSpuInfoDescController
{
    @Autowired
    private IPmsSpuInfoDescService pmsSpuInfoDescService;

    /**
     * 查询spu信息介绍列表
     */
    @GetMapping("/list")
    public Result<List<PmsSpuInfoDesc>> list(PmsSpuInfoDesc pmsSpuInfoDesc)
    {
        List<PmsSpuInfoDesc> list = pmsSpuInfoDescService.selectPmsSpuInfoDescList(pmsSpuInfoDesc);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取spu信息介绍详细信息
     */
    @GetMapping(value = "/{spuId}")
    public Result<PmsSpuInfoDesc> getInfo(@PathVariable("spuId") Long spuId)
    {
        PmsSpuInfoDesc pmsSpuInfoDesc = pmsSpuInfoDescService.selectPmsSpuInfoDescBySpuId(spuId);
        return pmsSpuInfoDesc != null ? Result.success(pmsSpuInfoDesc) : Result.error(404, "数据不存在");
    }

    /**
     * 新增spu信息介绍
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc)
    {
        int rows = pmsSpuInfoDescService.insertPmsSpuInfoDesc(pmsSpuInfoDesc);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改spu信息介绍
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc)
    {
        int rows = pmsSpuInfoDescService.updatePmsSpuInfoDesc(pmsSpuInfoDesc);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除spu信息介绍
     */
    @DeleteMapping("/{spuIds}")
    public Result<Void> remove(@PathVariable Long[] spuIds)
    {
        int rows = pmsSpuInfoDescService.deletePmsSpuInfoDescBySpuIds(spuIds);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
