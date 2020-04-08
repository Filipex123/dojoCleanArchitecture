package com.example.dojo.usecase;

import com.example.dojo.entity.Employee;
import com.example.dojo.viewmodel.EmployeeVM;

public class UpdateEmployeeVacationUseCase {

    public void  execute(final EmployeeVM employeeVM) {
        try {

            Optional<EmployeeModel> employeeModel = employeeRepository.findByName(employeeVM.getName());
            Employee employee = EmployeeAdapter.toEntity(employeeModel.get());

            if(validNewVacation(employeeVM.getNewVacation()) && !employee.isOnVacation()) {
                employeeModel.get().setVacation(employeeVM.getNewVacation().toString());
                employeeRepository.save(employeeModel.get());
                log.info("Success vacation date update");
                return true;
            }

        } catch (Exception ex) {
            log.error("An error has occurred");
        }

        return false;
    }

    protected boolean validNewVacation(final LocalDate newVacation) {
        return newVacation.isAfter(LocalDate.now());
    }
    }
}
