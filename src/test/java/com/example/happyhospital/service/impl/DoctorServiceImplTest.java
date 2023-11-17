package com.example.happyhospital.service.impl;

import com.example.happyhospital.dto.DoctorDTO;
import com.example.happyhospital.entity.Doctor;
import com.example.happyhospital.repository.DoctorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DoctorServiceImplTest {

    @InjectMocks
    private DoctorServiceImpl doctorService;

    @Mock
    private DoctorRepository doctorRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void getDoctorById() {

        // given

        // mocking the service
        when(doctorRepository.findById(1L)).thenReturn(
            Optional.of(
                generateDoctor(1L, "John")
            )
        );

        // when
        // DoctorDTO serviceResponse = doctorService.getDoctorById(1L).get();
        DoctorDTO serviceResponse = doctorService.getDoctorById(1L).isPresent() ? doctorService.getDoctorById(1L).get() : null;

        // then
        assertNotNull(serviceResponse);
        assertEquals(1, serviceResponse.id());
        assertEquals("John", serviceResponse.firstName());
    }

    @Test
    void getAllDoctors() {

        //given
        //mocking the service
        when(doctorRepository.findAll()).thenReturn(
                generateDoctorList()
        );

        //when
        List<DoctorDTO> serviceResponse = doctorService.getAllDoctors();

        //then
        assertNotNull(serviceResponse);
        assertEquals(3, serviceResponse.size());
        assertEquals(3L, serviceResponse.get(2).id());
        assertEquals("Asli", serviceResponse.get(1).firstName());
        assertEquals("Ridvan", serviceResponse.get(2).firstName());
        assertEquals("Doe", serviceResponse.get(0).lastName());
    }

    List<Doctor> generateDoctorList() {
        return List.of(
                generateDoctor(1L, "John"),
                generateDoctor(2L, "Asli"),
                generateDoctor(3L, "Ridvan")
        );
    }

    // sample data
    Doctor generateDoctor(long id, String firstName) {
        var doctor = new Doctor();
        doctor.setId(id);
        doctor.setFirstName(firstName);
        doctor.setLastName("Doe");
        doctor.setPhone("1234567890");
        doctor.setEmail("jdoe@mail.com");
        doctor.setBirthDate("01/01/1970");
        return doctor;
    }
}