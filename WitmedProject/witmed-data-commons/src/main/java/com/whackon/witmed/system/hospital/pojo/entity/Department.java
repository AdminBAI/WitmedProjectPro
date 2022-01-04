package com.whackon.witmed.system.hospital.pojo.entity;

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
public class Department extends BaseEntity {
	private static final long serialVersionUID = -5793475151487271519L;
	private Long id;                        // 主键
	private Hospital hospital;              // 所在医院
	private Department parent;              // 上级部门
	private String code;                    // 部门编码
	private String name;                    // 部门名称
}
