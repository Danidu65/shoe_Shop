package lk.ijse.gdse65.shoe_shop.dto;

import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseEmployeeDTO implements SuperDTO{
        private String employeeCode;
        private String name;
        private String profilePic;
        private Gender gender;
        private String status;
        private String designation;
        private Role role;
        private Date dob;
        private Date joinedDate;
        private String branch;
        private String addressNo;
        private String addressLane;
        private String addressCity;
        private String addressState;
        private String postalCode;
        private String email;
        private String phone;
        private String guardianOrNominatedPerson;
        private String emergencyContact;
}
