package lk.ijse.gdse65.shoe_shop.service;

import lk.ijse.gdse65.shoe_shop.dto.CheckUserDTO;
import lk.ijse.gdse65.shoe_shop.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> getAllEmployees();
    Boolean check(CheckUserDTO user);
}
