package com.lberou.crud.service;

import com.lberou.crud.entity.*;
import com.lberou.crud.exceptions.EmployeeAlreadyExistsException;
import com.lberou.crud.exceptions.EmployeeNotFoundException;
import com.lberou.crud.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    //Repository Dependecny Injection
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }


    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new EmployeeNotFoundException("There is no employee with id: " + id);
        }
    }

    public void saveEmployee(@RequestBody Employee employee) {
        String emailCheck = employee.getPersonalInformation().getPersonalDetails().getEmail();
        if (employeeRepository.findEmployeeByEmail(emailCheck).isPresent()) {
            throw new EmployeeAlreadyExistsException("Employee already exists with email: " + emailCheck);
        }
        employeeRepository.save(employee);
    }


    @Transactional
    public Employee updateEmployeeById(Long id, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (employeeOptional.isPresent()) {
            Employee employeeExisting = employeeOptional.get();

            if (Objects.nonNull(employee.getPersonalInformation())) {
                PersonalInformation putPersonalInfo = employee.getPersonalInformation();
                PersonalInformation existingPersonalInfo = employeeExisting.getPersonalInformation();

                if (Objects.nonNull(putPersonalInfo.getPersonalDetails())) {
                    PersonalDetails putPersonalDetails = putPersonalInfo.getPersonalDetails();
                    PersonalDetails existingPersonalDetails = existingPersonalInfo.getPersonalDetails();

                    if (Objects.nonNull(putPersonalDetails.getName())) {
                        existingPersonalDetails.setName(putPersonalDetails.getName());
                    }
                    if (Objects.nonNull(putPersonalDetails.getMiddleName())) {
                        existingPersonalDetails.setMiddleName(putPersonalDetails.getMiddleName());
                    }
                    if (Objects.nonNull(putPersonalDetails.getSurname())) {
                        existingPersonalDetails.setSurname(putPersonalDetails.getSurname());
                    }
                    if (Objects.nonNull(putPersonalDetails.getEmail())) {
                        existingPersonalDetails.setEmail(putPersonalDetails.getEmail());
                    }
                    if (Objects.nonNull(putPersonalDetails.getBirthDate())) {
                        existingPersonalDetails.setBirthDate(putPersonalDetails.getBirthDate());
                    }
                }

                if (Objects.nonNull(putPersonalInfo.getAddress())) {
                    Address putAddress = putPersonalInfo.getAddress();
                    Address existingAddress = existingPersonalInfo.getAddress();

                    if (Objects.nonNull(putAddress.getStreetName())) {
                        existingAddress.setStreetName(putAddress.getStreetName());
                    }
                    if (Objects.nonNull(putAddress.getNumber())) {
                        existingAddress.setNumber(putAddress.getNumber());
                    }
                    if (Objects.nonNull(putAddress.getPostalCode())) {
                        existingAddress.setPostalCode(putAddress.getPostalCode());
                    }
                    if (Objects.nonNull(putAddress.getCity())) {
                        existingAddress.setCity(putAddress.getCity());
                    }
                    if (Objects.nonNull(putAddress.getCountry())) {
                        existingAddress.setCountry(putAddress.getCountry());
                    }
                }

                if (Objects.nonNull(putPersonalInfo.getPhoneNumbers())) {
                    List<PhoneNumbers> putPhoneNumbers = putPersonalInfo.getPhoneNumbers();
                    List<PhoneNumbers> existingPhoneNumbers = existingPersonalInfo.getPhoneNumbers();

                    for (PhoneNumbers phoneNumber : putPhoneNumbers) {
                        if (!existingPhoneNumbers.contains(phoneNumber)) {
                            existingPhoneNumbers.add(phoneNumber);
                        }
                    }
                }
            }


            if (Objects.nonNull(employee.getLanguages())) {
                List<Languages> updatedLanguages = employee.getLanguages();
                List<Languages> existingLanguages = employeeExisting.getLanguages();

                for (Languages language : updatedLanguages) {
                    if (!existingLanguages.contains(language)) {
                        existingLanguages.add(language);
                    }
                }
            }

            if (Objects.nonNull(employee.getEducation())) {
                List<Education> updatedEducations = employee.getEducation();
                List<Education> existingEducations = employeeExisting.getEducation();

                for (Education education : updatedEducations) {
                    if (!existingEducations.contains(education)) {
                        existingEducations.add(education);
                    }

                }
            }


            if (Objects.nonNull(employee.getWorkExperiences())) {
                List<WorkExperience> updatedWorkExperiences = employee.getWorkExperiences();
                List<WorkExperience> existingWorkExperiences = employeeExisting.getWorkExperiences();

                for (WorkExperience workExperience : updatedWorkExperiences) {
                    if (!existingWorkExperiences.contains(workExperience)) {
                        existingWorkExperiences.add(workExperience);
                    }
                }
            }


            if (Objects.nonNull(employee.getProfessionalSkills())) {
                List<ProfessionalSkills> updatedProfessionalSkills = employee.getProfessionalSkills();
                List<ProfessionalSkills> existingProfessionalSkills = employeeExisting.getProfessionalSkills();

                for (ProfessionalSkills professionalSkill : updatedProfessionalSkills) {
                    if (!existingProfessionalSkills.contains(professionalSkill)) {
                        existingProfessionalSkills.add(professionalSkill);
                    }
                }
            }

            return employeeRepository.save(employeeExisting);

        } else {
            throw new EmployeeNotFoundException("There is no employee with id: " + id);
        }


    }

    public String deleteEmployeeById(Long id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee cv with id: " + id + " deleted successfully";
        } else {
            throw new EmployeeNotFoundException("There is no employee with id: " + id);
        }
    }
}
