package com.chaerim.accountbook.expense.service;

import com.chaerim.accountbook.expense.domain.Expense;
import com.chaerim.accountbook.expense.dto.CreateExpenseDto;
import com.chaerim.accountbook.expense.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseService {
    final private ExpenseRepository expenseRepository;

    public Expense addExpense(CreateExpenseDto createExpenseDto){
        return expenseRepository.save(createExpenseDto.toEntity());
    }
}
