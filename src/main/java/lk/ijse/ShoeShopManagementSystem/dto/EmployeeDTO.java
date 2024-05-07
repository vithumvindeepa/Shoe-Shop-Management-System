package lk.ijse.ShoeShopManagementSystem.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author Vithum vindeepa
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {


    private String EmployeeId;

    private String employeeName;

    private String employeeProfilePic;

    private String status;

    private String designation;

    private Date dateOfBirthday;

    private Date dateOfJoin;

    private String attachedBranch;

    private String addressLine01;

    private String addressLine02;

    private String addressLine03;

    private String addressLine04;

    private String addressLine05;

    private String contactNumber;

    private String email;

    private String informInCaseIfEmergency;

    private String emergencyContact;


}
