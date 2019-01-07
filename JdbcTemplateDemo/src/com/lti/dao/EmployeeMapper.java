package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.RowMapper;

import com.lti.model.Employee;

public class EmployeeMapper implements RowMapper {
public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
	Employee e =new Employee();
	e.setEid(rs.getInt("eid"));
	e.setEname(rs.getString("ename"));
	e.setEage(rs.getInt("eage"));
	e.setSalary(rs.getFloat("salary"));
	return e;
}


}
