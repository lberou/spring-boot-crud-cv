package com.lberou.crud.dto;

public class ProfessionalSkillsDTO {

    private Long id;
    private String skill;
    private String level;

    public ProfessionalSkillsDTO() {
    }

    public ProfessionalSkillsDTO(Long id, String skill, String level) {
        this.id = id;
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
}
