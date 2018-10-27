package jf.dao;

import java.util.List;
import jf.pojo.SysOrganization;
import jf.pojo.SysOrganizationExample;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizationMapper {
    long countByExample(SysOrganizationExample example);

    int deleteByExample(SysOrganizationExample example);

    List<SysOrganization> selectAll();

    int deleteByPrimaryKey(String id);

    int insert(SysOrganization record);

    int insertSelective(SysOrganization record);

    List<SysOrganization> selectByExample(SysOrganizationExample example);

    SysOrganization selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    int updateByExample(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    int updateByPrimaryKeySelective(SysOrganization record);

    int updateByPrimaryKey(SysOrganization record);
}