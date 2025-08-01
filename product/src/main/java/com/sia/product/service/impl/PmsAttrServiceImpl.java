package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.product.mapper.PmsAttrMapper;
import com.sia.product.domain.PmsAttr;
import com.sia.product.service.IPmsAttrService;

/**
 * 商品属性Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@Service
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrMapper, PmsAttr> implements IPmsAttrService {
    @Autowired
    private PmsAttrMapper pmsAttrMapper;

    /**
     * 查询商品属性
     *
     * @param attrId 商品属性主键
     * @return 商品属性
     */
    @Override
    public PmsAttr selectPmsAttrByAttrId(Long attrId) {
        return pmsAttrMapper.selectPmsAttrByAttrId(attrId);
    }

    /**
     * 查询商品属性列表
     *
     * @param pmsAttr 商品属性
     * @return 商品属性
     */
    @Override
    public List<PmsAttr> selectPmsAttrList(PmsAttr pmsAttr) {
        return pmsAttrMapper.selectPmsAttrList(pmsAttr);
    }

    /**
     * 新增商品属性
     *
     * @param pmsAttr 商品属性
     * @return 结果
     */
    @Override
    public int insertPmsAttr(PmsAttr pmsAttr) {
            return pmsAttrMapper.insertPmsAttr(pmsAttr);
    }

    /**
     * 修改商品属性
     *
     * @param pmsAttr 商品属性
     * @return 结果
     */
    @Override
    public int updatePmsAttr(PmsAttr pmsAttr) {
        return pmsAttrMapper.updatePmsAttr(pmsAttr);
    }

    /**
     * 批量删除商品属性
     *
     * @param attrIds 需要删除的商品属性主键
     * @return 结果
     */
    @Override
    public int deletePmsAttrByAttrIds(Long[] attrIds) {
        return pmsAttrMapper.deletePmsAttrByAttrIds(attrIds);
    }

    /**
     * 删除商品属性信息
     *
     * @param attrId 商品属性主键
     * @return 结果
     */
    @Override
    public int deletePmsAttrByAttrId(Long attrId) {
        return pmsAttrMapper.deletePmsAttrByAttrId(attrId);
    }
}
