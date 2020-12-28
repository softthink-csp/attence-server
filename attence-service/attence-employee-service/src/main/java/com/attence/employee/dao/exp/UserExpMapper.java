package com.attence.employee.dao.exp;

import com.attence.employee.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserExpMapper {

    @Select("select * from user where username = #{username} limit 1")
    User getUserByUserName(@Param("username") String userName);
}
