package lk.ijse.gdse65.shoe_shop.service;


import lk.ijse.gdse65.shoe_shop.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerId);

    CustomerDTO getByCode(String code);

    CustomerDTO getSelectedCustomer(String customerId);
    List<CustomerDTO> getAllCustomers();
    void updateCustomer(String customerId,CustomerDTO customerDTO);
}
