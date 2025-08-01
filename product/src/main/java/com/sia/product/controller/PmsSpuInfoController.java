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
import com.sia.product.domain.PmsSpuInfo;
import com.sia.product.service.IPmsSpuInfoService;
import com.sia.product.common.Result;

/**
 * spu信息Controller
 * 
 * @author ruoyi
 * @date 2025-07-30
 */
@RestController
@RequestMapping("/system/spu-info")
public class PmsSpuInfoController
{
    @Autowired
    private IPmsSpuInfoService pmsSpuInfoService;

    /**
     * 查询spu信息列表
     */
    @GetMapping("/list")
    public Result<List<PmsSpuInfo>> list(PmsSpuInfo pmsSpuInfo)
    {
        List<PmsSpuInfo> list = pmsSpuInfoService.selectPmsSpuInfoList(pmsSpuInfo);
        return Result.list(list, (long) list.size());
    }

    /**
     * 获取spu信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<PmsSpuInfo> getInfo(@PathVariable("id") Long id)
    {
        PmsSpuInfo pmsSpuInfo = pmsSpuInfoService.selectPmsSpuInfoById(id);
        return pmsSpuInfo != null ? Result.success(pmsSpuInfo) : Result.error(404, "数据不存在");
    }

    /**
     * 新增spu信息
     */
    @PostMapping
    public Result<Void> add(@RequestBody PmsSpuInfo pmsSpuInfo)
    {
        int rows = pmsSpuInfoService.insertPmsSpuInfo(pmsSpuInfo);
        return Result.result(rows, "新增成功", "新增失败");
    }

    /**
     * 修改spu信息
     */
    @PutMapping
    public Result<Void> edit(@RequestBody PmsSpuInfo pmsSpuInfo)
    {
        int rows = pmsSpuInfoService.updatePmsSpuInfo(pmsSpuInfo);
        return Result.result(rows, "修改成功", "修改失败");
    }

    /**
     * 删除spu信息
     */
    @DeleteMapping("/{ids}")
    public Result<Void> remove(@PathVariable Long[] ids)
    {
        int rows = pmsSpuInfoService.deletePmsSpuInfoByIds(ids);
        return Result.result(rows, "删除成功", "删除失败");
    }
}
