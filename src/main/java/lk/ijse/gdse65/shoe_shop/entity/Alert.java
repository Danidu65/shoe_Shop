package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "alert")
public class Alert implements SuperEntity {
    @Id
    private String alertId;
    private String Message;
    @Temporal(TemporalType.DATE)
    private Date date;
}

