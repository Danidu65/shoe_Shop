package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "refund")
public class RefundEntity {
    private Date refundDate;
    private String description;
}
