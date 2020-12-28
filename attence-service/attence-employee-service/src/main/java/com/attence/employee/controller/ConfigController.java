package com.attence.employee.controller;

import com.attence.employee.service.RouteService;
import com.attence.employee.vo.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConfigController {

    @Autowired
    private RouteService routeService;

    @ResponseBody
    @RequestMapping("/getMenuData")
    public List<Route> login(@RequestParam String username) {
        List<Route> routeData =  routeService.getRouteData(username);
        return routeData;
    }

}
