package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pid;
	private String pname;
	private String plocation;
	private Date start_date;
	private Date end_date;
	private String pmanager;
	private String sDate;
	private String eDate;

	@OneToMany(mappedBy = "project",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JoinColumn(name = "user_id", nullable = false)
	private List<User> users = new ArrayList<User>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "task_id" , nullable = false)
	private List<Task> tasks = new ArrayList<Task>();
	
	public Project(String pid, String pname, String plocation, String pmanager, String startDate, String endDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = startDate;
		this.eDate = endDate;
	}
	
	public Project(String pname, String plocation, String startDate, String endDate, String pmanager) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.pmanager = pmanager;
		this.sDate = startDate;
		this.eDate = endDate;
	}

	public Project(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
	}

	public Project(String pid, String pname, String plocation, Date start_date, Date end_date, String pmanager,
			List<User> users, List<Task> tasks) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
		this.users = users;
		this.tasks = tasks;
	}

	public Project(String pname, String plocation, Date start_date, Date end_date, String pmanager) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.start_date = start_date;
		this.end_date = end_date;
		this.pmanager = pmanager;
	}

	public Project() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getPmanager() {
		return pmanager;
	}

	public void setPmanager(String pmanager) {
		this.pmanager = pmanager;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public String getStartDate() {
		return sDate;
	}

	public void setStartDate(String startDate) {
		this.sDate = startDate;
	}

	public String getEndDate() {
		return eDate;
	}

	public void setEndDate(String endDate) {
		this.eDate = endDate;
	}

}
