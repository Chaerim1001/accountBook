package com.chaerim.accountbook.expense.repository;

import com.chaerim.accountbook.expense.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
