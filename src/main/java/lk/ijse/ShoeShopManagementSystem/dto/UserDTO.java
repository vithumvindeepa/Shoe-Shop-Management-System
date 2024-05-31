package lk.ijse.ShoeShopManagementSystem.dto;

import lk.ijse.ShoeShopManagementSystem.enums.Role;
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
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private UUID id;
    private String email;
    private String password;
    private Role role;
    private Date createDate;
    private Date updateDate;
}
