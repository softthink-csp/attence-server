package com.attence.employee.domain;

public class UserToRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..userToRole.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..userToRole.roleId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private Integer roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test..userToRole.userId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    private String userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..userToRole.id
     *
     * @return the value of test..userToRole.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..userToRole.id
     *
     * @param id the value for test..userToRole.id
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..userToRole.roleId
     *
     * @return the value of test..userToRole.roleId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..userToRole.roleId
     *
     * @param roleid the value for test..userToRole.roleId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test..userToRole.userId
     *
     * @return the value of test..userToRole.userId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test..userToRole.userId
     *
     * @param userid the value for test..userToRole.userId
     *
     * @mbg.generated Thu Dec 24 15:07:01 CST 2020
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}