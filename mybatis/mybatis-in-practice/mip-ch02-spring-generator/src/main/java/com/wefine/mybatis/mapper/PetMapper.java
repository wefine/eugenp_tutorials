package com.wefine.mybatis.mapper;

import com.wefine.mybatis.entity.Pet;

import java.util.List;

public interface PetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int insert(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int insertSelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    Pet selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Pet record);

    List<Pet> findAll();
}