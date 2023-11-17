package com.example.happyhospital.service;


import com.example.happyhospital.dto.DoctorDTO;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    Optional<DoctorDTO> getDoctorById(Long id);

    List<DoctorDTO> getAllDoctors();
}
