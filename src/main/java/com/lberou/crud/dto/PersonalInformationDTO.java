package com.lberou.crud.dto;

import com.lberou.crud.entity.Address;
import com.lberou.crud.entity.PersonalDetails;
import com.lberou.crud.entity.PhoneNumbers;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class PersonalInformationDTO {
    private Long id;
    private PersonalDetailsDTO personalDetails;
    private AddressDTO address;
    private List<PhoneNumbersDTO> phoneNumbers;

    public PersonalInformationDTO() {
        this.phoneNumbers=new ArrayList<>();
    }

    public PersonalInformationDTO(Long id, PersonalDetailsDTO personalDetails, AddressDTO address, List<PhoneNumbersDTO> phoneNumbers) {
        this.id = id;
        this.personalDetails = personalDetails;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalDetailsDTO getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetailsDTO personalDetails) {
        this.personalDetails = personalDetails;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public List<PhoneNumbersDTO> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumbersDTO> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
