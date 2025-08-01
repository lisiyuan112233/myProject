package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsAttrAttrgroupRelation;

/**
 * 属�?属性分组关联Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsAttrAttrgroupRelationMapper extends BaseMapper<PmsAttrAttrgroupRelation> {
    /**
     * 查询属�?属性分组关�?
     *
     * @param id 属�?属性分组关联主�?
     * @return 属�?属性分组关�?
     */
    public PmsAttrAttrgroupRelation selectPmsAttrAttrgroupRelationById(Long id);

    /**
     * 查询属�?属性分组关联列�?
     *
     * @param pmsAttrAttrgroupRelation 属�?属性分组关�?
     * @return 属�?属性分组关联集�?
     */
    public List<PmsAttrAttrgroupRelation> selectPmsAttrAttrgroupRelationList(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 新增属�?属性分组关�?
     *
     * @param pmsAttrAttrgroupRelation 属�?属性分组关�?
     * @return 结果
     */
    public int insertPmsAttrAttrgroupRelation(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 修改属�?属性分组关�?
     *
     * @param pmsAttrAttrgroupRelation 属�?属性分组关�?
     * @return 结果
     */
    public int updatePmsAttrAttrgroupRelation(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 删除属�?属性分组关�?
     *
     * @param id 属�?属性分组关联主�?
     * @return 结果
     */
    public int deletePmsAttrAttrgroupRelationById(Long id);

    /**
     * 批量删除属�?属性分组关�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsAttrAttrgroupRelationByIds(Long[] ids);
}
