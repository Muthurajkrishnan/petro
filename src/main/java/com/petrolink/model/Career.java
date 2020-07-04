package com.petrolink.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Career")

public class Career {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String role;
	
	@Column
	private String jobSummary;
	
	@Column
	private String jobDescription;
	
	@Column
	private boolean status;
	
	@Column
	private Date createdDate;
	
	@Column
	private Date lastUpdatedDate;
	
		
	public Career() {
		super();
	}


	public Career(Integer id, String role, String jobSummary, String jobDescription, boolean status, Date createdDate,
			Date lastUpdatedDate) {
		super();
		this.id = id;
		this.role = role;
		this.jobSummary = jobSummary;
		this.jobDescription = jobDescription;
		this.status = status;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getJobSummary() {
		return jobSummary;
	}


	public void setJobSummary(String jobSummary) {
		this.jobSummary = jobSummary;
	}


	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}


	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	
	
}
