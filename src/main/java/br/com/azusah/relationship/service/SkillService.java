package br.com.azusah.relationship.service;

import br.com.azusah.relationship.model.Skill;
import br.com.azusah.relationship.repository.SkillRepository;
import br.com.azusah.relationship.repository.entity.SkillEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository repository;

    public void save(Skill skill) {
        repository.save(SkillEntity.builder().name(skill.getName()).build());
    }
}
