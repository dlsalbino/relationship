package br.com.azusah.relationship.controller;

import br.com.azusah.relationship.model.Employee;
import br.com.azusah.relationship.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    void save(@RequestBody EmployeeDto employeeDto) {
        service.save(Employee.builder().name(employeeDto.getName()).build());
    }
}