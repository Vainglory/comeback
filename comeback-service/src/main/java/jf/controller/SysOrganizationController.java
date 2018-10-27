package jf.controller;

import jf.pojo.SysOrganization;
import jf.service.SysOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("organizationService/")
@RestController
public class SysOrganizationController {

    @Autowired
    SysOrganizationService service;


    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<SysOrganization> getAll() {
        List<SysOrganization> organizations = service.getOrganizations();
        return organizations;
    }


    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(SysOrganization sysOrganization) {
        String status = "保存成功";
        try {
            service.save(sysOrganization);
        } catch (Exception e) {
            status = "服务异常，保存失败";
            e.printStackTrace();
        }
        return status;
    }

    @RequestMapping("value")
    public void cheer() {
        System.out.println("我。。"); System.out.println("我。。"); System.out.println("我。。");
        System.out.println("我。。");
    }
}
