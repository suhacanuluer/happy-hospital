package com.example.happyhospital.dto;

public record DoctorDTO(
        Long id,
        String firstName,
        String lastName,
        String phone,
        String email,
        String birthDate
) {}
