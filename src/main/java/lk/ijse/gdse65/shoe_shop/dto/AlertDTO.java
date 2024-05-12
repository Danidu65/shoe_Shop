package lk.ijse.gdse65.shoe_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlertDTO {
    private String alertId;
    private Date alertDate;
    private Time alertTime;
    private String message;
}
