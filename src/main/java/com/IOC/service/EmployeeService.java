package com.IOC.service;

import com.IOC.model.Employee;
import com.IOC.repository.EmployeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeRepo employeRepo;



    public static Employee EmployeeRequestMapper(Employee employeeRequest){
        return Employee.builder()
                .email(employeeRequest.getEmail())
                .fullName(employeeRequest.getFullName())
                .password(employeeRequest.getPassword())
                .build();
    }
    public Employee creatEmploye(Employee employe){
        employeRepo.save(employe);
        return employe;
    }

    public void deleteEmployee (int id ){
        employeRepo.deleteById(id);
    }

    public List<Employee> findAll (){
        return  employeRepo.findAll();
    }

    public Employee ubdateName (int id, Employee name){
        Employee employe =employeRepo.findById(id).orElseThrow();
        employe.setFullName(name.getFullName());
        employeRepo.save(employe);
        return employe;
    }

    public Employee ubdateEmail (int id, Employee name){
        Employee employe =employeRepo.findById(id).orElseThrow();
        employe.setEmail(name.getEmail());
        employeRepo.save(employe);
        return employe;
    }
    public Employee ubdatePassword (int id, Employee name){
        Employee employe =employeRepo.findById(id).orElseThrow();
        employe.setPassword(name.getPassword());
        employeRepo.save(employe);
        return employe;
    }
}
