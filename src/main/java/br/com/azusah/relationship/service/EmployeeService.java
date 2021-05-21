package br.com.azusah.relationship.service;

import br.com.azusah.relationship.model.Employee;
import br.com.azusah.relationship.repository.EmployeeEntity;
import br.com.azusah.relationship.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public void save(Employee employee) {
        repository.save(EmployeeEntity.builder().name("Daniel").build());
    }
}
