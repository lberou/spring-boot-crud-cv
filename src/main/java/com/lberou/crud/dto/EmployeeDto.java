package com.lberou.crud.dto;

import com.lberou.crud.entity.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private Long id;
    private PersonalInformationDTO personalInformation;
    private List<EducationDTO> education;
    private List<LanguagesDTO> languages;
    private List<WorkExperienceDTO> workExperiences;
    private List<ProfessionalSkillsDTO> professionalSkills;

    public EmployeeDto() {
        this.education=new ArrayList<>();
        this.languages=new ArrayList<>();
        this.workExperiences=new ArrayList<>();
        this.professionalSkills=new ArrayList<>();
    }

    public EmployeeDto(Long id, PersonalInformationDTO personalInformation, List<EducationDTO> education, List<LanguagesDTO> languages, List<WorkExperienceDTO> workExperiences, List<ProfessionalSkillsDTO> professionalSkills) {
        this.id = id;
        this.personalInformation = personalInformation;
        this.education = education;
        this.languages = languages;
        this.workExperiences = workExperiences;
        this.professionalSkills = professionalSkills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalInformationDTO getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformationDTO personalInformation) {
        this.personalInformation = personalInformation;
    }

    public List<EducationDTO> getEducation() {
        return education;
    }

    public void setEducation(List<EducationDTO> education) {
        this.education = education;
    }

    public List<LanguagesDTO> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesDTO> languages) {
        this.languages = languages;
    }

    public List<WorkExperienceDTO> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperienceDTO> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<ProfessionalSkillsDTO> getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(List<ProfessionalSkillsDTO> professionalSkills) {
        this.professionalSkills = professionalSkills;
    }
}
