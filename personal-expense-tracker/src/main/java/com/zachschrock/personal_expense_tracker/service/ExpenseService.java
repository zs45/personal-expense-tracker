package com.zachschrock.personal_expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zachschrock.personal_expense_tracker.entity.Expense;
import com.zachschrock.personal_expense_tracker.repository.ExpenseRepository;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> addMultipleExpenses(List<Expense> expenses) {
        return expenseRepository.saveAll(expenses);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
    
}
