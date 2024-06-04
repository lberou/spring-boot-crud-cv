package com.lberou.crud.dto;

import java.time.LocalDate;

public class EducationDTO {
    private Long id;
    private String title;
    private String institution;
    private LocalDate graduationDate;

    public EducationDTO() {
    }

    public EducationDTO(Long id, String title, String institution, LocalDate graduationDate) {
        this.id = id;
        this.title = title;
        this.institution = institution;
        this.graduationDate = graduationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }
}
