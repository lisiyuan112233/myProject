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
 * 秒杀商品通知订阅对象 sms_seckill_sku_notice
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SeckillSkuNoticeMapper.SeckillSkuNoticeResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SeckillSkuNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** member_id */
    private Long memberId;

    /** sku_id */
    private Long skuId;

    /** 活动场次id */
    private Long sessionId;

    /** 订阅时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date subcribeTime;

    /** 发送时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /** 通知方式[0-短信，1-邮件] */
    private Integer noticeType;
}

