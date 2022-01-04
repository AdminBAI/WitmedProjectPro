package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务视图信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class ProTitleVO extends BaseVO {
	private static final long serialVersionUID = -5717484475516625907L;
	private Long id;                 // 主键
	private String category;        // 所属类别
	private String rank;            // 所属等级
	private String code;            // 编码
	private String name;            // 名称
}
