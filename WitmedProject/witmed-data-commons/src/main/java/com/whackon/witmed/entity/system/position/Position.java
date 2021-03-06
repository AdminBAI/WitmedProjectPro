package com.whackon.witmed.entity.system.position;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>职务信息表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_position")
public class Position extends BaseEntity {
	private static final long serialVersionUID = -5920686665727751042L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键
	@TableField(value = "code")
	private String code;                    // 编码
	@TableField(value = "name")
	private String name;                    // 名称
}