package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lk.ijse.gdse65.shoe_shop.entity.enums.Size;
import lk.ijse.gdse65.shoe_shop.entity.enums.StockStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "inventory")
//@Entity
public class InventoryEntity implements SuperEntity{
    @Enumerated(EnumType.STRING)
    private Size size;
    private Integer qty;
    private Integer maxQty;
    @Enumerated(EnumType.STRING)
    private StockStatus status;
    @Enumerated(EnumType.STRING)
    private Color color;
}
