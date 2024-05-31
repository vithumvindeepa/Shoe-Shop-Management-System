package lk.ijse.ShoeShopManagementSystem.serviceimpl;

import lk.ijse.ShoeShopManagementSystem.entity.User;
import lk.ijse.ShoeShopManagementSystem.repository.UserRepository;
import lk.ijse.ShoeShopManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Vithum vindeepa
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean deleteUser(User id) {
        userRepository.delete(id);
        return true;
    }
}
