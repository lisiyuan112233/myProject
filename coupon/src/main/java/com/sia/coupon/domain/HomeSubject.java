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
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】对象 sms_home_subject
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName(resultMap = "com.sia.coupon.mapper.HomeSubjectMapper.HomeSubjectResult")
@Data
@EqualsAndHashCode(callSuper = true)
public class HomeSubject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** 专题名字 */
    private String name;

    /** 专题标题 */
    private String title;

    /** 专题副标题 */
    private String subTitle;

    /** 显示状态 */
    private Integer status;

    /** 详情连接 */
    private String url;

    /** 排序 */
    private Integer sort;

    /** 专题图片地址 */
    private String img;
}

