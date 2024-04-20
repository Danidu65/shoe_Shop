package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.SupplierCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "supplier")
@Entity
public class Supplier {
    @Id
    private String supplierId;
    private String supplierName;
    @Enumerated(EnumType.STRING)
    private String contactNumber;
    private String lanLineNumber;
    private SupplierCategory supplierCategory;
    @Column(unique = true)
    private String email;
    private String buildingNoOrName;
    private String addressLane;
    private String addressCity;
    private String addressState;
    private String postalCode;
    private String country;
}
