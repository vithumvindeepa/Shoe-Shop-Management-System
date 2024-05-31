package lk.ijse.ShoeShopManagementSystem.secureAndResponse.secure;

import com.codevent.demoSpringSecurity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vithum vindeepa
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUp {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}