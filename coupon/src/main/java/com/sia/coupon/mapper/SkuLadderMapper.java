package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.SkuLadder;

/**
 * 商品阶梯价格Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface SkuLadderMapper extends BaseMapper<SkuLadder> {
    /**
     * 查询商品阶梯价格
     *
     * @param id 商品阶梯价格主键
     * @return 商品阶梯价格
     */
    public SkuLadder selectSkuLadderById(Long id);

    /**
     * 查询商品阶梯价格列表
     *
     * @param skuLadder 商品阶梯价格
     * @return 商品阶梯价格集合
     */
    public List<SkuLadder> selectSkuLadderList(SkuLadder skuLadder);

    /**
     * 新增商品阶梯价格
     *
     * @param skuLadder 商品阶梯价格
     * @return 结果
     */
    public int insertSkuLadder(SkuLadder skuLadder);

    /**
     * 修改商品阶梯价格
     *
     * @param skuLadder 商品阶梯价格
     * @return 结果
     */
    public int updateSkuLadder(SkuLadder skuLadder);

    /**
     * 删除商品阶梯价格
     *
     * @param id 商品阶梯价格主键
     * @return 结果
     */
    public int deleteSkuLadderById(Long id);

    /**
     * 批量删除商品阶梯价格
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSkuLadderByIds(Long[] ids);
}
