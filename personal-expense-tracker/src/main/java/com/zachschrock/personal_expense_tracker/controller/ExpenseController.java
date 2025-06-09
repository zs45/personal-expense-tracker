package com.zachschrock.personal_expense_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zachschrock.personal_expense_tracker.entity.Expense;
import com.zachschrock.personal_expense_tracker.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAll() {
        return expenseService.getAllExpenses();
    }

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    @PostMapping("/bulk")
    public List<Expense> createMultiple(@RequestBody List<Expense> expenses) {
        return expenseService.addMultipleExpenses(expenses);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }
    
}
