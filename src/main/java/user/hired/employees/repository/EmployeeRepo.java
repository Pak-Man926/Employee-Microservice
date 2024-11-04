package user.hired.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user.hired.employees.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
