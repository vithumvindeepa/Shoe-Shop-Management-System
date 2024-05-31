package lk.ijse.ShoeShopManagementSystem.service;
import lk.ijse.helloshoeshopmanagement.entity.AdminPanel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
/**
 * @author Vithum vindeepa
 */
public interface AdminPanelService {
    AdminPanel saveAdminPanel(AdminPanel adminPanel);
    List<AdminPanel> getAllAdminPanels();
    Optional<AdminPanel> findById(UUID id);
    boolean deleteAdminPanel(AdminPanel id);
}
