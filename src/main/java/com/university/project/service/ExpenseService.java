package com.university.project.service;

import com.university.project.dto.ExpenseDTO;
import com.university.project.entity.ExpenseEntity;
import com.university.project.mapper.ExpenseMapper;
import com.university.project.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    public List<ExpenseDTO> getExpenses() {
        return expenseMapper.expensesToExpensesDto(expenseRepository.findAll());
    }

    public ExpenseDTO getExpense(Long id) {
        return expenseMapper.expenseToExpenseDto(expenseRepository.
                findById(id).orElseThrow(() -> new RuntimeException("Id not exist")));
    }

    public List<ExpenseDTO> getExpensesStoringCarById(Long id) {
        List<ExpenseEntity> expenses = expenseRepository.findAllByCarId(id);
        return expenses.stream()
                .map(expenseMapper::expenseToExpenseDto)
                .collect(Collectors.toList());
    }

    public void createOrUpdateExpense(ExpenseDTO expenseDTO) {
        expenseRepository.save(expenseMapper.expenseDtoToExpense(expenseDTO));
    }
}
