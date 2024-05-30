package com.lberou.crud.configuration;

import com.lberou.crud.entity.*;
import com.lberou.crud.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
public class EmployeeConfig {

    //on application startup
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {

            //1st Employee
            Employee alex = new Employee();
            PersonalDetails alexDetails = new PersonalDetails();

            alexDetails.setName("Alex");
            alexDetails.setMiddleName("John");
            alexDetails.setSurname("Smith");
            alexDetails.setEmail("alexsmith@mail.com");
            alexDetails.setBirthDate(LocalDate.of(1983, Month.JANUARY, 7));

            Address alexAddress = new Address();
            alexAddress.setStreetName("Hydras");
            alexAddress.setNumber(34);
            alexAddress.setPostalCode(13555);
            alexAddress.setCity("Athens");
            alexAddress.setCountry("Greece");

            PhoneNumbers alexPhoneNumber = new PhoneNumbers();
            alexPhoneNumber.setPhoneNumber("6946554712");
            alexPhoneNumber.setType("mobile");

            PersonalInformation alexPersonalInformation = new PersonalInformation();
            alexPersonalInformation.setPersonalDetails(alexDetails);
            alexPersonalInformation.setAddress(alexAddress);

            List<PhoneNumbers> numbers = new ArrayList<>();
            numbers.add(alexPhoneNumber);
            alexPersonalInformation.setPhoneNumbers(numbers);


            Education alexEducation = new Education();
            alexEducation.setTitle("Software Engineer");
            alexEducation.setInstitution("Athens University");
            alexEducation.setGraduationDate(LocalDate.of(2010, Month.MARCH, 13));

            Languages alexLanguage = new Languages();
            alexLanguage.setLanguage("Greek");
            alexLanguage.setLevel("native");

            WorkExperience alexWorkExperience = new WorkExperience();
            alexWorkExperience.setCompanyName("Oracle");
            alexWorkExperience.setPosition("Software Engineer In Test");
            alexWorkExperience.setStartDate(LocalDate.of(2017, Month.MARCH, 13));
            alexWorkExperience.setDescription("Working at Oracle");

            ProfessionalSkills alexSkill1 = new ProfessionalSkills();
            alexSkill1.setSkill("Java");
            alexSkill1.setLevel("3 / 5");

            ProfessionalSkills alexSkill2 = new ProfessionalSkills();
            alexSkill2.setSkill("Javascript");
            alexSkill2.setLevel("3 / 5");

            alex.setPersonalInformation(alexPersonalInformation);

            List<Education> educations = new ArrayList<>();
            educations.add(alexEducation);
            alex.setEducation(educations);
            alex.setLanguages(Arrays.asList(alexLanguage));
            alex.setWorkExperiences(Arrays.asList(alexWorkExperience));
            alex.setProfessionalSkills(Arrays.asList(alexSkill1, alexSkill2));

//            //2nd Employee
            Employee mary = new Employee();
            PersonalDetails maryDetails = new PersonalDetails();

            maryDetails.setName("Mary");
            maryDetails.setMiddleName("John");
            maryDetails.setSurname("Johnson");
            maryDetails.setEmail("maryjohnson@mail.com");
            maryDetails.setBirthDate(LocalDate.of(1985, Month.JANUARY, 7));

            Address maryAddress = new Address();
            maryAddress.setStreetName("Kerkiras");
            maryAddress.setNumber(32);
            maryAddress.setPostalCode(12874);
            maryAddress.setCity("Athens");
            maryAddress.setCountry("Greece");

            PhoneNumbers maryPhoneNumber = new PhoneNumbers();
            maryPhoneNumber.setPhoneNumber("6944254712");
            maryPhoneNumber.setType("mobile");

            PersonalInformation maryPersonalInformation = new PersonalInformation();
            maryPersonalInformation.setPersonalDetails(maryDetails);
            maryPersonalInformation.setAddress(maryAddress);

            List<PhoneNumbers> maryNumbers = new ArrayList<>();
            maryNumbers.add(maryPhoneNumber);
            maryPersonalInformation.setPhoneNumbers(maryNumbers);


            Education maryEducation = new Education();
            maryEducation.setTitle("Software Engineer");
            maryEducation.setInstitution("Thessaloniki University");
            maryEducation.setGraduationDate(LocalDate.of(2000, Month.JANUARY, 5));

            Languages maryLanguage = new Languages();
            maryLanguage.setLanguage("Greek");
            maryLanguage.setLevel("native");

            WorkExperience maryWorkExperience = new WorkExperience();
            maryWorkExperience.setCompanyName("Amazon");
            maryWorkExperience.setPosition("Software Engineer In Test");
            maryWorkExperience.setStartDate(LocalDate.of(2010, Month.FEBRUARY, 3));
            maryWorkExperience.setDescription("Working at Amazon");

            ProfessionalSkills marySkill1 = new ProfessionalSkills();
            marySkill1.setSkill("Java");
            marySkill1.setLevel("4 / 5");

            ProfessionalSkills marySkill2 = new ProfessionalSkills();
            marySkill2.setSkill("Javascript");
            marySkill2.setLevel("2 / 5");

            mary.setPersonalInformation(maryPersonalInformation);

            List<Education> maryEducations = new ArrayList<>();
            maryEducations.add(maryEducation);
            mary.setEducation(maryEducations);
            mary.setLanguages(Arrays.asList(maryLanguage));
            mary.setWorkExperiences(Arrays.asList(maryWorkExperience));
            mary.setProfessionalSkills(Arrays.asList(marySkill1, marySkill2));

            employeeRepository.saveAll(
                    List.of(alex,mary)
            );

        };
    }
}