package lk.ijse.gdse65.shoe_shop.service;


import lk.ijse.gdse65.shoe_shop.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);
//    CustomerDTO getCustomer(String cId);
//    boolean updateCustomer(CustomerDTO customerDTO);
//    boolean deleteCustomer(String cId);
    List<CustomerDTO> getAllCustomers();
}
