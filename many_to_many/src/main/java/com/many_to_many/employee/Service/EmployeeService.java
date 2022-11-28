package com.many_to_many.employee.Service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emploee.Employee;
import com.many_to_many.employee.Repository.EmployeeRepository;

import project.Entity.Project;
import project.Repository.ProjectRepository;

@Service
public class EmployeeService {
	

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @Autowired
	    private ProjectRepository projectRepository;

	    public void saveEmployee(Employee empObj) {
	        employeeRepository.save(empObj);
	    }

	    public List<Employee> getEmployeeDetails(Long empId) {
	        if (null != empId) {
	            return employeeRepository.findAllByEmpId(empId);
	        } else {
	            return employeeRepository.findAll();
	        }
	    }

	    public void deleteEmployee(Long empId) {
	        employeeRepository.deleteById(empId);
	    }

	    public Employee assignProjectToEmployee(Long empId, Long projectId) {
	        Set<Project> projectSet = null;
	        Employee employee = employeeRepository.findById(empId).get();
	        Project project = projectRepository.findById(projectId).get();
	        projectSet =  employee.getAssignedProjects();
	        projectSet.add(project);
	        employee.setAssignedProjects(projectSet);
	        return employeeRepository.save(employee);
	    }
	}


