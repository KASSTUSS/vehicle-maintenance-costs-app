package com.university.project.mapper;

import com.university.project.dto.ExpenseDTO;
import com.university.project.entity.ExpenseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    ExpenseDTO expenseToExpenseDto(ExpenseEntity expense);

    ExpenseEntity expenseDtoToExpense(ExpenseDTO expenseDTO);

    List<ExpenseDTO> expensesToExpensesDto(List<ExpenseEntity> expense);
}
