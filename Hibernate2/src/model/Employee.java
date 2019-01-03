package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Employee implements Serializable{

private int Id;
private String name;
private String password;
private String email;
private Date emplogin;
private boolean isPermanent;
private Calendar empjoindate;
@javax.persistence.Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
@SequenceGenerator(name="seq",sequenceName="OrclSeq")
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getEmplogin() {
	return emplogin;
}
public void setEmplogin(Date emplogin) {
	this.emplogin = emplogin;
}
public boolean isPermanent() {
	return isPermanent;
}
public void setPermanent(boolean isPermanent) {
	this.isPermanent = isPermanent;
}
@Temporal(TemporalType.DATE)
public Calendar getEmpjoindate() {
	return empjoindate;
}
//@Temporal(TemporalType.TIMESTAMP)
public void setEmpjoindate(Calendar empjoindate) {
	this.empjoindate = empjoindate;
}
public Employee(int id, String name, String password, String email, Date emplogin, boolean isPermanent,
		Calendar empjoindate) {
	super();
	Id = id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.emplogin = emplogin;
	this.isPermanent = isPermanent;
	this.empjoindate = empjoindate;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", name=" + name + ", password=" + password + ", email=" + email + ", emplogin="
			+ emplogin + ", isPermanent=" + isPermanent + ", empjoindate=" + empjoindate + "]";
}

}
