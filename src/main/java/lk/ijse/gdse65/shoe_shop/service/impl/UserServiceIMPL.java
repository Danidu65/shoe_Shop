package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.EmployeeDTO;
import lk.ijse.gdse65.shoe_shop.repo.UserRepo;
import lk.ijse.gdse65.shoe_shop.service.UserService;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserRepo userRepo;
    private final Mapping mapping;
    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                (UserDetails) userRepo.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));    }

    @Override
    public void save(EmployeeDTO employeeDTO) {
        mapping.toEmployeeDTO(userRepo.save(mapping.toEmployeeEntity(employeeDTO)));
    }
}
