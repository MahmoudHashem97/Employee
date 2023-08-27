package com.IOC.Control;

import com.IOC.model.Employe;
import com.IOC.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class EmployeController {

    private final EmployeeService employeeService;

    @PostMapping("/emloyee")
    public ResponseEntity<Employe> register(@RequestBody Employe request){

        return ResponseEntity.ok(employeeService.creatEmploye(request));
    }

}
