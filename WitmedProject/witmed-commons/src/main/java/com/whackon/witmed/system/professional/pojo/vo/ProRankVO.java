package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务等级视图信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class ProRankVO extends BaseVO {
	private static final long serialVersionUID = 7363309550345560124L;
	private Long id;                 // 主键
	private String code;            // 编码
	private String name;            // 名称
}
