package com.lberou.crud.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;




@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private PersonalInformation personalInformation;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<Education> education;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<Languages> languages;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<WorkExperience> workExperiences;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<ProfessionalSkills> professionalSkills;

    public Employee() {
        this.education = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.workExperiences = new ArrayList<>();
        this.professionalSkills = new ArrayList<>();
    }

    public Employee(PersonalInformation personalInformation, List<Education> education, List<Languages> languages, List<WorkExperience> workExperiences, List<ProfessionalSkills> professionalSkills) {
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

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<ProfessionalSkills> getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(List<ProfessionalSkills> professionalSkills) {
        this.professionalSkills = professionalSkills;
    }
}

