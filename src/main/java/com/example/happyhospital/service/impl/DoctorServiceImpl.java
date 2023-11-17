package com.example.happyhospital.service.impl;

import com.example.happyhospital.dto.DoctorDTO;
import com.example.happyhospital.entity.Doctor;
import com.example.happyhospital.mapper.DoctorMapper;
import com.example.happyhospital.repository.DoctorRepository;
import com.example.happyhospital.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Optional<DoctorDTO> getDoctorById(Long id) {

        Doctor doctor = doctorRepository.findById(id).orElse(null);

        if (doctor != null) {
            var doctorDTO = DoctorMapper.INSTANCE.entityToDto(doctor);
            return Optional.of(doctorDTO);
        }

        return Optional.empty();
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        if (doctors.isEmpty()) {
            return null;
        }

        List<DoctorDTO> doctorDTOList = new ArrayList<>();
        for (Doctor doctor : doctors) {
            DoctorDTO doctorDTO = DoctorMapper.INSTANCE.entityToDto(doctor);
            doctorDTOList.add(doctorDTO);
        }
        return doctorDTOList;
    }
}
