package com.attence.employee.controller;

import com.attence.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/getDepartmentData", method = {RequestMethod.GET})
    public Map<String, String> getDepartmentData() {
        return departmentService.getDepartmentData();
    }
}
