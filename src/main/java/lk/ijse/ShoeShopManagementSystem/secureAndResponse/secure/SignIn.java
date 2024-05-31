package lk.ijse.ShoeShopManagementSystem.secureAndResponse.secure;

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
public class SignIn {
    private String email;
    private String password;
}
