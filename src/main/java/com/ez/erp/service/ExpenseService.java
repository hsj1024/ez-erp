package com.ez.erp.service;

import com.ez.erp.domain.Expense;
import com.ez.erp.domain.ExpenseStatus;
import com.ez.erp.dto.ExpenseRequest;
import com.ez.erp.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository repository;

    public Expense createExpense(ExpenseRequest request) {
        Expense expense = Expense.builder()
                .title(request.getTitle())
                .amount(request.getAmount())
                .requester(request.getRequester())
                .build();
        return repository.save(expense);
    }

    public List<Expense> getAll() {
        return repository.findAll();
    }

    public Expense updateStatus(Long id, ExpenseStatus status) {
        Expense expense = repository.findById(id).orElseThrow();
        expense.setStatus(status);
        return repository.save(expense);
    }
}
