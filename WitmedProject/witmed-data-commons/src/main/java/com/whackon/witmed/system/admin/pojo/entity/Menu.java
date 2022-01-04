package com.whackon.witmed.system.admin.pojo.entity;

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
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 6494472229034048736L;
	private Long id;                        // 主键
	private String code;                    // 角色编码
	private Menu parent;                    // 上级菜单
	private String text;                    // 菜单文本
	private String url;                     // 链接地址
	private String icon;                    // 菜单图标样式
	private String sort;                    // 排序
}
