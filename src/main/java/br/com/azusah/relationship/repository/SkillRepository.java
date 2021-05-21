package br.com.azusah.relationship.repository;

import br.com.azusah.relationship.repository.entity.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<SkillEntity, Long> {
}
