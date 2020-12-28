package com.attence.employee.service;


import com.attence.employee.constrant.WebConstrant;
import com.attence.employee.dao.EmployeeMapper;
import com.attence.employee.dao.exp.EmployeeExpMapper;
import com.attence.employee.domain.EmployeeExp;
import com.attence.employee.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeExpMapper employeeExpMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployeeData() {
        List<EmployeeExp>  employeeInfo = employeeExpMapper.getMenuInfoByUser();
        List<Employee> employeesData = new ArrayList<Employee>();
        employeeInfo.forEach(employeeExp -> {
            Employee employee = Employee.builder().employeeId(employeeExp.getEmployeeId())
                    .name(employeeExp.getName())
                    .departmentName(employeeExp.getDepartmentName())
                    .phone(employeeExp.getPhone())
                    .startDate(employeeExp.getStartDate())
                    .post(employeeExp.getPost())
                    .status(employeeExp.getEndDate() == null ? "在职" : "离职")
                    .build();
            employeesData.add(employee);
        });
        return employeesData;
    }

    private String getEmployeeId() {
        String maxEmployeeId = employeeExpMapper.getMaxEmployeeId();
        int currentEmployeeId = Integer.valueOf(maxEmployeeId) + 1;
        return String.format("%010d", currentEmployeeId);
    }

    public void createEmployee(Map<String, String> employeeInfo) {
        com.attence.employee.domain.Employee employee = new com.attence.employee.domain.Employee();
        employee.setId(getEmployeeId());
        employee.setName(employeeInfo.get(WebConstrant.WEB_EMPLOYEE_NAME));
        employee.setBirthday(employeeInfo.get(WebConstrant.WEB_BIRTHDAY));
        employee.setSex(employeeInfo.get(WebConstrant.WEB_SEX));
        employee.setAge(Byte.valueOf(employeeInfo.get(WebConstrant.WEB_AGE)));
        employee.setMail1(employeeInfo.get(WebConstrant.WEB_MAIL1));
        employee.setMail2(employeeInfo.get(WebConstrant.WEB_MAIL2));
        employee.setPhone1(employeeInfo.get(WebConstrant.WEB_PHONE1));
        employee.setPhone2(employeeInfo.get(WebConstrant.WEB_PHONE2));
        employee.setPostid(Integer.valueOf(employeeInfo.get(WebConstrant.WEB_POST)));
        employee.setDepartmentid(Integer.valueOf(employeeInfo.get(WebConstrant.WEB_DEPARTMENT)));
        employee.setStartdate(employeeInfo.get(WebConstrant.WEB_START_DATE));
        employee.setEnddate(employeeInfo.get(WebConstrant.WEB_END_DATE));
        employee.setContent(employeeInfo.get(WebConstrant.WEB_CONTENT));
        employeeMapper.insert(employee);
    }

    public String getEmployeeNameById(String employeeId) {
        return employeeExpMapper.getEmployeeNameById(employeeId);
    }
}
