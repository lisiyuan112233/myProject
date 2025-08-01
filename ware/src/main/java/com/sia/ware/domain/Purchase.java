package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息对象 wms_purchase
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_purchase")
@Data
@EqualsAndHashCode(callSuper = true)
public class Purchase extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 采购人id */
    private Long assigneeId;

    /** 采购人名 */
    private String assigneeName;

    /** 联系方式 */
    private String phone;

    /** 优先级 */
    private Integer priority;

    /** 状态 */
    private Integer status;

    /** 仓库id */
    private Long wareId;

    /** 总金额 */
    private BigDecimal amount;

}
