package com.whackon.witmed.system.admin;

import cn.hutool.crypto.digest.MD5;
import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.enums.Status;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import com.whackon.witmed.base.util.BaseConstants;
import com.whackon.witmed.base.util.RedisUtil;
import com.whackon.witmed.base.util.TokenUtil;
import com.whackon.witmed.system.admin.pojo.vo.AdminLoginVO;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统功能 - 系统用户控制层类</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private RedisUtil redisUtil;
	@Autowired
	private AdminTransport adminTransport;
	/**
	 * <b>用户使用登录视图进行用户登录操作</b>
	 * @param adminLoginVO
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public ResponseVO loginAdmin(@RequestBody @Validated AdminLoginVO
			 adminLoginVO, BindingResult result)throws Exception {
		// 先判断错误信息对象 BindingResult 中是否包含错误信息
		if (result.hasErrors()){
			return ResponseVO.error("请填写正确的手机号码和密码");
		}
		// 用户信息校验成功，根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		// 判断所得到的用户信息是否存在
		if (adminVO == null){
			// 此时根据手机号码获得用信息不存在
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 判断用户此时的状态
		if (Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())){
			// 此时用状态为禁用
			return ResponseVO.error("该用户禁止登录系统");
		}
		// 此时为启用状态，给密码进行 MD5 加密 判断密码是否相同
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if (!adminLoginVO.getPassword().equals(password)){
			// 此时密码错误
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 登录成功，生成系统唯一令牌 (Token)
		Map<String,String> claimMap = new HashMap<String,String>();
		claimMap.put("id", adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		// 以 Token 为 key 以用户对象为 value 存储到 Redis中去
		if (redisUtil.saveToRedis(token,adminVO,BaseConstants.EXPIRE_AUTH_SEC)){
			// 存储成功 ，将 token 返回给用户，为了将 token 交给用户存储，可以把 token 绑定
			// 在 HTTP 响应对象的消息头的部分 Authorization
			response.setHeader("Authorization",token);
			return ResponseVO.success("系统登录成功", adminVO);
		}
		return ResponseVO.error("系统登录失败");
	}
}
