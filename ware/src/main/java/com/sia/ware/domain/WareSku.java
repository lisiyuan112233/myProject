package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品库存对象 wms_ware_sku
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_ware_sku")
@Data
@EqualsAndHashCode(callSuper = true)
public class WareSku extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** 仓库id */
    private Long wareId;

    /** 库存数 */
    private Integer stock;

    /** sku_name */
    private String skuName;

    /** 锁定库存 */
    private Integer stockLocked;
}
