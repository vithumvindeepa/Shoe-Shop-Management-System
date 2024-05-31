package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.ShoeShopManagementSystem.dto.SaleDTO;
import lk.ijse.ShoeShopManagementSystem.entity.Sale;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
/**
 * @author Vithum vindeepa
 */
public interface SaleService {
    Sale saveSale(Sale sale);
    List<Sale> getAllSale();
    Optional<Sale> findById(UUID saleId);
    boolean deleteSale(Sale id);

    List<Sale> findByPurchaseDate(LocalDateTime purchaseDate);

    List<Sale> findByCustomerName(String customerName);
}