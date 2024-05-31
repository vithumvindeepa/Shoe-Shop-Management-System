package lk.ijse.ShoeShopManagementSystem.reposirory;

import lk.ijse.ShoeShopManagementSystem.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface SuppliersRepository extends JpaRepository<Suppliers, UUID> {
}
