package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.Project;
import com.mycollab.module.project.domain.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProjectMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    long countByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int deleteByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int insertSelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    List<Project> selectByExampleWithBLOBs(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    List<Project> selectByExample(ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    Project selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Project record, @Param("example") ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKeySelective(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKeyWithBLOBs(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKey(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    Integer insertAndReturnKey(Project value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_project
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    void massUpdateWithSession(@Param("record") Project record, @Param("primaryKeys") List primaryKeys);
}