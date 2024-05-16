package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.CustomerDTO;
import lk.ijse.gdse65.shoe_shop.exception.DuplicateException;
import lk.ijse.gdse65.shoe_shop.exception.NotFoundException;
import lk.ijse.gdse65.shoe_shop.repo.CustomerRepo;
import lk.ijse.gdse65.shoe_shop.service.CustomerService;
import lk.ijse.gdse65.shoe_shop.util.GenerateID;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceIMPL implements CustomerService {
    private final CustomerRepo customerRepo;
    private final Mapping mapping;
    private final GenerateID generateID;

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        try {
            customerDTO.setCustomerId(generateID.generateUUID());
            customerRepo.save(mapping.toCustomer(customerDTO));
            return true;

        } catch (Exception e) {
            throw new DuplicateException("Customer Duplicate Details Entered");
        }
    }
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return mapping.toCustomerDTOList(customerRepo.findAll());
    }
}

//    @Override
//    public CustomerDTO getCustomer(String cId) {
//        if (customerRepo.existsById(cId)) {
//            return mapping.toCustomerDTO(customerRepo.getReferenceById(cId));
//
//        }
//
//        throw new NotFoundException("Customer Not Found");
//
//    }
//
//    @Override
//    public boolean updateCustomer(CustomerDTO customerDTO) {
//        if (customerRepo.existsById(customerDTO.getCustomerId())) {
//            try {
//                customerRepo.save(mapping.toCustomer(customerDTO));
//                return true;
//
//            } catch (Exception e) {
//                throw new DuplicateException("Customer Duplicate DAta Entered");
//
//            }
//
//        }
//
//        throw new NotFoundException("Customer Not Found");
//    }
//
//    @Override
//    public boolean deleteCustomer(String cId) {
//        if (customerRepo.existsById(cId)) {
//            customerRepo.deleteById(cId);
//            return true;
//
//        }
//
//        throw new NotFoundException("Customer Not Found");
//    }



