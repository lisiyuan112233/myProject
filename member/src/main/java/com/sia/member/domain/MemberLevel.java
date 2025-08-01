package com.sia.member.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sia.member.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 会员等级对象 ums_member_level
 *
 * @author lsy
 * @date 2025-07-31
 */
@TableName("ums_member_level")
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevel extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /** 等级名称 */
    private String name;

    /** 等级需要的成长值 */
    private Integer growthPoint;

    /** 是否为默认等级[0->不是；1->是] */
    private Integer defaultStatus;

    /** 免运费标准 */
    private java.math.BigDecimal freeFreightPoint;

    /** 每次评价获取的成长值 */
    private Integer commentGrowthPoint;

    /** 是否有免邮特权 */
    private Integer priviledgeFreeFreight;

    /** 是否有会员价格特权 */
    private Integer priviledgeMemberPrice;

    /** 是否有生日特权 */
    private Integer priviledgeBirthday;

    /** 备注 */
    private String note;
}
