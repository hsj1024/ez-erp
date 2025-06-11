package com.ez.erp.controller;

import com.ez.erp.domain.Expense;
import com.ez.erp.dto.ExpenseRequest;
import com.ez.erp.dto.ExpenseStatusUpdateRequest;
import com.ez.erp.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public Expense create(@RequestBody ExpenseRequest request) {
        return expenseService.createExpense(request);
    }

    @GetMapping
    public List<Expense> getAll() {
        return expenseService.getAll();
    }

    @PatchMapping("/{id}/status")
    public Expense updateStatus(@PathVariable Long id,
                                @RequestBody ExpenseStatusUpdateRequest request) {
        return expenseService.updateStatus(id, request.getStatus());
    }
}