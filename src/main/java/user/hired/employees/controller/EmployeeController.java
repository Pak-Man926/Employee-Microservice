package user.hired.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import user.hired.employees.response.EmployeeResponse;
import user.hired.employees.service.EmployeeService;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{ID}")
    private ResponseEntity <EmployeeResponse> getEmployeeDetails(@PathVariable("ID") int ID)
    {
        EmployeeResponse employee = employeeService.getEmployeebyID(ID);

        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
