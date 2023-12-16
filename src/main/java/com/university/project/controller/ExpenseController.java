package com.university.project.controller;

import com.university.project.dto.ExpenseDTO;
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
public class ExpenseController {

    private final ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<ExpenseDTO>> showExpenses() {
        return new ResponseEntity<>(expenseService.getExpenses(), HttpStatus.OK);
    }

    @GetMapping("/expenses/{id}")
    public ResponseEntity<ExpenseDTO> showExpense(@PathVariable Long id) {
        return new ResponseEntity<>(expenseService.getExpense(id), HttpStatus.OK);
    }

    @PostMapping("/expenses")
    public ResponseEntity<ExpenseDTO> createExpense(@RequestBody ExpenseDTO expenseDTO) {
        expenseDTO.setId(0L);
        expenseService.createOrUpdateExpense(expenseDTO);
        return new ResponseEntity<>(expenseDTO, HttpStatus.CREATED);
    }

    @PutMapping("/expenses/{id}")
    public ResponseEntity<ExpenseDTO> updateExpense(@PathVariable Long id, @RequestBody ExpenseDTO expenseDTO) {
        expenseDTO.setId(id);
        expenseService.createOrUpdateExpense(expenseDTO);
        return new ResponseEntity<>(expenseDTO, HttpStatus.OK);
    }
}
