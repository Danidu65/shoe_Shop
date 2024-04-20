package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "sales")
public class SalesEntity {
    @Id
    private String oderId;
    private int itemQTY;
    private String addedPoint;
    @Enumerated(EnumType.STRING)
    private String orderDate;
    private String paymentMethod;
    private double totalPrice;
}
