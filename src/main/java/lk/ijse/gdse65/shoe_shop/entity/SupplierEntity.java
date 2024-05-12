package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.SupplierCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "supplier")
@Entity
public class SupplierEntity implements SuperEntity{
    @Id
    private String supplierId;
    private String supplierName;

    @Enumerated(EnumType.STRING)
    private SupplierCategory supplierCategory;

    private String mobileNo;
    private String landLineNo;

    @Column(unique = true)
    private String email;

    private String addressNoOrName;
    private String addressLane;
    private String addressState;
    private String addressCity;
    private String postalCode;
    private String country;

    @OneToMany(mappedBy = "supplier" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<ItemEntity> itemList;
}
