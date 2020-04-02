package com.example.dojo.endpoint;

import com.example.dojo.usecase.UpdateVacationUseCase;
import com.example.dojo.viewmodel.EmployeeVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    private UpdateVacationUseCase updateVacationUseCase;

    @PutMapping("/updateVacation")
    public ResponseEntity<Boolean> updateVacation(@RequestBody final EmployeeVM employeeVM) {

       boolean response = updateVacationUseCase.execute(employeeVM);

        return new ResponseEntity<>(response, getHttpStatus(response));
    }

    private HttpStatus getHttpStatus(boolean response) {
        return response ? HttpStatus.OK : HttpStatus.UNPROCESSABLE_ENTITY;
    }
}
