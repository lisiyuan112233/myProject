package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 采购信息详情对象 wms_purchase_detail
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_purchase_detail")
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 采购单id */
    private Long purchaseId;

    /** 采购商品id */
    private Long skuId;

    /** 采购数量 */
    private Integer skuNum;

    /** 采购金额 */
    private BigDecimal skuPrice;

    /** 仓库id */
    private Long wareId;

    /** 状态[0新建，1已分配，2正在采购，3已完成，4采购失败] */
    private Integer status;
}
