package com.whackon.witmed.entity.emr.resume;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>病历概要数据通信详情表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_resume_comm")
public class ResumeComm extends BaseEntity {
	private static final long serialVersionUID = 1848274761972107619L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrResume")
	private String emrResume;                        // 所属病历概要数据
	@TableField(value = "phoneCat")
	private String phoneCat;                        // 联系电话-类别
	@TableField(value = "phoneCatCode")
	private String phoneCatCode;                        // 联系电话-类别代码
	@TableField(value = "phoneNo")
	private String phoneNo;                        // 联系电话-号码
	@TableField(value = "email")
	private String email;                        // 电子邮件地址
}