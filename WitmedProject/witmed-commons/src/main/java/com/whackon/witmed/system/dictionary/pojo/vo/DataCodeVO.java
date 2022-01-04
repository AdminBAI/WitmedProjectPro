package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 数据元值域代码视图信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = 4570131083874692406L;
	private Long id;                        // 主键
	private DataCodeVO parentVO;            // 上级数据
	private String code;                    // 编码
	private String name;                    // 名称
}
