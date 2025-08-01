package com.sia.product.domain;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * spu信息对象 pms_spu_info
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSpuInfoMapper.PmsSpuInfoResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSpuInfo extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 商品id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 商品名称 */
    private String spuName;

    /** 商品描述 */
    private String spuDescription;

    /** 所属分类id */
    private Long catalogId;

    /** 品牌id */
    private Long brandId;

    /** 重量 */
    private BigDecimal weight;

    /** 上架状态[0 - 下架，1 - 上架] */
    private Integer publishStatus;
}


