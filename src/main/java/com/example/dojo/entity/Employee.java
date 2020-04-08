package com.example.dojo.entity;

import java.time.LocalDate;

public class Employee {

    private String name;
    private String age;
    private LocalDate vacation;

    public Employee() {
    }

    public Employee(String name, LocalDate vacation) {
        this.name = name;
        this.vacation = vacation;
    }

    public Employee(String name, String age, LocalDate vacation) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
