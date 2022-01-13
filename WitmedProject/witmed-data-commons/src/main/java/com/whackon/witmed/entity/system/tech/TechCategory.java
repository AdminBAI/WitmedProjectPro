package com.whackon.witmed.entity.system.tech;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>专业职务类别信息表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_tech_category")
public class TechCategory extends BaseEntity {
	private static final long serialVersionUID = 6508713390332954012L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键
	@TableField(value = "code")
	private String code;                    // 编码
	@TableField(value = "name")
	private String name;                    // 名称
}