package lk.ijse.ShoeShopManagementSystem.serviceimpl;

import lk.ijse.ShoeShopManagementSystem.entity.Employee;
import lk.ijse.ShoeShopManagementSystem.reposirory.EmployeeRepository;
import lk.ijse.ShoeShopManagementSystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Vithum vindeepa
 */

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository repository;

//    @Override
//    public Employee saveEmployee(Employee employee) {
//        return repository.save(employee);
//    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> findByEmployeeId(String employeeId) {
        return repository.findById(employeeId);
    }

    @Override
    public boolean deleteEmployee(String employeeId) {
        repository.deleteById(employeeId);
        return true;
    }
}
