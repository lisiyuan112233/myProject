package com.sia.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * spu信息介绍对象 pms_spu_info_desc
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSpuInfoDescMapper.PmsSpuInfoDescResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSpuInfoDesc extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** 商品id */
    @TableId(value = "spu_id",type = IdType.ASSIGN_ID)
    private Long spuId;

    /** 商品介绍 */
    private String decript;
}


