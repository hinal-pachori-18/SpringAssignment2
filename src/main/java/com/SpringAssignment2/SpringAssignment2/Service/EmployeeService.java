package com.SpringAssignment2.SpringAssignment2.Service;

import com.SpringAssignment2.SpringAssignment2.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService{


   public List<Employee> showAllEmployees();

   public Optional<Employee> showEmployeeById(long empId);

   public Employee addEmployee(Employee employee);

   public Employee updateEmployee(Employee employee);

   public void deleteEmployee(long l);
}
