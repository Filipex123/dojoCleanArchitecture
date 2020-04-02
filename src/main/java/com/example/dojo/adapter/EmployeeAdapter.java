package com.example.dojo.adapter;

import com.example.dojo.entity.Employee;
import com.example.dojo.external.database.model.EmployeeModel;
import com.example.dojo.viewmodel.EmployeeVM;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeAdapter {

    public EmployeeAdapter() {
    }

    public static Employee toEntity(final EmployeeVM employeeVM) {
        return new Employee(employeeVM.getName());
    }

    public static Employee toEntity(final EmployeeModel employeeModel) {
        return new Employee(employeeModel.getName(),
                Integer.parseInt(employeeModel.getAge()),
                toDate(employeeModel.getVacation()));
    }

    private static LocalDate toDate(final String date) {
        return LocalDate.parse(date);
    }

    public static EmployeeModel toModel(final Employee employee) {
        return new EmployeeModel(employee.getName(), employee.getAge().toString(), employee.getVacation().toString());
    }
}
