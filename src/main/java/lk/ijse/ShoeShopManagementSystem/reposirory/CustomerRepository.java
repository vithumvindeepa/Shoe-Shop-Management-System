package lk.ijse.ShoeShopManagementSystem.reposirory;

import lk.ijse.ShoeShopManagementSystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
