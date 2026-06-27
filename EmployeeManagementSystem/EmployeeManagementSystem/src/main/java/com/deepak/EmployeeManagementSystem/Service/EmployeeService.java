package com.deepak.EmployeeManagementSystem.Service;

import com.deepak.EmployeeManagementSystem.Model.Employee;
import com.deepak.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public Employee printBack2(String name) {
        return repo.findByName(name);
    }

    public Page<Employee> getEmployeePagination(
            int page,
            int size,
            String sortBy) {

        Pageable pageable =
                PageRequest.of(
                        page,
                        size,
                        Sort.by(sortBy));

        return repo.findAll(pageable);
    }
}
