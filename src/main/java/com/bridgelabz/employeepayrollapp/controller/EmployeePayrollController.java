package com.bridgelabz.employeepayrollapp.controller;


import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

    @GetMapping("/")
    public ResponseEntity<String> getEmployeeData(){
        return new ResponseEntity<String>("Get response from server", HttpStatus.OK);
    }

    @GetMapping("/getId/{empId}")
    public ResponseEntity<String> getEmployeeId(@PathVariable (value = "empId") int empId){
        return new ResponseEntity<String >("Get response from server" + empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> creatEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<String>("Get response from post request"+ employeeDTO.toString(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<String>("Get response from put request"+ employeeDTO.toString(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable (value = "empId") int empId){
        return new ResponseEntity<>("Get the Response from delete request "+empId,HttpStatus.OK);
    }
}
