package com.wefine.mybatis.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.loc_name
     *
     * @mbg.generated
     */
    private String locName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.id
     *
     * @return the value of dept.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.id
     *
     * @param id the value for dept.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.name
     *
     * @return the value of dept.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.name
     *
     * @param name the value for dept.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.loc_name
     *
     * @return the value of dept.loc_name
     *
     * @mbg.generated
     */
    public String getLocName() {
        return locName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.loc_name
     *
     * @param locName the value for dept.loc_name
     *
     * @mbg.generated
     */
    public void setLocName(String locName) {
        this.locName = locName == null ? null : locName.trim();
    }
}