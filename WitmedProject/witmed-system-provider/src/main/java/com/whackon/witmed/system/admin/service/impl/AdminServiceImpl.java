package com.whackon.witmed.system.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whackon.witmed.entity.system.admin.Admin;
import com.whackon.witmed.system.admin.dao.AdminDao;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.service.AdminService;
import com.whackon.witmed.util.PojoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>系统功能 - 系统用户业务层接口实现类</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	/**
	 * <b>根据手机号码查询用户对象信息</b>
	 * @param cellphone
	 * @return
	 */
	@Override
	public AdminVO getAdminVOByCellphone(String cellphone) {
		// 使用 MyBatis Plus 的 QueryWrapper 查询对象
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		queryWrapper.eq("cellphone", cellphone);
		// 进项查询
		Admin admin = adminDao.selectOne(queryWrapper);
		// 判断是否查询到
		if(admin != null){
			// 将实体对象转换为视图对象，进行返回给前端对象
			return PojoMapper.TEXT.parseToVO(admin);
		}
		return null;
	}
}
