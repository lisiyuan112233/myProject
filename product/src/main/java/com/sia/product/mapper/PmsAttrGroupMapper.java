package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsAttrGroup;

/**
 * 属性分组Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsAttrGroupMapper extends BaseMapper<PmsAttrGroup> {
    /**
     * 查询属性分�?
     *
     * @param attrGroupId 属性分组主�?
     * @return 属性分�?
     */
    public PmsAttrGroup selectPmsAttrGroupByAttrGroupId(Long attrGroupId);

    /**
     * 查询属性分组列�?
     *
     * @param pmsAttrGroup 属性分�?
     * @return 属性分组集�?
     */
    public List<PmsAttrGroup> selectPmsAttrGroupList(PmsAttrGroup pmsAttrGroup);

    /**
     * 新增属性分�?
     *
     * @param pmsAttrGroup 属性分�?
     * @return 结果
     */
    public int insertPmsAttrGroup(PmsAttrGroup pmsAttrGroup);

    /**
     * 修改属性分�?
     *
     * @param pmsAttrGroup 属性分�?
     * @return 结果
     */
    public int updatePmsAttrGroup(PmsAttrGroup pmsAttrGroup);

    /**
     * 删除属性分�?
     *
     * @param attrGroupId 属性分组主�?
     * @return 结果
     */
    public int deletePmsAttrGroupByAttrGroupId(Long attrGroupId);

    /**
     * 批量删除属性分�?
     *
     * @param attrGroupIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsAttrGroupByAttrGroupIds(Long[] attrGroupIds);
}
