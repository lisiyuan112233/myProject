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
 * spu图片对象 pms_spu_images
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSpuImagesMapper.PmsSpuImagesResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSpuImages extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** spu_id */
    private Long spuId;

    /** 图片名 */
    private String imgName;

    /** 图片地址 */
    private String imgUrl;

    /** 顺序 */
    private Integer imgSort;

    /** 是否默认图 */
    private Integer defaultImg;
}


