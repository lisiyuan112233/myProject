package com.sia.product.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;

import java.io.Serial;
import java.io.Serializable;


/**
 * sku鍥剧墖瀵硅薄 pms_sku_images
 *
 * @author ruoyi
 * @date 2025-07-30
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSkuImagesMapper.PmsSkuImagesResult")
public class PmsSkuImages extends BaseEntity implements Serializable {
@Serial
private static final long serialVersionUID = 1L;

        /** id */
            @TableId(value = "id",type = IdType.ASSIGN_ID)
        private Long id;

        /** sku_id */
        private Long skuId;

        /** 鍥剧墖鍦板潃 */
        private String imgUrl;

        /** 鎺掑簭 */
        private Long imgSort;

        /** 榛樿鍥綶0 - 涓嶆槸榛樿鍥撅紝1 - 鏄粯璁ゅ浘] */
        private Long defaultImg;

        public void setId(Long id)
        {
            this.id = id;
        }

        public Long getId()
        {
            return id;
        }
        public void setSkuId(Long skuId)
        {
            this.skuId = skuId;
        }

        public Long getSkuId()
        {
            return skuId;
        }
        public void setImgUrl(String imgUrl)
        {
            this.imgUrl = imgUrl;
        }

        public String getImgUrl()
        {
            return imgUrl;
        }
        public void setImgSort(Long imgSort)
        {
            this.imgSort = imgSort;
        }

        public Long getImgSort()
        {
            return imgSort;
        }
        public void setDefaultImg(Long defaultImg)
        {
            this.defaultImg = defaultImg;
        }

        public Long getDefaultImg()
        {
            return defaultImg;
        }

@Override
public String toString() {
    return "PmsSkuImages{" +
        "id=" + id +
        ", skuId=" + skuId +
        ", imgUrl='" + imgUrl + '\'' +
        ", imgSort=" + imgSort +
        ", defaultImg=" + defaultImg +
        ", createBy=" + getCreateBy() +
        ", createTime=" + getCreateTime() +
        ", updateBy=" + getUpdateBy() +
        ", updateTime=" + getUpdateTime() +
        ", remark='" + getRemark() + '\'' +
        '}';
}
        }


