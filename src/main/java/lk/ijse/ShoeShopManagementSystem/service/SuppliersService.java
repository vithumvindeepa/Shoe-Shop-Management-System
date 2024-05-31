package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.ShoeShopManagementSystem.entity.Suppliers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface SuppliersService {

    Supplier saveSupplier(Supplier supplier);
    List<Supplier> getAllSuppliers();
    Optional<Supplier> findBySupplierCode(UUID supplierCode);
    boolean deleteSupplier(Supplier supplierCode);
}