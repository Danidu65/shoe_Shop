package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.LoyaltyLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customer")
@Entity
public class CustomerEntity {
    @Id
    private String customerId;
    private String customerName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date joinedDate;
    @Enumerated(EnumType.STRING)
    private LoyaltyLevel level;
    private Integer totalPoints;
    private Date DOB;
    private String ContactNumber;
    @Column(unique = true)
    private String email;
    private String buildingNumberOrName;
    private String addressLane;
    private String addressCity;
    private String addressState;
    private String postalCode;
}