package com.example.first_crud_springboot_web.service;

import com.example.first_crud_springboot_web.model.Employee;
import com.example.first_crud_springboot_web.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();  // retuns the full list of all employees
    }
}
