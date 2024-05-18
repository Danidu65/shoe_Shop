package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.CheckUserDTO;
import lk.ijse.gdse65.shoe_shop.dto.EmployeeDTO;
import lk.ijse.gdse65.shoe_shop.entity.Employee;
import lk.ijse.gdse65.shoe_shop.exception.NotFoundException;
import lk.ijse.gdse65.shoe_shop.repo.EmployeeRepo;
import lk.ijse.gdse65.shoe_shop.service.EmployeeService;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lk.ijse.gdse65.shoe_shop.util.UtilMatters;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {
    private final Mapping mapping;
    private final EmployeeRepo employeeRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        employeeDTO.setEmployeeId(UtilMatters.generateId());
        employeeDTO.setPassword(passwordEncoder.encode(employeeDTO.getPassword()));
        return mapping.toEmployeeDTO(employeeRepo.save(mapping.toEmployee(employeeDTO)));
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        Employee existingEmployee = employeeRepo.findByEmail(employeeDTO.getEmail())
                .orElseThrow(() -> new NotFoundException("Employee not found"));

//        existingEmployee.setEmployeeCode(employeeDTO.getEmployeeCode());
        existingEmployee.setEmployeeName(employeeDTO.getEmployeeName());
        existingEmployee.setProfilePic(employeeDTO.getProfilePicture());
        existingEmployee.setGender(employeeDTO.getGender());
        existingEmployee.setStatus(employeeDTO.getStatus());
        existingEmployee.setDesignation(employeeDTO.getDesignation());
        existingEmployee.setRole(employeeDTO.getAccessRole());
        existingEmployee.setDob(employeeDTO.getDOB());
        existingEmployee.setJoinedDate(employeeDTO.getJoinDate());
        existingEmployee.setBranch(employeeDTO.getAttachedBranch());
//        existingEmployee.setAddressNo(employeeDTO.setBuildingNoOrName());
        existingEmployee.setAddressLane(employeeDTO.getAddressLane());
        existingEmployee.setAddressCity(employeeDTO.getAddressCity());
        existingEmployee.setAddressState(employeeDTO.getAddressState());
        existingEmployee.setPostalCode(employeeDTO.getPostalCode());
        existingEmployee.setEmail(employeeDTO.getEmail());
        existingEmployee.setPhone(employeeDTO.getContactNumber());
//        existingEmployee.setPassword(employeeDTO.getPassword());
        existingEmployee.setGuardianOrNominatedPerson(employeeDTO.getEmergencyContactName());
//        existingEmployee.setEmergencyContact(employeeDTO.setEmergencyContactNumber());

        Employee updatedEmployee = employeeRepo.save(existingEmployee);

        return mapping.toEmployeeDTO(updatedEmployee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return mapping.toEmployeeDTOList(employeeRepo.findAll());
    }

    @Override
    public Boolean check(CheckUserDTO user) {
        try {
            var userEntityOptional = employeeRepo.findByEmail(user.getEmail());
            if (userEntityOptional.isPresent()) {
                Employee userEntity = userEntityOptional.get();
                String storedPassword = userEntity.getPassword();
                String enteredPassword = user.getPassword();

                boolean passwordMatches = passwordEncoder.matches(enteredPassword, storedPassword);
                return passwordMatches;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
