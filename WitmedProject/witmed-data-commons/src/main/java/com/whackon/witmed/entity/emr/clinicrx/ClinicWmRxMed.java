package com.whackon.witmed.entity.emr.clinicrx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>门（急）诊西医处方用药详情表</b>
 *
 * @author Administrator
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_clinic_wm_rx_med")
public class ClinicWmRxMed extends BaseEntity {
	private static final long serialVersionUID = -3647693527897687211L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicRx")
	private String emrClinicRx;                        // 门（急）诊西医处方
	@TableField(value = "medUsage")
	private String medUsage;                        // 药物用法
	@TableField(value = "usageRate")
	private String usageRate;                        // 药物使用-频率
	@TableField(value = "medUnit")
	private String medUnit;                        // 药物使用-剂量单位
	@TableField(value = "perDosage")
	private Double perDosage;                        // 药物使用-次剂量
	@TableField(value = "totalDosage")
	private Double totalDosage;                        // 药物使用-总剂量
	@TableField(value = "wayCode")
	private String wayCode;                        // 药物使用-途径代码
	@TableField(value = "medName")
	private String medName;                        // 药物名称
	@TableField(value = "dosageForm")
	private String dosageForm;                        // 药物剂型代码
	@TableField(value = "medCat")
	private String medCat;                        // 药物类型
	@TableField(value = "medNameCode")
	private String medNameCode;                        // 药物名称代码
}