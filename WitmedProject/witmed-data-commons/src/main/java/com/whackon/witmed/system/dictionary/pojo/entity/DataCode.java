package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 数据元值域代码实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_data_code")
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = -5094789723207950896L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "parent")
	private String parent;                   // 上级数据元
	@TableField(value = "code")
	private String code;                     // 数据元值域
	@TableField(value = "remark")
	private String remark;                   // 数据元说明
}
