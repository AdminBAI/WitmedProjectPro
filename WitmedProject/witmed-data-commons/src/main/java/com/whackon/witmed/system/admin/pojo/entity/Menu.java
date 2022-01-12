package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 系统菜单功能实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = -2535496865380166958L;
	@TableField(value = "id")
	private Integer id;                        // 主键
	@TableField(value = "code")
	private String code;                       // 角色编码
	@TableField(value = "parent")
	private String parent;                     // 上级菜单
	@TableField(value = "text")
	private String text;                       // 菜单文本
	@TableField(value = "url")
	private String url;                        // 链接地址
	@TableField(value = "icon")
	private String icon;                       // 菜单图标样式
	@TableField(value = "sort")
	private Integer sort;                      // 排序
}
