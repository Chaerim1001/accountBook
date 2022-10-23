package com.chaerim.accountbook.expense.controller;

import com.chaerim.accountbook.expense.dto.CreateExpenseDto;
import com.chaerim.accountbook.expense.dto.ExpenseDto;
import com.chaerim.accountbook.expense.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
@AllArgsConstructor
public class ExpenseController {

    final private ExpenseService expenseService;

    @GetMapping("/mypage")
    public String expensePage(Model model){

        List<ExpenseDto> expenseList = expenseService.getExpenseList();
        model.addAttribute("expenseList", expenseList);
        return "user/mypage.html";
    }

    @PostMapping("/expense")
    public String addExpense(CreateExpenseDto createExpenseDto){
        expenseService.addExpense(createExpenseDto);
        return "redirect:main";
    }
}
