package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
@Table(name = "notice")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notice_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(nullable = false, length = 1)
    private String notice_type;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false, length = 15)
    private String writer;

    @Column(length = 600)
    private String img;

    @ColumnDefault("0")
    private int view_cnt;

    private LocalDateTime rdate;

}
