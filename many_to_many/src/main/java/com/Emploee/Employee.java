package com.Emploee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import project.Entity.Project;

@Entity
public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long empId;
	    private String empName;

	    @ManyToMany
	    @JoinTable(name = "employee_project")
	            @JoinColumn(name = "employee_id")
	             @JoinColumn(name = "project_id")
	    
	    private Set<Project> assignedProjects = new HashSet<>();

		public Long getEmpId() {
			return empId;
		}

		public void setEmpId(Long empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public Set<Project> getAssignedProjects() {
			return assignedProjects;
		}

		public void setAssignedProjects(Set<Project> assignedProjects) {
			this.assignedProjects = assignedProjects;
		}

		public Employee(Long empId, String empName, Set<Project> assignedProjects) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.assignedProjects = assignedProjects;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", assignedProjects=" + assignedProjects + "]";
		}
	    
	    
	}


