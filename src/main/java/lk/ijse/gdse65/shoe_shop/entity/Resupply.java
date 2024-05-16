package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Resupply {
    @Id
    private String resupplyId;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double totalValue;
    private int totalQty;

    @OneToMany(mappedBy = "resupply" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<ItemResupply> itemResupplyList;

}
