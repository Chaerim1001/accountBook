package com.chaerim.accountbook.member.dto;
import com.chaerim.accountbook.member.domain.Member;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;

    private String name;
    private String email;
    private String password;

    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;

    public Member toEntity(){
        return Member.builder()
                .id(id)
                .name(name)
                .email(email)
                .password(password)
                .build();
    }
    @Builder
    public MemberDto(Long id, String name, String email, String password, LocalDateTime createdTime, LocalDateTime modifiedTime) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.createdTime=createdTime;
        this.modifiedTime=modifiedTime;
    }
}

