package com.lnt.mvc.dao;

import java.util.List;
import com.lnt.mvc.model.Department;
import com.lnt.mvc.model.EmployeeDetails;

public interface IDepartmentDao {
public void createDepartment(Department department);
public void updateDepartment(Department department);
public void deleteDepartment(int id);
public List<Department>getAllDepartment();
public Department getDepartment(int Id);
}
