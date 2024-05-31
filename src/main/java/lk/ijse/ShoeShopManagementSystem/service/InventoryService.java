package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.helloshoeshopmanagement.entity.Inventory;

import java.util.List;
import java.util.Optional;
/**
 * @author Vithum vindeepa
 */
public interface InventoryService {
    Inventory saveInventory(Inventory inventory);
    List<Inventory> getAllInventories();
    Optional<Inventory> findByItemCode(String itemCode);
    boolean deleteInventory(Inventory itemCode);
}
