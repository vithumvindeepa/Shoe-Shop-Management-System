package lk.ijse.ShoeShopManagementSystem.reposirory;

import lk.ijse.ShoeShopManagementSystem.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
/**
 * @author Vithum vindeepa
 */
public interface SaleRepository extends JpaRepository<Sale, UUID> {
    Sale findByPurchaseDate(LocalDateTime purchaseDate);

    List<Sale> findByCustomerName(String customerName);
}
