package com.chaerim.accountbook.expense.dto;

import com.chaerim.accountbook.expense.domain.Expense;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class ExpenseDto {
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private Long expense;

    private String explanation;

    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;

    public Expense toEntity(){
        return Expense.builder()
                .id(id)
                .date(date)
                .expense(expense)
                .explanation(explanation)
                .build();
    }

    @Builder
    public ExpenseDto(Long id, Date date, Long expense, String explanation, LocalDateTime createdTime, LocalDateTime modifiedTime) {
        this.id = id;
        this.date = date;
        this.expense = expense;
        this.explanation = explanation;
        this.createdTime=createdTime;
        this.modifiedTime=modifiedTime;
    }
}
