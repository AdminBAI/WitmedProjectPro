package com.whackon.witmed.entity.emr.clinicobs;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>急诊留观病历现病史详情表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_clinic_obs_present")
public class ClinicObsPresent extends BaseEntity {
	private static final long serialVersionUID = 2353701476151659483L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicObs")
	private String emrClinicObs;                        // 所属急诊留观病历
	@TableField(value = "onsetDate")
	private Date onsetDate;                        // 起病时间
	@TableField(value = "onsetDesc")
	private String onsetDesc;                        // 起病情况描述
	@TableField(value = "sxOnsetReason")
	private String sxOnsetReason;                        // 症状开始原因/诱因
	@TableField(value = "sxCh")
	private String sxCh;                        // 症状特点
	@TableField(value = "sxAcc")
	private String sxAcc;                        // 伴随症状
	@TableField(value = "pastTrt")
	private String pastTrt;                        // 本疾病既往诊疗经过
	@TableField(value = "baseTrt")
	private String baseTrt;                        // 基础疾病诊疗情况
}