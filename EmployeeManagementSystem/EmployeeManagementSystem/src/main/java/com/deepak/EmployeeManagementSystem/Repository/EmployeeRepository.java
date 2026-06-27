package com.deepak.EmployeeManagementSystem.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.deepak.EmployeeManagementSystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value =
            "SELECT * from Employee e WHERE e.name = :name",
            nativeQuery = true)
    Employee findByName(@Param("name") String name);
}
