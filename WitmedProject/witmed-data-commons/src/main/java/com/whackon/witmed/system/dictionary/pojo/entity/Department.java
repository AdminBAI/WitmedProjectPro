package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 医院部门实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_department")
public class Department extends BaseEntity {
	private static final long serialVersionUID = -3089094239808411680L;
	@TableField(value = "id")
	private Integer id;                           // 主键
	@TableField(value = "hospital")
	private String hospital;                     // 所在医院
	@TableField(value = "parent")
	private String parent;                       // 上级部门
	@TableField(value = "code")
	private String code;                         // 部门编码
	@TableField(value = "name")
	private String name;                         // 部门名称
}
