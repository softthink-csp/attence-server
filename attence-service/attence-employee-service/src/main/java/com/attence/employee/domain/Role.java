package com.attence.employee.domain;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..role.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..role.role
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..role.name
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..role.id
     *
     * @return the value of test..role.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..role.id
     *
     * @param id the value for test..role.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..role.role
     *
     * @return the value of test..role.role
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..role.role
     *
     * @param role the value for test..role.role
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..role.name
     *
     * @return the value of test..role.name
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..role.name
     *
     * @param name the value for test..role.name
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}