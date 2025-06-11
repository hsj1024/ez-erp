package com.ez.erp.dto;


import com.ez.erp.domain.ExpenseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExpenseStatusUpdateRequest {
    private ExpenseStatus status;
}