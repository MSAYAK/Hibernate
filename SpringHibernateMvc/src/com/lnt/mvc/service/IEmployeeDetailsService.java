package com.lnt.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lnt.mvc.model.EmployeeDetails;
@Service
public interface IEmployeeDetailsService {
public void addDetails(EmployeeDetails employeedetails);
public void updateDetails(EmployeeDetails employeedetails);
public void deleteDetails(int id);
public List<EmployeeDetails> listEmpDetails();
public EmployeeDetails getDetailsById(int id);
public List<EmployeeDetails> getDetailsByName(String name);

}
