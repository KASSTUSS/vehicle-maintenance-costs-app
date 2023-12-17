package com.university.project.mapper;

import com.university.project.dto.CarDTO;
import com.university.project.entity.CarEntity;
import com.university.project.entity.ExpenseEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-17T03:00:55+0300",
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

        Long id = null;
        String make = null;
        String model = null;
        int year = 0;

        id = carDTO.getId();
        make = carDTO.getMake();
        model = carDTO.getModel();
        year = carDTO.getYear();

        List<ExpenseEntity> expenses = null;

        CarEntity carEntity = new CarEntity( id, make, model, year, expenses );

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
