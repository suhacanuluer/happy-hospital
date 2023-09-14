package com.example.happyhospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "nurse")
public class Nurse extends BaseEntityAudit {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String birthDate;

//    private Doctor affiliatedDoctor;     ????
}
