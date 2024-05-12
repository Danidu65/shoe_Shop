package lk.ijse.gdse65.shoe_shop.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalesDTO {
    private String oderId;
    private int itemQTY;
    private String addedPoint;
    private String orderDate;
    private String paymentMethod;
    private double totalPrice;
}
