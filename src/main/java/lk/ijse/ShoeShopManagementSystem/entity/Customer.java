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

    @Column(name = "CUSTOMER-ID")
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENDER")
    private Gender gender;

    @Column(name = "JOIN_DATE")
    private Date joinDate;

    @Column(name = "LEVEL")
    private String level;

    @Column(name = "TOTAL_POINT")
    private String totalPoint;

    @Column(name = "DATE_OF_BIRTHDAY")
    private String dob;

    @Column(name = "ADDRESS_LINE_01")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_02")
    private String addressLine2;

    @Column(name = "ADDRESS_LINE_03")
    private String addressLine3;

    @Column(name = "ADDRESS_LINE_04")
    private String addressLine4;

    @Column(name = "ADDRESS_LINE_05")
    private String addressLine5;

    @Column(name = "CONTACT")
    private String contact;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PURCHASE_DATE_AND_TIME")
    private String purchaseDateAndTime;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "CREATE_DATE")
    private Date createDate;
}
