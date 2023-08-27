package com.IOC.Control;

import com.IOC.model.Employe;
import com.IOC.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class EmployeController {

    private final EmployeeService employeeService;

    @PostMapping("/emloyee")
    public ResponseEntity<Employe> register(@RequestBody Employe request){

        return ResponseEntity.ok(employeeService.creatEmploye(request));
    }

    @DeleteMapping("/emloyee/{id}")
    public void deleteEmployee (@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/employee")
    public List<Employe> getAll(){
        return employeeService.findAll();
    }

    @PatchMapping("/employee/{id}")
    public Employe update(@PathVariable("id") int id,@RequestBody Employe request){
        return employeeService.ubdateName(id,request);
    }


}
