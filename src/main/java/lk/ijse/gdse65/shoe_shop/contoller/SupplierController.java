package lk.ijse.gdse65.shoe_shop.contoller;

import lk.ijse.gdse65.shoe_shop.dto.SupplierDTO;
import lk.ijse.gdse65.shoe_shop.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/supplier")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Supplier health check";
    }

    @PostMapping
    public ResponseEntity<SupplierDTO> saveSupplier(@RequestBody SupplierDTO supplier){
        return ResponseEntity.ok(supplierService.saveSupplier(supplier));
    }
    @GetMapping(value = "/getAllSuppliers",produces = "application/json")
    public ResponseEntity<List<SupplierDTO>> getALlSuppliers(){
        List<SupplierDTO> suppliers = supplierService.getAllSuppliers();
        return ResponseEntity.ok(suppliers);
    }
}
