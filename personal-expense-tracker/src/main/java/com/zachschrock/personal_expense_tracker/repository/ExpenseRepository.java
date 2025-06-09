package com.zachschrock.personal_expense_tracker.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zachschrock.personal_expense_tracker.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Additional query methods can be defined here if needed
    List<Expense> findByCategory(String category);
    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);
    
}
