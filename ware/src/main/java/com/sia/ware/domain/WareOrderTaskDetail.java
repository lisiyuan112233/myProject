package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 库存工作单详情对象 wms_ware_order_task_detail
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_ware_order_task_detail")
@Data
@EqualsAndHashCode(callSuper = true)
public class WareOrderTaskDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** sku_name */
    private String skuName;

    /** 购买个数 */
    private Integer skuNum;

    /** 工作单id */
    private Long taskId;
}
