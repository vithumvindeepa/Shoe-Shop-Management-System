package lk.ijse.ShoeShopManagementSystem.entity;

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
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private String EmployeeId;
    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
    @Column(name = "EMPLOYEE_PROFILE_PIC")
    private String employeeProfilePic;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "DATEO_OF_BIRTHDAY")
    private Date dateOfBirthday;
    @Column(name = "DATE_OF_JOIN")
    private Date dateOfJoin;
    @Column(name = "ATTACHED_BRANCH")
    private String attachedBranch;
    @Column(name = "BUILDING_NO_OR_NAME")
    private String addressLine01;
    @Column(name = "LANE")
    private String addressLine02;
    @Column(name = "CITY")
    private String addressLine03;
    @Column(name = "STATE")
    private String addressLine04;
    @Column(name = "POSTAL_CODE")
    private String addressLine05;
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "INFORM_IN_CASE_IF_EMERGENCY")
    private String informInCaseIfEmergency;
    @Column(name = "EMERGENCY_CONTACT")
    private String emergencyContact;
}
