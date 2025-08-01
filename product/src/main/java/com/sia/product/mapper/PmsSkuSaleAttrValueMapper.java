package com.sia.product.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.product.domain.PmsSkuSaleAttrValue;

/**
 * sku销售属�?值Mapper接口
 *
 * @author ruoyi
 * @date 2025-07-30
 */
public interface PmsSkuSaleAttrValueMapper extends BaseMapper<PmsSkuSaleAttrValue> {
    /**
     * 查询sku销售属�?�?
     *
     * @param id sku销售属�?值主�?
     * @return sku销售属�?�?
     */
    public PmsSkuSaleAttrValue selectPmsSkuSaleAttrValueById(Long id);

    /**
     * 查询sku销售属�?值列�?
     *
     * @param pmsSkuSaleAttrValue sku销售属�?�?
     * @return sku销售属�?值集�?
     */
    public List<PmsSkuSaleAttrValue> selectPmsSkuSaleAttrValueList(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 新增sku销售属�?�?
     *
     * @param pmsSkuSaleAttrValue sku销售属�?�?
     * @return 结果
     */
    public int insertPmsSkuSaleAttrValue(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 修改sku销售属�?�?
     *
     * @param pmsSkuSaleAttrValue sku销售属�?�?
     * @return 结果
     */
    public int updatePmsSkuSaleAttrValue(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 删除sku销售属�?�?
     *
     * @param id sku销售属�?值主�?
     * @return 结果
     */
    public int deletePmsSkuSaleAttrValueById(Long id);

    /**
     * 批量删除sku销售属�?�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePmsSkuSaleAttrValueByIds(Long[] ids);
}
