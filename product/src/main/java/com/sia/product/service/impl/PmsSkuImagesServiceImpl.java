package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sia.product.mapper.PmsSkuImagesMapper;
import com.sia.product.domain.PmsSkuImages;
import com.sia.product.service.IPmsSkuImagesService;

/**
 * sku图片Service业务层处理
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@Service
public class PmsSkuImagesServiceImpl extends ServiceImpl<PmsSkuImagesMapper, PmsSkuImages> implements IPmsSkuImagesService {
    @Autowired
    private PmsSkuImagesMapper pmsSkuImagesMapper;

    /**
     * 查询sku图片
     *
     * @param id sku图片主键
     * @return sku图片
     */
    @Override
    public PmsSkuImages selectPmsSkuImagesById(Long id) {
        return pmsSkuImagesMapper.selectPmsSkuImagesById(id);
    }

    /**
     * 查询sku图片列表
     *
     * @param pmsSkuImages sku图片
     * @return sku图片
     */
    @Override
    public List<PmsSkuImages> selectPmsSkuImagesList(PmsSkuImages pmsSkuImages) {
        return pmsSkuImagesMapper.selectPmsSkuImagesList(pmsSkuImages);
    }

    /**
     * 新增sku图片
     *
     * @param pmsSkuImages sku图片
     * @return 结果
     */
    @Override
    public int insertPmsSkuImages(PmsSkuImages pmsSkuImages) {
            return pmsSkuImagesMapper.insertPmsSkuImages(pmsSkuImages);
    }

    /**
     * 修改sku图片
     *
     * @param pmsSkuImages sku图片
     * @return 结果
     */
    @Override
    public int updatePmsSkuImages(PmsSkuImages pmsSkuImages) {
        return pmsSkuImagesMapper.updatePmsSkuImages(pmsSkuImages);
    }

    /**
     * 批量删除sku图片
     *
     * @param ids 需要删除的sku图片主键
     * @return 结果
     */
    @Override
    public int deletePmsSkuImagesByIds(Long[] ids) {
        return pmsSkuImagesMapper.deletePmsSkuImagesByIds(ids);
    }

    /**
     * 删除sku图片信息
     *
     * @param id sku图片主键
     * @return 结果
     */
    @Override
    public int deletePmsSkuImagesById(Long id) {
        return pmsSkuImagesMapper.deletePmsSkuImagesById(id);
    }
}
