package lk.ijse.gdse65.shoe_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO {
    private String itemCode;
    private String itemDescription;
    private String category;
    private double priceBuy;
    private double priceSale;
}
