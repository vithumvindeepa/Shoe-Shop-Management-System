package lk.ijse.ShoeShopManagementSystem.controller;

import lk.ijse.ShoeShopManagementSystem.entity.Customer;
import lk.ijse.ShoeShopManagementSystem.entity.enums.Gender;
import lk.ijse.ShoeShopManagementSystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Vithum vindeepa
 */
@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private final CustomerService service;
    private static final org.apache.logging.log4j.Logger loggerLog4J = LogManager.getLogger(CustomerController.class);

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() throws Exception {
        loggerLog4J.info("Start getAllCustomers");
        try {
            List<Customer> allCustomers = service.getAllCustomers();
            return ResponseEntity.ok(allCustomers);
        } catch (Exception e) {
            handleException(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Map<String, String> credentials) {
        try {
            String[] requiredFields = {"name", "gender", "level", "totalPoint", "dob", "addressLine1", "addressLine2", "addressLine3",
                    "addressLine4", "addressLine5", "contact", "email", "purchaseDateAndTime"};
            validateMap(credentials, requiredFields);
            Customer customer = new Customer();
            UUID id = credentials.get("id") != null ? UUID.fromString(credentials.get("id")) : null;
            if (id != null) {
                Optional<Customer> byID = service.findById(id);
                if (byID.isPresent()) {
                    customer.setId(id);
                }
            }
            customer.setName(credentials.get("name"));
            customer.setGender(Gender.valueOf(credentials.get("gender")));
            customer.setContact(credentials.get("contact"));
            customer.setLevel(credentials.get("level"));
            customer.setTotalPoint(credentials.get("totalPoint"));
            customer.setDob(credentials.get("dob"));
            customer.setAddressLine1(credentials.get("addressLine1"));
            customer.setAddressLine2(credentials.get("addressLine2"));
            customer.setAddressLine3(credentials.get("addressLine3"));
            customer.setAddressLine4(credentials.get("addressLine4"));
            customer.setAddressLine5(credentials.get("addressLine5"));
            customer.setContact(credentials.get("contact"));
            customer.setEmail(credentials.get("email"));
            customer.setPurchaseDateAndTime(credentials.get("purchaseDateAndTime"));

            Date currentDate = new Date();
            customer.setUpdateDate(currentDate);
            if (id == null) {
                customer.setCreateDate(currentDate);
            }
            return ResponseEntity.ok(service.saveCustomer(customer));
        } catch (Exception e) {
            handleException(e);
            loggerLog4J.error("Error occurred while saving customer", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } finally {
            loggerLog4J.info("End saveCustomer");
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@RequestBody Map<String, String> credentials) {
        loggerLog4J.info("start deleteCustomer");
        try {
            String[] requiredFields = {"customerId"};
            validateMap(credentials, requiredFields);
            boolean res = service.deleteCustomer(UUID.fromString(credentials.get("customerId")));
            return ResponseEntity.ok(res ? "Customer Delete Successful..!":"Customer Delete Failed..!");
        }
        catch (Exception e) {
            handleException(e);
            loggerLog4J.error("Error occurred while saving customer", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } finally {
            loggerLog4J.info("End deleteCustomer");
        }
    }

    private void validateMap(Map<String, String> assetCategoryMap, String[] requiredFields) {
        for (String field : requiredFields) {
            if (assetCategoryMap.get(field) == null || assetCategoryMap.get(field).isEmpty()) {
                throw new IllegalArgumentException("Not found " + field);
            }
        }
    }

    private void handleException(Exception e) {
        loggerLog4J.error("Error ", e);
        e.printStackTrace();
    }
}
