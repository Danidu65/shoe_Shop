package lk.ijse.gdse65.shoe_shop.service;

import lk.ijse.gdse65.shoe_shop.dto.EmployeeDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    void save(EmployeeDTO employeeDTO);
}
