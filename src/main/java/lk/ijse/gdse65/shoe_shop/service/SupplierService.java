package lk.ijse.gdse65.shoe_shop.service;

import lk.ijse.gdse65.shoe_shop.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    SupplierDTO saveSupplier(SupplierDTO supplierDTO);
    List<SupplierDTO> getAllSuppliers();
}
