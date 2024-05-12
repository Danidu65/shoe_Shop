package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "refund")
public class RefundEntity {
    @Id
    private String rId;
    private double value;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String reason;
    private int qty;

    @ManyToOne(fetch = FetchType.EAGER)
    private EmployeeEntity employee;

    @OneToOne
    private ItemSaleEntity itemSale;
}
