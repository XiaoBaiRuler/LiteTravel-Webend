package com.LiteTravel.web.mapper;

import com.LiteTravel.web.Model.Region;
import com.LiteTravel.web.Model.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    long countByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int deleteByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int insert(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int insertSelective(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    List<Region> selectByExample(RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    Region selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int updateByPrimaryKeySelective(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_region
     *
     * @mbg.generated Wed Dec 02 11:17:02 CST 2020
     */
    int updateByPrimaryKey(Region record);
}