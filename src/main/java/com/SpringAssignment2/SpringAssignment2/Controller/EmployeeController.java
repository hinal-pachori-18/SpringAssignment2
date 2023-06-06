package com.SpringAssignment2.SpringAssignment2.Controller;

import com.SpringAssignment2.SpringAssignment2.Service.EmployeeService;
import com.SpringAssignment2.SpringAssignment2.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return this.employeeService.showAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable String empId)
    {
        return this.employeeService.showEmployeeById(Long.parseLong(empId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employees/{empId}")
    @ResponseBody
    public String deleteEmployee(@PathVariable String empId)
    {
        try {
            this.employeeService.deleteEmployee(Long.parseLong(empId));
            return "Successfully deleted";
        }
        catch (Exception e)
        {
            return "Not deleted";
        }
    }
}
