package br.com.azusah.relationship.service;

import br.com.azusah.relationship.model.Employee;
import br.com.azusah.relationship.repository.EmployeeRepository;
import br.com.azusah.relationship.repository.entity.EmployeeEntity;
import br.com.azusah.relationship.repository.entity.SkillEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public void save(Employee employee) {
        repository.save(EmployeeEntity.builder()
                .name(employee.getName())
                .skills(employee.getSkills().stream()
                        .map(s -> SkillEntity.builder()
                                .id(s.getId())
                                .name(s.getName())
                                .build())
                        .collect(Collectors.toSet()))
                .build());
    }
}
