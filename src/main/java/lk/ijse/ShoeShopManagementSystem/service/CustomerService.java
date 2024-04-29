package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.ShoeShopManagementSystem.entity.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Optional<Customer> findById(UUID customerId);
    boolean deleteCustomer(UUID customerId);
}
