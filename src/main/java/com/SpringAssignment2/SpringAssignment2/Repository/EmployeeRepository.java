package com.SpringAssignment2.SpringAssignment2.Repository;

import com.SpringAssignment2.SpringAssignment2.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
