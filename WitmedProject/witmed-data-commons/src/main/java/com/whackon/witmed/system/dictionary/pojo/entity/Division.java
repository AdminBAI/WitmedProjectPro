package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 行政区划实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_division")
public class Division extends BaseEntity {
	private static final long serialVersionUID = 3932784477176161651L;
	@TableId(type = IdType.NONE)
	private String id;                           // 主键
	@TableField(value = "parent")
	private String parent;                      // 上级行政区划
	@TableField(value = "code")
	private String code;                        // 行政区划编码
	@TableField(value = "name")
	private String name;                        // 行政区划名称
}
