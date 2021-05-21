package br.com.azusah.relationship.controller;

import br.com.azusah.relationship.controller.dto.EmployeeDto;
import br.com.azusah.relationship.controller.dto.SkillDto;
import br.com.azusah.relationship.model.Employee;
import br.com.azusah.relationship.model.Skill;
import br.com.azusah.relationship.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    EmployeeDto save(@RequestBody EmployeeDto dto) {
        Employee model = service.save(Employee.builder()
                .name(dto.getName())
                .skills(dto.getSkills().stream()
                        .map(s -> Skill.builder()
                                .id(s.getId())
                                .name(s.getName()).build())
                        .collect(Collectors.toSet()))
                .build());

        return EmployeeDto.builder()
                .id(model.getId())
                .name(model.getName())
                .skills(model.getSkills().stream()
                        .map(s -> SkillDto.builder()
                                .id(s.getId())
                                .name(s.getName())
                                .build())
                        .collect(Collectors.toSet()))
                .build();
    }
}
