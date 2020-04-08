package com.example.dojo.viewmodel;

public class EmployeeVM {

    private String nome;
    private String newVacation;

    public EmployeeVM(String nome, String newVacation) {
        this.nome = nome;
        this.newVacation = newVacation;
    }

    public String getNome() {
        return nome;
    }

    public String getNewVacation() {
        return newVacation;
    }
}
