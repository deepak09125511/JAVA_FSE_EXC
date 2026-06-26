package com.deepak.EmployeeManagementSystem;

import com.deepak.EmployeeManagementSystem.Model.Employee;
import com.deepak.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    private EmployeeRepository repo;
    public EmployeeService(EmployeeRepository repo){
        this.repo = repo;
    }

    public Employee addEmp(Employee employee){
        repo.save(employee);
        return employee;
    }


    public List<Employee> printBack() {
        return repo.findAll();
    }
}
