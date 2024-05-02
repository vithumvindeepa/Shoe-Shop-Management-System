package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.ShoeShopManagementSystem.entity.Employee;

import java.util.List;
import java.util.Optional;

/**
 * @author Vithum vindeepa
 */
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Optional<Employee> findById(String employeeId);
    boolean deleteEmployee(String employeeId);
}
