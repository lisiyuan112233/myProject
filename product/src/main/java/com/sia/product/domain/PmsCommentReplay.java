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
 * 商品评价回复关系对象 pms_comment_replay
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.product.mapper.PmsCommentReplayMapper.PmsCommentReplayResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsCommentReplay extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 评论id */
    private Long commentId;

    /** 回复id */
    private Long replyId;
}


