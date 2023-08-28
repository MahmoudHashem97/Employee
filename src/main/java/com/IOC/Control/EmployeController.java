package com.IOC.Control;

import com.IOC.model.Employee;
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
    public ResponseEntity<Employee> register(@RequestBody Employee request){

        return ResponseEntity.ok(employeeService.creatEmploye(request));
    }

    @DeleteMapping("/emloyee/{id}")
    public void deleteEmployee (@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/employee")
    public List<Employee> getAll(){
        return employeeService.findAll();
    }

    @PatchMapping("/employee/{id}")
    public Employee update(@PathVariable("id") int id, @RequestBody Employee request){
        return employeeService.ubdateName(id,request);
    }

    @PatchMapping("/employee/email/{id}")
    public Employee updateEmail(@PathVariable("id") int id, @RequestBody Employee request){
        return employeeService.ubdateEmail(id,request);
    }
    @PatchMapping("/employee/password/{id}")
    public Employee updatePaswrord(@PathVariable("id") int id, @RequestBody Employee request){
        return employeeService.ubdatePassword(id,request);
    }
    @PatchMapping("/employee/password/{id}")
    public Employee updatePaswror(@PathVariable("id") int id, @RequestBody Employee request){
        return employeeService.ubdatePassword(id,request);
    }
}
