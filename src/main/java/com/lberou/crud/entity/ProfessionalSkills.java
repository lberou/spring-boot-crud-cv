package com.lberou.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class ProfessionalSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String skill;
    private String level;

    public ProfessionalSkills() {
    }

    public ProfessionalSkills(String skill, String level) {
        this.skill = skill;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessionalSkills that = (ProfessionalSkills) o;
        return Objects.equals(skill, that.skill) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skill, level);
    }
}
