package com.example.happyhospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "doctor")
public class Doctor extends BaseEntityAudit {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String birthDate;

//    private List<Major> majors;           ????
//    private List<Patient> patients;       ????
//    private List<Nurse> affiliatedNurses; ????
}
