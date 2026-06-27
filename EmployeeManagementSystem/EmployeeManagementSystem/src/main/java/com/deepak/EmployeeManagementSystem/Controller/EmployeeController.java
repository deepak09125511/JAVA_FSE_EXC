package com.deepak.EmployeeManagementSystem.Controller;

import com.deepak.EmployeeManagementSystem.Service.EmployeeService;
import com.deepak.EmployeeManagementSystem.Model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Stack;

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
    @GetMapping("/get/{name}")
    public Employee print2(@PathVariable String name){
        return empServ.printBack2(name);
    }
    @GetMapping("/get/sp")
    public Page<Employee> getEmployees(@RequestParam int page,
                                       @RequestParam int size,
                                       @RequestParam String sortBy){
        return empServ.getEmployeePagination(
                page,size,sortBy
        );
    }
}
