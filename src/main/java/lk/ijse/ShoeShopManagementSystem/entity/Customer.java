package lk.ijse.ShoeShopManagementSystem.entity;

import jakarta.persistence.*;
import lk.ijse.ShoeShopManagementSystem.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */

@Data
@ToString
@Table(name = "CUSTOMER_TABLE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Gender gender;
    private Date joinDate;
    private String level;
    private String totalPoint;
    private String dob;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String addressLine5;
    private String contact;
    private String email;
    private String purchaseDateAndTime;
    private Date updateDate;
    private Date createDate;
}
