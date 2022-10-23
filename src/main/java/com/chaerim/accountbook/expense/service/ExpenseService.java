package com.chaerim.accountbook.expense.service;

import com.chaerim.accountbook.expense.domain.Expense;
import com.chaerim.accountbook.expense.dto.CreateExpenseDto;
import com.chaerim.accountbook.expense.dto.ExpenseDto;
import com.chaerim.accountbook.expense.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {
    final private ExpenseRepository expenseRepository;

    public Expense addExpense(CreateExpenseDto createExpenseDto){
        return expenseRepository.save(createExpenseDto.toEntity());
    }

    public List<ExpenseDto> getExpenseList(){
        List<Expense> expenses = expenseRepository.findAll();
        List<ExpenseDto> expenseList = new ArrayList<>();

        for (Expense expense: expenses){
            ExpenseDto expenseDto = ExpenseDto.builder()
                    .id(expense.getId())
                    .date(expense.getDate())
                    .expense(expense.getExpense())
                    .explanation(expense.getExplanation())
                    .build();
            expenseList.add(expenseDto);
        }
        System.out.println("dd"+ expenseList);
        return expenseList;
    }
}
