package com.chaerim.accountbook.expense.repository;

import com.chaerim.accountbook.expense.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
