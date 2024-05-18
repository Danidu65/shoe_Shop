package lk.ijse.gdse65.shoe_shop.contoller;

import lk.ijse.gdse65.shoe_shop.dto.CheckUserDTO;
import lk.ijse.gdse65.shoe_shop.dto.EmployeeDTO;
import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lk.ijse.gdse65.shoe_shop.service.EmployeeService;
import lk.ijse.gdse65.shoe_shop.util.UtilMatters;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.List;

import static lk.ijse.gdse65.shoe_shop.util.Mapping.convertToDate;

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Employee Health Check";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "Hello User";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin(){
        return "Hello admin";
    }

    //check valid user

    @PostMapping("/check")
    public ResponseEntity<Boolean> checkValidation(@RequestBody CheckUserDTO user){
        return ResponseEntity.ok(employeeService.check(user));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<EmployeeDTO> saveEmployee(@Validated
                                                    @RequestPart("profilePic") MultipartFile profilePic,
                                                    @RequestPart("employeeCode")String employeeCode,
                                                    @RequestPart("name")String name,
                                                    @RequestPart("gender")String gender,
                                                    @RequestPart("status")String status,
                                                    @RequestPart("dob")String dob,
                                                    @RequestPart("joinedDate")String joinedDate,
                                                    @RequestPart("branch")String branch,
                                                    @RequestPart("addressNo")String addressNo,
                                                    @RequestPart("addressLane")String addressLane,
                                                    @RequestPart("addressCity")String addressCity,
                                                    @RequestPart("addressState")String addressState,
                                                    @RequestPart("postalCode")String postalCode,
                                                    @RequestPart("email")String email,
                                                    @RequestPart("phone")String phone,
                                                    @RequestPart("password")String password,
                                                    @RequestPart("guardianOrNominatedPerson")String guardianOrNominatedPerson,
                                                    @RequestPart("role")String role,
                                                    @RequestPart("designation")String designation,
                                                    @RequestPart("emergencyContact")String emergencyContact,
                                                    Errors errors){
        if (errors.hasFieldErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    errors.getFieldErrors().get(0).getDefaultMessage());
        }
        //convert image to base64
        byte[] profilePicByte = new byte[0];
        try {
            profilePicByte = profilePic.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String base64ProPic = UtilMatters.convertBase64(profilePicByte);
        //build Object
        EmployeeDTO updatedBuildEmployee = new EmployeeDTO();
        updatedBuildEmployee.setEmployeeId(employeeCode);
        updatedBuildEmployee.setEmployeeName(name);
        updatedBuildEmployee.setGender(Gender.valueOf(gender));
        updatedBuildEmployee.setStatus(status);
        updatedBuildEmployee.setDOB(convertToDate(dob));
        updatedBuildEmployee.setJoinDate(convertToDate(joinedDate));
        updatedBuildEmployee.setAttachedBranch(branch);
//        updatedBuildEmployee.setBuildingNoOrName();
        updatedBuildEmployee.setAddressLane(addressLane);
        updatedBuildEmployee.setAddressCity(addressCity);
        updatedBuildEmployee.setAddressState(addressState);
        updatedBuildEmployee.setPostalCode(postalCode);
        updatedBuildEmployee.setEmail(email);
        updatedBuildEmployee.setContactNumber(phone);
        updatedBuildEmployee.setPassword(password);
        updatedBuildEmployee.setEmergencyContactName(guardianOrNominatedPerson);
        updatedBuildEmployee.setEmergencyContactNumber(emergencyContact);
        updatedBuildEmployee.setDesignation(designation);
        updatedBuildEmployee.setAccessRole(Role.USER.valueOf(role));
        updatedBuildEmployee.setProfilePicture(base64ProPic);

        return ResponseEntity.ok(employeeService.saveEmployee(updatedBuildEmployee));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<EmployeeDTO> updateEmployee(@Validated @RequestPart("profilePic")MultipartFile profilePic,
                                                      @RequestPart("employeeCode")String employeeCode,
                                                      @RequestPart("name")String name,
                                                      @RequestPart("gender")String gender,
                                                      @RequestPart("status")String status,
                                                      @RequestPart("dob")String dob,
                                                      @RequestPart("joinedDate")String joinedDate,
                                                      @RequestPart("branch")String branch,
                                                      @RequestPart("addressNo")String addressNo,
                                                      @RequestPart("addressLane")String addressLane,
                                                      @RequestPart("addressCity")String addressCity,
                                                      @RequestPart("addressState")String addressState,
                                                      @RequestPart("postalCode")String postalCode,
                                                      @RequestPart("email")String email,
                                                      @RequestPart("phone")String phone,
                                                      @RequestPart("password")String password,
                                                      @RequestPart("guardianOrNominatedPerson")String guardianOrNominatedPerson,
                                                      @RequestPart("role")String role,
                                                      @RequestPart("designation")String designation,
                                                      @RequestPart("emergencyContact")String emergencyContact,
                                                      Errors errors){
        if (errors.hasFieldErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    errors.getFieldErrors().get(0).getDefaultMessage());
        }
        //convert image to base64
        byte[] profilePicByte = new byte[0];
        try {
            profilePicByte = profilePic.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String base64ProPic = UtilMatters.convertBase64(profilePicByte);
        //build Object
        EmployeeDTO updatedBuildEmployee = new EmployeeDTO();
        updatedBuildEmployee.setEmployeeId(employeeCode);
        updatedBuildEmployee.setEmployeeName(name);
        updatedBuildEmployee.setGender(Gender.valueOf(gender));
        updatedBuildEmployee.setStatus(status);
        updatedBuildEmployee.setDOB(convertToDate(dob));
        updatedBuildEmployee.setJoinDate(convertToDate(joinedDate));
        updatedBuildEmployee.setAttachedBranch(branch);
//        updatedBuildEmployee.setBuildingNoOrName();
        updatedBuildEmployee.setAddressLane(addressLane);
        updatedBuildEmployee.setAddressCity(addressCity);
        updatedBuildEmployee.setAddressState(addressState);
        updatedBuildEmployee.setPostalCode(postalCode);
        updatedBuildEmployee.setEmail(email);
        updatedBuildEmployee.setContactNumber(phone);
        updatedBuildEmployee.setPassword(password);
        updatedBuildEmployee.setEmergencyContactName(guardianOrNominatedPerson);
        updatedBuildEmployee.setEmergencyContactNumber(emergencyContact);
        updatedBuildEmployee.setDesignation(designation);
        updatedBuildEmployee.setAccessRole(Role.USER.valueOf(role));
        updatedBuildEmployee.setProfilePicture(base64ProPic);

        return ResponseEntity.ok(employeeService.updateEmployee(updatedBuildEmployee));
    }




    @GetMapping(value = "/getAllEmployees",produces = "application/json")
    public ResponseEntity<List<EmployeeDTO>> getALlEmployees(){
        List<EmployeeDTO> employees = employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }
}
