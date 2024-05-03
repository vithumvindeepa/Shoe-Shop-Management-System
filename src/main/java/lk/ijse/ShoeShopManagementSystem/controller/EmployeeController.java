package lk.ijse.ShoeShopManagementSystem.controller;
import lk.ijse.ShoeShopManagementSystem.entity.Employee;;
import lk.ijse.ShoeShopManagementSystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Vithum vindeepa
 */
@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    private static final org.apache.logging.log4j.Logger loggerLog4J = LogManager.getLogger(EmployeeController.class);
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee() throws Exception {
        loggerLog4J.info("Start getAllEmployee");
        try {
            List<Employee> allEmployee = employeeService.getAllEmployee();
            return ResponseEntity.ok(allEmployee);
        } catch (Exception e) {
            handleException(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Map<String, String> credentials) {
        try {
            String[] requiredFields = {"employeeName", "employeeProfilePic", "status", "designation", "dateOfBirthday", "dateOfJoin", "attachedBranch", "addressLine01",
                    "addressLine02", "addressLine03", "addressLine04", "addressLine05", "contactNumber","email","informInCaseIfEmergency","emergencyContact"};
            validateMap(credentials, requiredFields);
            Employee employee = new Employee();
            String employeeId = credentials.get("employeeId") != null ? (credentials.get("employeeId")) : null;
            if (employeeId != null) {
                Optional<Employee> byID = employeeService.findByEmployeeId(employeeId);
                if (byID.isPresent()) {
                    employee.setEmployeeId(employeeId);
                }
            }
            employee.setEmployeeName(credentials.get("employeeName"));
            employee.setEmployeeProfilePic(credentials.get("employeeProfilePic"));
            employee.setStatus(credentials.get("status"));
            employee.setDesignation(credentials.get("designation"));
//
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateOfBirthday = dateFormat.parse(credentials.get("dateOfBirthday"));
            Date dateOfJoin = dateFormat.parse(credentials.get("dateOfJoin"));
            employee.setDateOfBirthday(dateOfBirthday);
            employee.setDateOfJoin(dateOfJoin);

            employee.setAttachedBranch(credentials.get("attachedBranch"));
            employee.setAddressLine01(credentials.get("addressLine01"));
            employee.setAddressLine02(credentials.get("addressLine02"));
            employee.setAddressLine03(credentials.get("addressLine03"));
            employee.setAddressLine04(credentials.get("addressLine04"));
            employee.setAddressLine05(credentials.get("addressLine05"));
            employee.setContactNumber(credentials.get("contactNumber"));
            employee.setEmail(credentials.get("email"));
            employee.setInformInCaseIfEmergency(credentials.get("informInCaseIfEmergency"));
            employee.setEmergencyContact(credentials.get("emergencyContact"));


            return ResponseEntity.ok(employeeService.saveEmployee(employee));
        } catch (Exception e) {
            handleException(e);
            loggerLog4J.error("Error occurred while saving employee", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } finally {
            loggerLog4J.info("End saveEmployee");
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteEmployee(@RequestBody Map<String, String> credentials) {
        loggerLog4J.info("start Employee");
        try {
            String[] requiredFields = {"employeeId"};
            validateMap(credentials, requiredFields);
            boolean res = employeeService.deleteEmployee((credentials.get("employeeId")));
            return ResponseEntity.ok(res ? "Employee Delete Successful..!":"Employee Delete Failed..!");
        }
        catch (Exception e) {
            handleException(e);
            loggerLog4J.error("Error occurred while saving employee", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } finally {
            loggerLog4J.info("End employeeId");
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
