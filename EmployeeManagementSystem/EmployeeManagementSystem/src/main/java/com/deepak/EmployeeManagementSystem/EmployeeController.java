package com.deepak.EmployeeManagementSystem;

import com.deepak.EmployeeManagementSystem.Model.Employee;
import com.deepak.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testing")
public class EmployeeController {
    private final EmployeeService empServ;
    public EmployeeController(EmployeeService empServ){
        this.empServ = empServ;
    }
    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployers(@RequestBody Employee employee){
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        Employee emp = empServ.addEmp(employee);
        return ResponseEntity.ok(emp);
    }
    @GetMapping("/get")
    public List<Employee> print(){
        return empServ.printBack();
    }
}
