package com.university.project.service;

import com.university.project.dto.CarDTO;
import com.university.project.entity.CarEntity;
import com.university.project.mapper.CarMapper;
import com.university.project.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDTO> getCars() {
        List<CarEntity> cars = carRepository.findAll();
        return carMapper.carsToCarsDto(cars);
    }

    public CarDTO getCar(Long id) {
        return carMapper.carToCarDto(carRepository.
                findById(id).orElseThrow(() -> new RuntimeException("Id not exist!")));
    }

    public void createOrUpdateCar(CarDTO carDTO) {
        carRepository.save(carMapper.carDtoToCar(carDTO));
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
