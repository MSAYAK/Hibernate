package com.lti.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class Task extends Module implements Serializable{
	private String TaskName;

	public String getTaskName() {
		return TaskName;
	}

	public void setTaskName(String taskName) {
		TaskName = taskName;
	}

	public Task(String taskName) {
		super();
		TaskName = taskName;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Task [TaskName=" + TaskName + "]";
	}

	

}
