package com.example.happyhospital.mapper;

import com.example.happyhospital.dto.DoctorDTO;
import com.example.happyhospital.entity.Doctor;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Doctor dtoToEntity(DoctorDTO doctorDTO);
    DoctorDTO entityToDto(Doctor doctor);
}
