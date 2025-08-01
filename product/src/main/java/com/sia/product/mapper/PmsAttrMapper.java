package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsAttr;

/**
 * 商品属性Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsAttrMapper extends BaseMapper<PmsAttr> {
    /**
     * 查询商品属�?
     *
     * @param attrId 商品属性主�?
     * @return 商品属�?
     */
    public PmsAttr selectPmsAttrByAttrId(Long attrId);

    /**
     * 查询商品属性列�?
     *
     * @param pmsAttr 商品属�?
     * @return 商品属性集�?
     */
    public List<PmsAttr> selectPmsAttrList(PmsAttr pmsAttr);

    /**
     * 新增商品属�?
     *
     * @param pmsAttr 商品属�?
     * @return 结果
     */
    public int insertPmsAttr(PmsAttr pmsAttr);

    /**
     * 修改商品属�?
     *
     * @param pmsAttr 商品属�?
     * @return 结果
     */
    public int updatePmsAttr(PmsAttr pmsAttr);

    /**
     * 删除商品属�?
     *
     * @param attrId 商品属性主�?
     * @return 结果
     */
    public int deletePmsAttrByAttrId(Long attrId);

    /**
     * 批量删除商品属�?
     *
     * @param attrIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsAttrByAttrIds(Long[] attrIds);
}
