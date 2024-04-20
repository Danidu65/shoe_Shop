package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "alert")
public class Alert {
    @Id
    private String alertId;
    private Date alertDate;
    private Time alertTime;
    private String message;
}

