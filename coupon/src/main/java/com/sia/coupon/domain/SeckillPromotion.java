package com.sia.coupon.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.coupon.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 秒杀活动对象 sms_seckill_promotion
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SeckillPromotionMapper.SeckillPromotionResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SeckillPromotion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 活动标题 */
    private String title;

    /** 开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /** 结束日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /** 上下线状态 */
    private Integer status;

    /** 创建人 */
    private Long userId;
}

