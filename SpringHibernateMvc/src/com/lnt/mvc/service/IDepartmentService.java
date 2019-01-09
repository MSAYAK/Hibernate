package com.lnt.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lnt.mvc.model.Department;
@Service
public interface IDepartmentService {
public void addDepartment(Department d);
public void updateDepartment(Department d);
public void deleteDepartment(int id);
public List<Department> listAllDepartment();
public Department departmentById(int id);

}
