package lk.ijse.gdse65.shoe_shop.contoller;

import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Role;
import lk.ijse.gdse65.shoe_shop.reqAndResponse.response.JwtAuthResponse;
import lk.ijse.gdse65.shoe_shop.reqAndResponse.secure.SignIn;
import lk.ijse.gdse65.shoe_shop.reqAndResponse.secure.SignUp;
import lk.ijse.gdse65.shoe_shop.service.secutiry.AuthenticationService;
import lk.ijse.gdse65.shoe_shop.util.UtilMatters;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

import static lk.ijse.gdse65.shoe_shop.util.Mapping.convertToDate;

@CrossOrigin
@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationService authenticationService;


    //signIn
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthResponse> signIn(@RequestBody SignIn signInReq) {
        return ResponseEntity.ok(authenticationService.signIn(signInReq));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthResponse> refreshToken(@RequestParam("refreshToken") String refreshToken) {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshToken));
    }

    //signup
    @PostMapping(value = "/signup", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<JwtAuthResponse> saveUser(
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
        byte[] byteProfilePic = new byte[0];
        try {
            byteProfilePic = profilePic.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String base64ProPic = UtilMatters.convertBase64(byteProfilePic);

        SignUp signUp = new SignUp();

        signUp.setEmployeeCode(employeeCode);
        signUp.setName(name);
        signUp.setGender(Gender.valueOf(gender));
        signUp.setStatus(status);
        signUp.setDob(convertToDate(dob));
        signUp.setJoinedDate(convertToDate(joinedDate));
        signUp.setBranch(branch);
        signUp.setAddressNo(addressNo);
        signUp.setAddressLane(addressLane);
        signUp.setAddressCity(addressCity);
        signUp.setAddressState(addressState);
        signUp.setPostalCode(postalCode);
        signUp.setEmail(email);
        signUp.setPhone(phone);
        signUp.setPassword(password);
        signUp.setGuardianOrNominatedPerson(guardianOrNominatedPerson);
        signUp.setEmergencyContact(emergencyContact);
        signUp.setDesignation(designation);
        signUp.setRole(Role.valueOf(role));
        signUp.setProfilePic(base64ProPic);

        return ResponseEntity.ok(authenticationService.signUp(signUp));
    }
}
