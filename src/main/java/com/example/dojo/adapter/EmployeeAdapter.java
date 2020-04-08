package com.example.dojo.adapter;

import com.example.dojo.entity.Employee;
import com.example.dojo.viewmodel.EmployeeVM;

import java.time.LocalDate;

public class EmployeeAdapter {

    public EmployeeAdapter() {
    }

    public static Employee toEntity(final EmployeeVM employeeVM) {
        return new Employee(employeeVM.getNome(), LocalDate.parse(employeeVM.getNewVacation()));
    }
}
