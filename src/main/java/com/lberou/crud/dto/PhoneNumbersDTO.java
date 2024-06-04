package com.lberou.crud.dto;

public class PhoneNumbersDTO {

    private Long id;
    private String phoneNumber;
    private String type;

    public PhoneNumbersDTO() {
    }

    public PhoneNumbersDTO(Long id, String phoneNumber, String type) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
