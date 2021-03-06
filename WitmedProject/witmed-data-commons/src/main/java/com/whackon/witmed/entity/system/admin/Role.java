package com.whackon.witmed.entity.system.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统角色信息表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_role")
public class Role extends BaseEntity {
	private static final long serialVersionUID = -822442149059722017L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键
	@TableField(value = "code")
	private String code;                        // 角色编码
	@TableField(value = "name")
	private String name;                        // 角色名称
}