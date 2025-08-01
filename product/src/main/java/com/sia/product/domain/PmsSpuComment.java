package com.sia.product.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.product.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品评价对象 pms_spu_comment
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsSpuCommentMapper.PmsSpuCommentResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsSpuComment extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** sku_id */
    private Long skuId;

    /** spu_id */
    private Long spuId;

    /** 商品名字 */
    private String spuName;

    /** 会员昵称 */
    private String memberNickName;

    /** 星级 */
    private Long star;

    /** 会员ip */
    private String memberIp;

    /** 显示状态[0-不显示，1-显示] */
    private Long showStatus;

    /** 购买时属性组合 */
    private String spuAttributes;

    /** 点赞数 */
    private Long likesCount;

    /** 回复数 */
    private Long replyCount;

    /** 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]] */
    private String resources;

    /** 内容 */
    private String content;

    /** 用户头像 */
    private String memberIcon;

    /** 评论类型[0 - 对商品的直接评论，1 - 对评论的回复] */
    private Integer commentType;
}


