package com.example.dojo.viewmodel;

import java.time.LocalDate;

public class EmployeeVM {

    private String name;
    private LocalDate newVacation;

    public EmployeeVM(String name, LocalDate newVacation) {
        this.name = name;
        this.newVacation = newVacation;
    }

    public LocalDate getNewVacation() {
        return newVacation;
    }

    public String getName() {
        return name;
    }
}
