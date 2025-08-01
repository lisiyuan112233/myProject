package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsProductAttrValue;

/**
 * spu属性值Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsProductAttrValueMapper extends BaseMapper<PmsProductAttrValue> {
    /**
     * 查询spu属性�?
     *
     * @param id spu属性值主�?
     * @return spu属性�?
     */
    public PmsProductAttrValue selectPmsProductAttrValueById(Long id);

    /**
     * 查询spu属性值列�?
     *
     * @param pmsProductAttrValue spu属性�?
     * @return spu属性值集�?
     */
    public List<PmsProductAttrValue> selectPmsProductAttrValueList(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 新增spu属性�?
     *
     * @param pmsProductAttrValue spu属性�?
     * @return 结果
     */
    public int insertPmsProductAttrValue(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 修改spu属性�?
     *
     * @param pmsProductAttrValue spu属性�?
     * @return 结果
     */
    public int updatePmsProductAttrValue(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 删除spu属性�?
     *
     * @param id spu属性值主�?
     * @return 结果
     */
    public int deletePmsProductAttrValueById(Long id);

    /**
     * 批量删除spu属性�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsProductAttrValueByIds(Long[] ids);
}
