package com.lberou.crud.dto;

import java.time.LocalDate;

public class PersonalDetailsDTO {
    private String name;
    private String middleName;
    private String surname;
    private String email;
    private LocalDate birthDate;

    public PersonalDetailsDTO() {
    }

    public PersonalDetailsDTO(String name, String middleName, String surname, String email, LocalDate birthDate) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
