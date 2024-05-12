package lk.ijse.gdse65.shoe_shop.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lk.ijse.gdse65.shoe_shop.entity.enums.Size;
import lk.ijse.gdse65.shoe_shop.entity.enums.StockStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryDTO {
    private Size size;
    private Integer qty;
    private Integer maxQty;
    private StockStatus status;
    private Color color;
}
