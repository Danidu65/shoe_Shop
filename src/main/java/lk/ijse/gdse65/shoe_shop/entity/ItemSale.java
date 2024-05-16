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
public class ItemSale {
    @Id
    private String itemSaleId;

    @ManyToOne
    private Sales sale;
    @ManyToOne
    private Item item;
    @OneToOne(mappedBy = "itemSale")
    private Refund refund;


    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private Color colour;

    private int qty;

}
