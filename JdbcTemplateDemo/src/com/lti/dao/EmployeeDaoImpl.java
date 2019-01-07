package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lti.model.Employee;
@Component
public class EmployeeDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject=jdbcTemplateObject;
		
	}


	@Override
	public void create(Employee e) {
String SQL="INSERT INTO Employee(ename,eage,salary) Values(?,?,?)";
jdbcTemplateObject.update(SQL,new Object[] {e.getEname(),e.getEage(),e.getSalary()});
System.out.println("Emplyee Created = "+e.getEname()+ " Age = "+e.getEage()+" Salary = "+e.getSalary());
	}

	@Override
	public Employee getEmployee(Integer eid) {
		String SQL="SELECT * FROM Employee where eid=?";
		Employee e=(Employee)jdbcTemplateObject.queryForObject(SQL, new Object[] {eid},new EmployeeMapper());
		return e;
	}

	@Override
	public List listEmployees() {
	String SQL="SELECT * FROM Employee";
	List elist=(List)jdbcTemplateObject.query(SQL, new EmployeeMapper());
	return elist;
	}

	@Override
	public void delete(Integer eid) {
String SQL="DELETE FROM Employee WHERE eid=?";
jdbcTemplateObject.update(SQL,new Object[] {eid});
System.out.println("Employee Deleted with ID = "+eid);
	}

	@Override
	public void update(Integer eid, Integer eage) {
	
		String SQL="UPDATE Employee SET eage=? WHERE eid=?";
		jdbcTemplateObject.update(SQL, new Object[] {eage,eid});
		System.out.println("Updated Record with ID = "+eid);
	}

}
