package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 行政区划视图信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = -89422455837277369L;
	private Long id;                    // 主键
	private DivisionVO parentVO;        // 上级区划
	private String code;                // 编码
	private String name;                // 名称
}
