package lk.ijse.gdse65.shoe_shop.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.ijse.gdse65.shoe_shop.entity.enums.SupplierCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierDTO {
    private String supplierId;
    private String supplierName;
    private String contactNumber;
    private String lanLineNumber;
    private SupplierCategory supplierCategory;
    private String email;
    private String buildingNoOrName;
    private String addressLane;
    private String addressCity;
    private String addressState;
    private String postalCode;
    private String country;
}
