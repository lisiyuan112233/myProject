package com.sia.ware.service;

import java.util.List;
import com.sia.ware.domain.WareInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 仓库信息Service接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface IWareInfoService extends IService<WareInfo> {
    /**
     * 查询仓库信息
     *
     * @param id 仓库信息主键
     * @return 仓库信息
     */
    public WareInfo selectWareInfoById(Long id);

    /**
     * 查询仓库信息列表
     *
     * @param wareInfo 仓库信息
     * @return 仓库信息集合
     */
    public List<WareInfo> selectWareInfoList(WareInfo wareInfo);

    /**
     * 新增仓库信息
     *
     * @param wareInfo 仓库信息
     * @return 结果
     */
    public int insertWareInfo(WareInfo wareInfo);

    /**
     * 修改仓库信息
     *
     * @param wareInfo 仓库信息
     * @return 结果
     */
    public int updateWareInfo(WareInfo wareInfo);

    /**
     * 批量删除仓库信息
     *
     * @param ids 需要删除的仓库信息主键集合
     * @return 结果
     */
    public int deleteWareInfoByIds(Long[] ids);

    /**
     * 删除仓库信息信息
     *
     * @param id 仓库信息主键
     * @return 结果
     */
    public int deleteWareInfoById(Long id);
}
