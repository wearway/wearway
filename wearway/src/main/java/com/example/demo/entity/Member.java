package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @Column(nullable = false, length = 20)
    private String member_id;

    @Column(nullable = false, length = 60)
    private String pw;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false, length = 15)
    private String tel;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(length = 13)
    private String jumin;

    @Column(length = 1)
    private String gender;

    @Column(length = 1)
    @ColumnDefault("'N'")
    private String is_banned;

    @Column(length = 1)
    @ColumnDefault("'N'")
    private String is_signout;
}
