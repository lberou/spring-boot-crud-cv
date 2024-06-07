package com.lberou.crud.controller;

import com.lberou.crud.dto.EmployeeDTO;
import com.lberou.crud.entity.Employee;
import com.lberou.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/")
    public ResponseEntity<List<EmployeeDTO>> getEmployees(){
        List<EmployeeDTO> users = employeeService.getEmployees();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

//    Without DTO
//    @GetMapping("/")
//    public List<Employee> getEmployees() {
//        return employeeService.getEmployees();
//    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        return employeeService.deleteEmployeeById(id);
    }


}
