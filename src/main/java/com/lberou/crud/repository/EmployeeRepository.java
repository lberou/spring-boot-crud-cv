package com.lberou.crud.repository;

import com.lberou.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
@Query("SELECT e FROM Employee e JOIN e.personalInformation pi JOIN pi.personalDetails pd WHERE pd.email = ?1")
Optional<Employee> findEmployeeByEmail(String email);
}
