package com.ez.erp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private int amount;

    private String requester;

    private LocalDateTime requestedAt;

    @Enumerated(EnumType.STRING)
    private ExpenseStatus status;

    @PrePersist
    public void onCreate() {
        this.requestedAt = LocalDateTime.now();
        this.status = ExpenseStatus.PENDING;
    }
}