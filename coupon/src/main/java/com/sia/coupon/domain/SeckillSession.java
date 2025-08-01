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
 * 秒杀活动场次对象 sms_seckill_session
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.SeckillSessionMapper.SeckillSessionResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class SeckillSession extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 场次名称 */
    private String name;

    /** 每日开始时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    private Date startTime;

    /** 每日结束时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    private Date endTime;

    /** 启用状态 */
    private Integer status;
}

