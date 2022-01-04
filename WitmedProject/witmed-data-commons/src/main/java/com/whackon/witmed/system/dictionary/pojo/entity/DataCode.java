package com.whackon.witmed.system.dictionary.pojo.entity;

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
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = 77283056160711451L;
	private Long id;                        // 主键
	private DataCode parent;                // 上级数据
	private String code;                    // 编码
	private String name;                    // 名称
}
