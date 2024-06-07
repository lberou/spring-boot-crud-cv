package com.lberou.crud.mapper;

import com.lberou.crud.dto.*;
import com.lberou.crud.entity.*;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class EmployeeMapper {
    // Convert Employee JPA Entity into EmployeeDto
    public static EmployeeDTO mapToEmployeeDto(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO(
                employee.getId(),
                mapToPersonalInformationDto(employee.getPersonalInformation()),
                employee.getEducation().stream().map(EmployeeMapper::mapToEducationDto).collect(Collectors.toList()),
                employee.getLanguages().stream().map(EmployeeMapper::mapToLanguagesDto).collect(Collectors.toList()),
                employee.getWorkExperiences().stream().map(EmployeeMapper::mapToWorkExperienceDto).collect(Collectors.toList()),
                employee.getProfessionalSkills().stream().map(EmployeeMapper::mapToProfessionalSkillsDto).collect(Collectors.toList())
        );
        return employeeDTO;
    }

    private static PersonalInformationDTO mapToPersonalInformationDto(PersonalInformation personalInformation) {
        return new PersonalInformationDTO(
                personalInformation.getId(),
                mapToPersonalDetailsDto(personalInformation.getPersonalDetails()),
                mapToAddressDto(personalInformation.getAddress()),
                personalInformation.getPhoneNumbers().stream().map(EmployeeMapper::mapToPhoneNumbersDto).collect(Collectors.toList())
        );
    }

    private static PersonalDetailsDTO mapToPersonalDetailsDto(PersonalDetails personalDetails) {
        return new PersonalDetailsDTO(
                personalDetails.getName(),
                personalDetails.getMiddleName(),
                personalDetails.getSurname(),
                personalDetails.getEmail(),
                personalDetails.getBirthDate()
        );
    }

    private static AddressDTO mapToAddressDto(Address address) {
        return new AddressDTO(
              address.getStreetName(),
              address.getNumber(),
              address.getPostalCode(),
              address.getCity(),
              address.getCountry()
      );
    }

    private static PhoneNumbersDTO mapToPhoneNumbersDto(PhoneNumbers phoneNumbers) {
        return new PhoneNumbersDTO(
                phoneNumbers.getId(),
                phoneNumbers.getPhoneNumber(),
                phoneNumbers.getType()
                );
    }


    private static ProfessionalSkillsDTO mapToProfessionalSkillsDto(ProfessionalSkills professionalSkills) {
        return new ProfessionalSkillsDTO(
                professionalSkills.getId(),
                professionalSkills.getSkill(),
                professionalSkills.getLevel()
        );
    }

    private static WorkExperienceDTO mapToWorkExperienceDto(WorkExperience workExperience) {
        return new WorkExperienceDTO(
                workExperience.getId(),
                workExperience.getCompanyName(),
                workExperience.getPosition(),
                workExperience.getStartDate(),
                workExperience.getEndDate(),
                workExperience.getDescription()
        );
    }

    private static LanguagesDTO mapToLanguagesDto(Languages languages) {
        return new LanguagesDTO(
                languages.getId(),
                languages.getLanguage(),
                languages.getLevel()
        );
    }

    private static EducationDTO mapToEducationDto(Education education) {
        return new EducationDTO(
                education.getId(),
                education.getTitle(),
                education.getInstitution(),
                education.getGraduationDate()

        );

    }


}
