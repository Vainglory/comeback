package jf.service;


import jf.pojo.SysOrganization;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "COMEBACK-SERVICE")
public interface SysOrganizationServiceFeign {

    @RequestMapping(value = "organizationService/getAll",method=RequestMethod.GET)
    public List<SysOrganization> getAll();

    @RequestMapping(value = "organizationService/save",method=RequestMethod.POST)
    String save(SysOrganization sysOrganization);
}
