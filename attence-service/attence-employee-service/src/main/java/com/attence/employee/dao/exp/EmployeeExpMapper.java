package com.attence.employee.dao.exp;

import com.attence.employee.domain.EmployeeExp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeExpMapper {

    @Select("SELECT " +
            "emp.id AS employeeId," +
            "emp.NAME," +
            "dep.NAME AS departmentName," +
            "emp.startDate," +
            "post.NAME AS post," +
            "emp.endDate," +
            "emp.phone1 " +
            "FROM " +
            "employee emp " +
            "LEFT JOIN department dep ON emp.departmentId = dep.id " +
            "LEFT JOIN post ON post.id = emp.postId;")
    List<EmployeeExp> getMenuInfoByUser();

    @Select("select max(id) from employee")
    String getMaxEmployeeId();

    @Select("select name from employee where id = #{id}")
    String getEmployeeNameById(@Param("id") String employeeId);

}
