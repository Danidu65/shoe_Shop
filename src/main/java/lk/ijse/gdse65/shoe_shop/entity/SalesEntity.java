package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "sales")
public class SalesEntity implements SuperEntity{
    @Id
    private String oId;
    private String itemQty;
    private double totalPrice;
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private int points;

    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.EAGER)
    private EmployeeEntity employee;

    @OneToMany(mappedBy = "sale" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<ItemSaleEntity> itemSaleList;
}
