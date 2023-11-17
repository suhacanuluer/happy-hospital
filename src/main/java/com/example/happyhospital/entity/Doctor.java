package com.example.happyhospital.entity;

import com.example.happyhospital.entity.base.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
