package user.hired.employees.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import user.hired.employees.entity.Employee;
import user.hired.employees.repository.EmployeeRepo;
import user.hired.employees.response.EmployeeResponse;

import java.util.Optional;


public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;


    public EmployeeResponse getEmployeebyID(int ID)
    {
        Optional<Employee> employee = employeeRepo.findById(ID);

        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        return employeeResponse;
    }
}
