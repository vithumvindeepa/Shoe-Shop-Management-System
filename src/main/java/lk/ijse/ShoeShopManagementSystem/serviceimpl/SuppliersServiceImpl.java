package lk.ijse.ShoeShopManagementSystem.serviceimpl;


import lk.ijse.ShoeShopManagementSystem.entity.Suppliers;
import lk.ijse.ShoeShopManagementSystem.reposirory.SuppliersRepository;
import lk.ijse.ShoeShopManagementSystem.service.SuppliersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
@Service
@RequiredArgsConstructor
public class SuppliersServiceImpl implements SuppliersService {

    @Autowired
    private SuppliersRepository suppliersRepository;

    @Override
    public Suppliers saveSupplier(Suppliers suppliers) {
        return suppliersRepository.save(supplier);
    }

    @Override
    public List<Suppliers> getAllSuppliers() {
        return suppliersRepository.findAll();
    }

    @Override
    public Optional<Suppliers> findBySupplierCode(UUID supplierCode) {
        return suppliersRepository.findById(supplierCode);
    }

    @Override
    public boolean deleteSupplier(Suppliers supplierCode) {
        suppliersRepository.delete(supplierCode);
        return true;
    }
}
