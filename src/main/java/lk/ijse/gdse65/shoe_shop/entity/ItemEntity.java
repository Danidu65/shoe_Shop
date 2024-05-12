package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "item")
@Entity
public class ItemEntity implements SuperEntity{
    @Id
    private String iCode;
    private String description;
    private String category;
    private double priceBuy;
    private double priceSell;

    @OneToMany(mappedBy = "item" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<ItemSaleEntity> itemSaleList;

    @ManyToOne(fetch = FetchType.EAGER)
    private SupplierEntity supplier;

    @OneToMany(mappedBy = "item" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<StockEntity> stockList;

    @OneToMany(mappedBy = "item" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<ItemResupplyEntity> itemResupplyList;

}
