package lk.ijse.ShoeShopManagementSystem.reposirory;
import lk.ijse.ShoeShopManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vithum vindeepa
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
