package com.house.Dao;

import com.house.Bean.Employee;
import com.house.Bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    Employee userIsExist(String uName);
    List<Employee> selectAll();
    List<Employee> selectByArea(@Param("empType") int empType,@Param("empArea") String empArea);
    List<Employee> selectByPart(@Param("empType") int empType,@Param("empArea")String empArea,@Param("empPart") String empPart);
    String checkLogin(String uName);
    List<Employee> selectOneEmployee(@Param("empName")String empName,@Param("empArea")String empArea,@Param("empPart") String empPart);
    Employee selectByUName(String empName);
    String uNameisExist(String empName);
}