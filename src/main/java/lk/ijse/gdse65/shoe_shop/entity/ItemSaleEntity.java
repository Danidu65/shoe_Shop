package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.Color;
import lk.ijse.gdse65.shoe_shop.entity.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "item_sale")
@Entity
public class ItemSaleEntity {
    @Id
    private String itemSaleId;

    @ManyToOne
    private SalesEntity sale;
    @ManyToOne
    private ItemEntity item;
    @OneToOne(mappedBy = "itemSale")
    private RefundEntity refund;


    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private Color colour;

    private int qty;

}
