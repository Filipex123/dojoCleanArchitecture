package com.example.dojo.usecase;

import com.example.dojo.adapter.EmployeeAdapter;
import com.example.dojo.entity.Employee;
import com.example.dojo.external.database.model.EmployeeModel;
import com.example.dojo.external.database.repository.EmployeeRepository;
import com.example.dojo.viewmodel.EmployeeVM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@Service
public class UpdateVacationUseCase {

    private final EmployeeRepository employeeRepository;

    public UpdateVacationUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean execute(final EmployeeVM employeeVM) {

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
