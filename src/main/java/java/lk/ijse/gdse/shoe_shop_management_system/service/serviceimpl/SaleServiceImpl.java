package java.lk.ijse.gdse.shoe_shop_management_system.service.serviceimpl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Vithum vindeepa
 */
@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class SaleServiceImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FIRSTNAME")
    private String firstName;
}
