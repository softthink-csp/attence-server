package com.attence.employee.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private String employeeId;
    private String name;
    private String departmentName;
    private String startDate;
    private String post;
    private String status;
    private String phone;

}
