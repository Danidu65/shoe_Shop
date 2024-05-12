package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item-images")
public class ItemImageEntity implements SuperEntity{
    @Id
    private String imgId;

    @Column(columnDefinition = "LONGTEXT")
    private String img;

    @OneToMany(mappedBy = "itemImage" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<StockEntity> stockList;
}
