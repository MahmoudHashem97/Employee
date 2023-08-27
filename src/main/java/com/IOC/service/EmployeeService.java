package com.IOC.service;

import com.IOC.model.Employe;
import com.IOC.reprosatory.EmployeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void deleteEmployee (int id ){
        employeRepo.deleteById(id);
    }

    public List<Employe> findAll (){
        return  employeRepo.findAll();
    }

    public Employe ubdateName (int id,Employe name){
        Employe employe =employeRepo.findById(id).orElseThrow();
        employe.setFullName(name.getFullName());
        employeRepo.save(employe);
        return employe;
    }
}
