package com.IOC.service;

import com.IOC.model.Employe;
import com.IOC.reprosatory.EmployeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeRepo employeRepo;



    public static Employe EmployeeRequestMapper(Employe employeeRequest){
        return Employe.builder()
                .email(employeeRequest.getEmail())
                .fullName(employeeRequest.getFullName())
                .password(employeeRequest.getPassword())
                .build();
    }
    public Employe creatEmploye(Employe employe){
        employeRepo.save(employe);
        return employe;
    }

}