package br.com.azusah.relationship.controller;

import br.com.azusah.relationship.controller.dto.SkillDto;
import br.com.azusah.relationship.model.Skill;
import br.com.azusah.relationship.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/skill")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService service;

    @PostMapping
    SkillDto save(@RequestBody SkillDto dto) {

        Skill model = service.save(Skill.builder()
                .name(dto.getName())
                .build());

        return SkillDto.builder()
                .id(model.getId())
                .name(model.getName())
                .build();
    }
}
