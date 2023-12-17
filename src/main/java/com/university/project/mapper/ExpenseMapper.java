package com.university.project.mapper;

import com.university.project.dto.ExpenseDTO;
import com.university.project.entity.ExpenseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    @Mappings({
            @Mapping(source = "car.id", target = "carId")
    })
    ExpenseDTO expenseToExpenseDto(ExpenseEntity expense);

    @Mappings({
            @Mapping(source = "carId", target = "car.id")
    })
    ExpenseEntity expenseDtoToExpense(ExpenseDTO expenseDTO);

    List<ExpenseDTO> expensesToExpensesDto(List<ExpenseEntity> expense);
}
