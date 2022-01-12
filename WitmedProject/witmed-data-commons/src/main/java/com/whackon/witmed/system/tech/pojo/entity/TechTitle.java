package com.whackon.witmed.system.tech.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 -专业职务信息表</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_tech_title")
public class TechTitle extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private Integer id;                        // 主键
	@TableField(value = "category")
	private String category;                        // 所属类别
	@TableField(value = "rank")
	private String rank;                        // 所属等级
	@TableField(value = "code")
	private String code;                        // 编码
	@TableField(value = "name")
	private String name;                        // 名称
}