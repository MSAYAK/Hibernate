package com.lti.model;

import java.time.LocalDate;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Project {
private int project_id;
private String Title;
private Date StartDate;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(String title, Date startDate) {
	super();
	this.project_id = project_id;
	Title = title;
	StartDate = startDate;
}
@Id
@GeneratedValue(generator="seq_test", strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="seq_test",sequenceName="seq_test")
public int getProject_id() {
	return project_id;
}
public void setProject_id(int project_id) {
	this.project_id = project_id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public Date getStartDate() {
	return StartDate;
}
public void setStartDate(Date startDate) {
	StartDate = startDate;
}
@Override
public String toString() {
	return "Project [project_id=" + project_id + ", Title=" + Title + ", StartDate=" + StartDate + "]";
}

}
