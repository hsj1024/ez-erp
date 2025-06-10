package com.ez.erp.service;

import com.ez.erp.domain.Employee;
import com.ez.erp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repository;
    public Employee save(Employee employee) {
        return repository.save(employee);
    }
    public List<Employee> findAll() {
        return repository.findAll();
    }
}