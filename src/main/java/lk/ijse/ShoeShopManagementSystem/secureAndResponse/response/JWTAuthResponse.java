package lk.ijse.ShoeShopManagementSystem.secureAndResponse.response;

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
public class JWTAuthResponse {
    private String token;
}
