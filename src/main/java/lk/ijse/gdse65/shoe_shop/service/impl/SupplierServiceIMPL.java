package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.SupplierDTO;
import lk.ijse.gdse65.shoe_shop.repo.SupplierRepo;
import lk.ijse.gdse65.shoe_shop.service.SupplierService;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lk.ijse.gdse65.shoe_shop.util.UtilMatters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierServiceIMPL implements SupplierService {
    private final Mapping mapping;
    private final SupplierRepo supplierRepo;
    @Override
    public SupplierDTO saveSupplier(SupplierDTO supplierDTO) {
        supplierDTO.setSupplierId(UtilMatters.generateId());
        return mapping.toSupplierDTO(supplierRepo.save(mapping.toSupplier(supplierDTO)));    }

    @Override
    public List<SupplierDTO> getAllSuppliers() {
        return mapping.getSupplierDTOList(supplierRepo.findAll());
    }
}
