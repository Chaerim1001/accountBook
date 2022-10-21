package com.chaerim.accountbook.expense.controller;

import com.chaerim.accountbook.expense.dto.CreateExpenseDto;
import com.chaerim.accountbook.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ExpenseController {

    final private ExpenseService expenseService;

    @GetMapping("/expense")
    public String expensePage(){
        return "user/addExpense.html";
    }

    @PostMapping("/expense")
    public String addExpense(CreateExpenseDto createExpenseDto){
        expenseService.addExpense(createExpenseDto);
        return "redirect:main";
    }
}
