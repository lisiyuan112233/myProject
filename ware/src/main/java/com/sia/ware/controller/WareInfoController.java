package com.sia.ware.controller;

import java.util.List;

import com.sia.ware.service.IWareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sia.ware.domain.WareInfo;
import com.sia.ware.common.Result;

/**
 * 仓库信息Controller
 *
 * @author lsy
 * @date 2025-07-31
 */
@RestController
@RequestMapping("/ware/wareInfo")
public class WareInfoController {
    @Autowired
    private IWareInfoService wareInfoService;

    /**
     * 查询仓库信息列表
     */
    @GetMapping("/list")
    public Result<List<WareInfo>> list(WareInfo wareInfo) {
        List<WareInfo> list = wareInfoService.selectWareInfoList(wareInfo);
        return Result.success(list);
    }

    /**
     * 获取仓库信息详细信息
     */
    @GetMapping(value = "/{id}")
    public Result<WareInfo> getInfo(@PathVariable("id") Long id) {
        return Result.success(wareInfoService.selectWareInfoById(id));
    }

    /**
     * 新增仓库信息
     */
    @PostMapping
    public Result<String> add(@RequestBody WareInfo wareInfo) {
        int rows = wareInfoService.insertWareInfo(wareInfo);
        return rows > 0 ? Result.success("新增成功") : Result.error("新增失败");
    }

    /**
     * 修改仓库信息
     */
    @PutMapping
    public Result<String> edit(@RequestBody WareInfo wareInfo) {
        int rows = wareInfoService.updateWareInfo(wareInfo);
        return rows > 0 ? Result.success("修改成功") : Result.error("修改失败");
    }

    /**
     * 删除仓库信息
     */
    @DeleteMapping("/{ids}")
    public Result<String> remove(@PathVariable Long[] ids) {
        int rows = wareInfoService.deleteWareInfoByIds(ids);
        return rows > 0 ? Result.success("删除成功") : Result.error("删除失败");
    }
}
