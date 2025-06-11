package com.ez.erp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExpenseRequest {
    private String title;
    private int amount;
    private String requester;
}