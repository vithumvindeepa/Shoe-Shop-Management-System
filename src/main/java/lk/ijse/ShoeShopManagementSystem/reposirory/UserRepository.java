package lk.ijse.ShoeShopManagementSystem.reposirory;

import lk.ijse.ShoeShopManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface UserRepository extends JpaRepository<User, UUID> {
}
