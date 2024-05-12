package lk.ijse.gdse65.shoe_shop.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierHistory {
    private String supplierHistoryId;
    private Date suppliedDate;
    private Color color;
    private Integer totalQty;
    private Double totalValue;
}
