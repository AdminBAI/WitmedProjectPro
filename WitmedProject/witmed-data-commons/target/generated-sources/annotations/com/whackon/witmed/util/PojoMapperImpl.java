package com.whackon.witmed.util;

import com.whackon.witmed.entity.system.admin.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T15:29:34+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class PojoMapperImpl implements PojoMapper {

    @Override
    public AdminVO parseToVO(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        AdminVO adminVO = new AdminVO();

        adminVO.setStatus( entity.getStatus() );
        adminVO.setCreatedBy( entity.getCreatedBy() );
        adminVO.setCreatedTime( entity.getCreatedTime() );
        adminVO.setModifiedBy( entity.getModifiedBy() );
        adminVO.setModifiedTime( entity.getModifiedTime() );
        adminVO.setId( entity.getId() );
        adminVO.setNo( entity.getNo() );
        adminVO.setName( entity.getName() );
        adminVO.setCellphone( entity.getCellphone() );
        adminVO.setPassword( entity.getPassword() );

        return adminVO;
    }
}
