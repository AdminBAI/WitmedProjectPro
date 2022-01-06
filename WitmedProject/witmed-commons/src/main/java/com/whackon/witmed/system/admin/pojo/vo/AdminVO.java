package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import com.whackon.witmed.system.dictionary.pojo.vo.EducationVO;
import com.whackon.witmed.system.dictionary.pojo.vo.IdentityVO;
import com.whackon.witmed.system.hospital.pojo.vo.DepartmentVO;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户视图信息</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 811957010974699686L;
	private String id;                             // 主键
	private String no;                             // 工号
	private String name;                           // 姓名
	private String cellphone;                      // 手机号码
	private String password;                       // 登录密码
	private String roleVO;                         // 角色
	private String identityVO;                     // 身份
	private String departmentVO;                   // 所在部门
	private String  techPos;                       // 服务者专业技术职务
	private String educationVO;                    // 学历
	private String  techPosRank;                   // 服务者专业技术职务等级
}
