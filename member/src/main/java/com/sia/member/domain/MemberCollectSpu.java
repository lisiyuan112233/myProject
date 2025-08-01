package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 会员收藏的商品对象 ums_member_collect_spu
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member_collect_spu")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCollectSpu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 会员id */
    private Long memberId;

    /** spu_id */
    private Long spuId;

    /** spu_name */
    private String spuName;

    /** spu_img */
    private String spuImg;
}
