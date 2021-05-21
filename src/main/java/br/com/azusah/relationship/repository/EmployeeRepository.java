package br.com.azusah.relationship.repository;

import br.com.azusah.relationship.repository.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
