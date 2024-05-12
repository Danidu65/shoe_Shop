package lk.ijse.gdse65.shoe_shop.entity;

import jakarta.persistence.*;
import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity implements SuperEntity{
    @Id
    private String employeeId;
    private String employeeName;

    @Column(columnDefinition = "LONGTEXT")
    private String profilePic;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String status;
    private String designation;

    @Enumerated(EnumType.STRING)
    private Role accessRole;

    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    private String branch;
    private String contactNo;

    @Column(unique = true)
    private String email;

    private String addressNoOrName;
    private String addressLane;
    private String addressCity;
    private String addressState;
    private String postalCode;

    private String password;

    private String emergencyContactPerson;
    private String emergencyContactNumber;

    @OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<SalesEntity> saleList;

    @OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<RefundEntity> refundList;

}
