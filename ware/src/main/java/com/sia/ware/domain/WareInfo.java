package com.sia.ware.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 仓库信息对象 wms_ware_info
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("wms_ware_info")
@Data
@EqualsAndHashCode(callSuper = true)
public class WareInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 仓库名 */
    private String name;

    /** 仓库地址 */
    private String address;

    /** 区域编码 */
    private String areacode;
}
