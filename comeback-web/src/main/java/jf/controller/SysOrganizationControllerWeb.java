package jf.controller;

import com.alibaba.fastjson.JSONObject;
import jf.pojo.SysOrganization;
import jf.service.SysOrganizationServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@RequestMapping(value = "organizationWeb/")
@Controller
public class SysOrganizationControllerWeb {

    @Autowired
    SysOrganizationServiceFeign organizationServiceFeign;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("saveOrganization")
    public String savaOrganization(SysOrganization sysOrganization) {

        String status = organizationServiceFeign.save(sysOrganization);

        return status;
    }

    @ResponseBody
    @RequestMapping("getJson")
    public HashMap<String, Object> getSysOrganizationsToJson() {

        JSONObject jsonObject = new JSONObject();

        List<SysOrganization> organizations = organizationServiceFeign.getAll();

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put("rows", organizations);

        String s = jsonObject.toJSONString(organizations);

        System.out.println(s);

        return objectObjectHashMap;

    }

}
