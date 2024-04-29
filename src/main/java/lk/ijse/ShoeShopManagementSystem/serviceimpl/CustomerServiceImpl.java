package lk.ijse.ShoeShopManagementSystem.serviceimpl;

import lk.ijse.ShoeShopManagementSystem.entity.Customer;
import lk.ijse.ShoeShopManagementSystem.reposirory.CustomerRepository;
import lk.ijse.ShoeShopManagementSystem.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository repository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> findById(UUID customerId) {
        return repository.findById(customerId);
    }

    @Override
    public boolean deleteCustomer(UUID customerId) {
        repository.deleteById(customerId);
        return true;
    }
}
