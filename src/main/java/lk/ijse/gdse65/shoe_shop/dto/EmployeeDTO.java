package lk.ijse.gdse65.shoe_shop.dto;

import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String employeeId;
    private String employeeName;
    private String contactNumber;
    private Gender gender;
    private String email;
    private String password;
    private String profilePicture;
    private String status;
    private String designation;
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
