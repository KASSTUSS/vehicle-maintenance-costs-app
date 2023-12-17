package com.university.project.mapper;

import com.university.project.dto.CarDTO;
import com.university.project.entity.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
    CarDTO carToCarDto(CarEntity car);

    CarEntity carDtoToCar(CarDTO carDTO);

    List<CarDTO> carsToCarsDto(List<CarEntity> cars);
}
