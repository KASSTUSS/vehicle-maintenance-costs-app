package com.university.project.controller;

import com.university.project.dto.CarDTO;
import com.university.project.dto.CarExpensesDTO;
import com.university.project.service.CarService;
import com.university.project.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;
    private final ExpenseService expenseService;

    @GetMapping("/cars")
    public ResponseEntity<List<CarDTO>> showCars() {
        return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<CarExpensesDTO> showCar(@PathVariable Long id) {
        CarExpensesDTO carExpensesDTO = new CarExpensesDTO(carService.getCar(id),
                expenseService.getExpensesStoringCarById(id));
        return new ResponseEntity<>(carExpensesDTO, HttpStatus.OK);
    }

    @PostMapping("/cars")
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
        carDTO.setId(0L);
        carService.createOrUpdateCar(carDTO);
        return new ResponseEntity<>(carDTO, HttpStatus.CREATED);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<CarDTO> updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        carDTO.setId(id);
        carService.createOrUpdateCar(carDTO);
        return new ResponseEntity<>(carDTO, HttpStatus.OK);
    }
}
