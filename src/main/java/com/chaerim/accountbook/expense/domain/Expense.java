package com.chaerim.accountbook.expense.domain;

import com.chaerim.accountbook.member.domain.BaseTimeEntity;
import com.chaerim.accountbook.member.domain.Member;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Entity
public class Expense extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Long expense;

    @Column
    private String explanation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public Expense(Long id, Date date, Long expense, String explanation, Member member) {
        this.id = id;
        this.date = date;
        this.expense = expense;
        this.explanation = explanation;
        this.member = member;
    }
}
