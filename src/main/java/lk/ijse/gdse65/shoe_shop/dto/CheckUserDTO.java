package lk.ijse.gdse65.shoe_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckUserDTO implements SuperDTO{
    private String email;
    private String password;
}
