package jf.service.impl;

import jf.dao.SysOrganizationMapper;
import jf.pojo.SysOrganization;
import jf.service.SysOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOrganizationImpl implements SysOrganizationService {

    @Autowired
    SysOrganizationMapper sysOrganizationMapper;

    public List<SysOrganization> getOrganizations() {


        List<SysOrganization> sysOrganizations = sysOrganizationMapper.selectAll();
        return sysOrganizations;
    }

    @Override
    public void save(SysOrganization sysOrganization)throws RuntimeException{
        sysOrganizationMapper.insertSelective(sysOrganization);
    }


}
