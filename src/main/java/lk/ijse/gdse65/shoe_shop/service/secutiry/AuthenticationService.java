package lk.ijse.gdse65.shoe_shop.service.secutiry;

import lk.ijse.gdse65.shoe_shop.reqAndResponse.response.JwtAuthResponse;
import lk.ijse.gdse65.shoe_shop.reqAndResponse.secure.SignIn;
import lk.ijse.gdse65.shoe_shop.reqAndResponse.secure.SignUp;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
