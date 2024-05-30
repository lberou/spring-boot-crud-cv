package com.lberou.crud.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class PersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PersonalDetails personalDetails;

    @Embedded
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "personal_information_id")
    private List<PhoneNumbers> phoneNumbers;

    public PersonalInformation() {
        this.phoneNumbers = new ArrayList<>();
    }

    public PersonalInformation(PersonalDetails personalDetails, Address address, List<PhoneNumbers> phoneNumbers) {
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

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
