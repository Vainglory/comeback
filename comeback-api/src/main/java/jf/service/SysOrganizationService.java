package jf.service;

import jf.pojo.SysOrganization;

import java.util.List;


public interface SysOrganizationService {

    List<SysOrganization> getOrganizations();

    void save(SysOrganization sysOrganization);

}
