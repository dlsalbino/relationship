package br.com.azusah.relationship.model;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Employee {

    private Long id;
    private String name;
    private Set<Skill> skills;
}
