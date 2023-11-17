package com.example.happyhospital.entity;

import com.example.happyhospital.entity.base.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "nurses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Nurse extends BaseEntityAudit {

    // todo: doctor-nurse implement from personal class with common fields
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String birthDate;

//    private Doctor affiliatedDoctor;     ????
}
