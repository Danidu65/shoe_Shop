package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "item")
@Entity
public class ItemEntity {
    @Id
    private String itemCode;
    private String itemDescription;
    private String category;
    private double priceBuy;
    private double priceSale;
}
