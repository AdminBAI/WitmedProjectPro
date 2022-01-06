package com.whackon.witmed.system.admin.transport;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <b>系统功能 - 系统用户传输层接口</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "witmed-system-provider")
public interface AdminTransport {

	/**
	 * <b>根据手机号码查询用户对象信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/admin/trans/cellphone")
	AdminVO getAdminVOByCellphone(String cellphone)throws Exception;
}
