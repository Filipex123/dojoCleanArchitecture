package com.example.dojo.entity;

import java.time.LocalDate;

public class Employee {

    private String name;
    private Integer age;
    private LocalDate vacation;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Integer age, LocalDate vacation) {
        this.name = name;
        this.age = age;
        this.vacation = vacation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getVacation() {
        return vacation;
    }

    public void setVacation(LocalDate vacation) {
        this.vacation = vacation;
    }

    public boolean isOnVacation() {
        return this.vacation.isBefore(LocalDate.now()) || this.vacation.equals(LocalDate.now());
    }
}
