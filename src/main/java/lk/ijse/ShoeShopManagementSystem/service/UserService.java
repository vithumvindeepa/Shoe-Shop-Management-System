package lk.ijse.ShoeShopManagementSystem.service;

import lk.ijse.ShoeShopManagementSystem.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
public interface UserService {

    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> findById(UUID id);
    boolean deleteUser(User id);
}
