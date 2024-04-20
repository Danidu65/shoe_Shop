package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;

import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "supplier-history")
public class SupplierHistoryEntity {
    @Id
    private String supplierHistoryId;
    private Date suppliedDate;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Integer totalQty;
    private Double totalValue;
}