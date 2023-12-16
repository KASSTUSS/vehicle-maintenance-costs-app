package com.university.project.mapper;

import com.university.project.dto.CarDTO;
import com.university.project.entity.CarEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-16T18:08:56+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO carToCarDto(CarEntity car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setId( car.getId() );
        carDTO.setMake( car.getMake() );
        carDTO.setModel( car.getModel() );
        carDTO.setYear( car.getYear() );

        return carDTO;
    }

    @Override
    public CarEntity carDtoToCar(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        CarEntity carEntity = new CarEntity();

        carEntity.setId( carDTO.getId() );
        carEntity.setMake( carDTO.getMake() );
        carEntity.setModel( carDTO.getModel() );
        carEntity.setYear( carDTO.getYear() );

        return carEntity;
    }

    @Override
    public List<CarDTO> carsToCarsDto(List<CarEntity> cars) {
        if ( cars == null ) {
            return null;
        }

        List<CarDTO> list = new ArrayList<CarDTO>( cars.size() );
        for ( CarEntity carEntity : cars ) {
            list.add( carToCarDto( carEntity ) );
        }

        return list;
    }
}
