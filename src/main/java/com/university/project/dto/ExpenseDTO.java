package com.university.project.dto;

import com.university.project.entity.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDTO {
    private Long id;
    private Long carId;
    private String date;
    private String category;
    private String description;
    private double amount;
}
