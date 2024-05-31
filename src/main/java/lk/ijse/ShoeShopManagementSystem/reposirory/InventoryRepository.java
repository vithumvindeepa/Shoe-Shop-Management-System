package lk.ijse.ShoeShopManagementSystem.reposirory;

import lk.ijse.helloshoeshopmanagement.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Vithum vindeepa
 */
public interface InventoryRepository extends JpaRepository<Inventory, String> {
}