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
 * 首页轮播广告对象 sms_home_adv
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.HomeAdvMapper.HomeAdvResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class HomeAdv extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 名字 */
    private String name;

    /** 图片地址 */
    private String pic;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /** 状态 */
    private Integer status;

    /** 点击数 */
    private Long clickCount;

    /** 广告详情连接地址 */
    private String url;

    /** 备注 */
    private String note;

    /** 排序 */
    private Long sort;

    /** 发布者 */
    private Long publisherId;

    /** 审核者 */
    private Long authId;
}

