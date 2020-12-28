package com.attence.employee.controller;

import com.attence.employee.service.EmployeeService;
import com.attence.employee.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee/getEmployeeList")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeData();
    }

    @RequestMapping("/employee/createEmployee")
    public void createEmployee(@RequestBody Map<String, String> form) {
        employeeService.createEmployee(form);
    }

    @RequestMapping("/employee/getEmployeeName")
    public String getEmployeeName(String employeeId) {
        return employeeService.getEmployeeNameById(employeeId);
    }

}
