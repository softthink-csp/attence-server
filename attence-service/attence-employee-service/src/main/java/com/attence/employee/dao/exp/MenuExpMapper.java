package com.attence.employee.dao.exp;

import com.attence.employee.domain.Menu;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface MenuExpMapper {

    @Select("select menu.id, menu.path, menu.name, menu.component, menu.showInNavi, menu.parentId from menu " +
                      "inner join menuToRole on menu.id = menuToRole.menuId " +
                      "inner join userToRole on menuToRole.roleId = userToRole.userId " +
                      "inner join user on user.id = userToRole.userId " +
                      "where user.username = #{username} order by id")
    @MapKey("id")
    public Map<Integer, Menu> getMenuInfoByUser(@Param("username") String userName);
}
