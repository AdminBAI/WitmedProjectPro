package com.whackon.witmed.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.system.admin.pojo.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>系统功能 - 系统用户数据持久层接口</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface AdminDao extends BaseMapper<Admin> {
}
