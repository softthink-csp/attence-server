package com.attence.employee.dao;

import com.attence.employee.domain.MenuToRole;
import com.attence.employee.domain.MenuToRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuToRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int deleteByExample(MenuToRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int insert(MenuToRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int insertSelective(MenuToRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    List<MenuToRole> selectByExample(MenuToRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    MenuToRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") MenuToRole record, @Param("example") MenuToRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int updateByExample(@Param("record") MenuToRole record, @Param("example") MenuToRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int updateByPrimaryKeySelective(MenuToRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..menuToRole
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    int updateByPrimaryKey(MenuToRole record);
}