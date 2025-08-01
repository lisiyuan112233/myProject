package com.sia.order.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.order.domain.RefundInfo;

/**
 * 退款信息Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface RefundInfoMapper extends BaseMapper<RefundInfo> {
    /**
     * 查询退款信�?
     *
     * @param id 退款信息主�?
     * @return 退款信�?
     */
    public RefundInfo selectRefundInfoById(Long id);

    /**
     * 查询退款信息列�?
     *
     * @param refundInfo 退款信�?
     * @return 退款信息集�?
     */
    public List<RefundInfo> selectRefundInfoList(RefundInfo refundInfo);

    /**
     * 新增退款信�?
     *
     * @param refundInfo 退款信�?
     * @return 结果
     */
    public int insertRefundInfo(RefundInfo refundInfo);

    /**
     * 修改退款信�?
     *
     * @param refundInfo 退款信�?
     * @return 结果
     */
    public int updateRefundInfo(RefundInfo refundInfo);

    /**
     * 删除退款信�?
     *
     * @param id 退款信息主�?
     * @return 结果
     */
    public int deleteRefundInfoById(Long id);

    /**
     * 批量删除退款信�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRefundInfoByIds(Long[] ids);
}
