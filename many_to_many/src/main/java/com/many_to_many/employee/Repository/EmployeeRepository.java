package com.many_to_many.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emploee.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findAllByEmpId(Long empId);
}
