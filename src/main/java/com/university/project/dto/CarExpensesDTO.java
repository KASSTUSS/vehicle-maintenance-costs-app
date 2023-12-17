package com.university.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarExpensesDTO {
    private CarDTO carDTO;
    private List<ExpenseDTO> expenseDTOs;
}
