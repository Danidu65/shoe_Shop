package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.dto.ItemImage;
import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lk.ijse.gdse65.shoe_shop.entity.enums.Size;
import lk.ijse.gdse65.shoe_shop.entity.enums.StockStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@IdClass(StockId.class)
@Entity
public class StockEntity {
    @Id
    private Size size;
    private int qty;
    private int maxQty;

    @Enumerated(EnumType.STRING)
    @Id
    private Color colour;

    @Enumerated(EnumType.STRING)
    private StockStatus status;

    @ManyToOne
    @Id
    private ItemEntity item;

    @ManyToOne
    private ItemImageEntity itemImage;

}
