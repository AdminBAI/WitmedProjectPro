package com.whackon.witmed.system.dictionary.pojo.entity;

import cn.hutool.log.Log;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 学历实体信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Education extends BaseEntity {
	private static final long serialVersionUID = 5657456268970653359L;
	private Long id;                    // 主键
	private String code;                // 编码
	private String name;                // 名称
}
