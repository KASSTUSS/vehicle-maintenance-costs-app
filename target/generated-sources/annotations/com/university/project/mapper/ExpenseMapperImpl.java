package com.university.project.mapper;

import com.university.project.dto.ExpenseDTO;
import com.university.project.entity.CarEntity;
import com.university.project.entity.ExpenseEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-17T03:14:47+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ExpenseMapperImpl implements ExpenseMapper {

    @Override
    public ExpenseDTO expenseToExpenseDto(ExpenseEntity expense) {
        if ( expense == null ) {
            return null;
        }

        ExpenseDTO expenseDTO = new ExpenseDTO();

        expenseDTO.setCarId( expenseCarId( expense ) );
        expenseDTO.setId( expense.getId() );
        expenseDTO.setDate( expense.getDate() );
        expenseDTO.setCategory( expense.getCategory() );
        expenseDTO.setDescription( expense.getDescription() );
        expenseDTO.setAmount( expense.getAmount() );

        return expenseDTO;
    }

    @Override
    public ExpenseEntity expenseDtoToExpense(ExpenseDTO expenseDTO) {
        if ( expenseDTO == null ) {
            return null;
        }

        ExpenseEntity expenseEntity = new ExpenseEntity();

        expenseEntity.setCar( expenseDTOToCarEntity( expenseDTO ) );
        expenseEntity.setId( expenseDTO.getId() );
        expenseEntity.setDate( expenseDTO.getDate() );
        expenseEntity.setCategory( expenseDTO.getCategory() );
        expenseEntity.setDescription( expenseDTO.getDescription() );
        expenseEntity.setAmount( expenseDTO.getAmount() );

        return expenseEntity;
    }

    @Override
    public List<ExpenseDTO> expensesToExpensesDto(List<ExpenseEntity> expense) {
        if ( expense == null ) {
            return null;
        }

        List<ExpenseDTO> list = new ArrayList<ExpenseDTO>( expense.size() );
        for ( ExpenseEntity expenseEntity : expense ) {
            list.add( expenseToExpenseDto( expenseEntity ) );
        }

        return list;
    }

    private Long expenseCarId(ExpenseEntity expenseEntity) {
        if ( expenseEntity == null ) {
            return null;
        }
        CarEntity car = expenseEntity.getCar();
        if ( car == null ) {
            return null;
        }
        Long id = car.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected CarEntity expenseDTOToCarEntity(ExpenseDTO expenseDTO) {
        if ( expenseDTO == null ) {
            return null;
        }

        Long id = null;

        id = expenseDTO.getCarId();

        String make = null;
        String model = null;
        int year = 0;
        List<ExpenseEntity> expenses = null;

        CarEntity carEntity = new CarEntity( id, make, model, year, expenses );

        return carEntity;
    }
}
