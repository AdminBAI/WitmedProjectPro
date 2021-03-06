package com.whackon.witmed.entity.system.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统用户信息表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private static final long serialVersionUID = -2949790311307458387L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "no")
	private String no;                        // 工号
	@TableField(value = "name")
	private String name;                        // 姓名
	@TableField(value = "cellphone")
	private String cellphone;                        // 手机号码
	@TableField(value = "password")
	private String password;                        // 登录密码
	@TableField(value = "role")
	private String role;                        // 角色
	@TableField(value = "identity")
	private String identity;                        // 身份
	@TableField(value = "department")
	private String department;                        // 所在部门
	@TableField(value = "techPostTitle")
	private String techPostTitle;                        // 服务者专业技术职务
	@TableField(value = "education")
	private String education;                        // 学历
	@TableField(value = "techPostRank")
	private String techPostRank;                        // 服务者专业技术职务等级
}