package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_identity")
public class Identity extends BaseEntity {
	private static final long serialVersionUID = -4951152344228720194L;
	@TableField(value = "id")
	private Integer id;                         // 主键
	@TableField(value = "code")
	private String code;                        // 编码
	@TableField(value = "name")
	private String name;                        // 名称
}
