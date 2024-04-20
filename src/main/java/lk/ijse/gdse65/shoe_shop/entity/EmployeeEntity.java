package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    private String employeeId;
    private String employeeName;
    private String contactNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(unique = true)
    private String email;
    private String password;
    private String profilePicture;
    private String status;
    private String designation;
    @Enumerated(EnumType.STRING)
    private Role accessRole;
    private Date DOB;
    private Date joinDate;
    private String attachedBranch;
    private String buildingNoOrName;
    private String addressLane;
    private String addressCity;
    private String addressState;
    private String postalCode;
    private String emergencyContactNumber;
    private String emergencyContactName;
}
