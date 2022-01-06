package com.whackon.witmed.util;

import com.whackon.witmed.system.admin.pojo.entity.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <b>系统功能 - 实体与视图转换工具类</b>
 *
 * @author Administrator
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper TEXT = Mappers.getMapper(PojoMapper.class);

	/**
	 * <b>将实体对象转换为视图对象</b>
	 * @param entity
	 * @return
	 */
	AdminVO parseToVO(Admin entity);
}
