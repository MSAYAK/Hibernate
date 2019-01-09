package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.EmployeeDetails;
@Repository
public interface IEmployeeDetailsDao {
public void createEmployeeDetails(EmployeeDetails edetails);
public void updateEmployeeDetails(EmployeeDetails edetails);
public void deleteEmployeeDetails(int EmployeeDetailsId);
public List<EmployeeDetails>getAllEmployeeDetails();
public EmployeeDetails getEmployeeDetails(int EmployeeDetailsId);
public List<EmployeeDetails>getByName(String name);


}
