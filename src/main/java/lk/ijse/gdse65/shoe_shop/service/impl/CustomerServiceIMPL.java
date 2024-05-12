package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.CustomerDTO;
import lk.ijse.gdse65.shoe_shop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceIMPL implements CustomerService {

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(String customerId) {

    }
    @Override
    public CustomerDTO getByCode(String code) {

        return null;
    }

    @Override
    public CustomerDTO getSelectedCustomer(String customerId) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {

    }
}
