package com.example.dojo.external.database.repository;

import com.example.dojo.external.database.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
    Optional<EmployeeModel> findByName(final String nome);
}
