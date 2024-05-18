package lk.ijse.gdse65.shoe_shop.reqAndResponse.response;

import lk.ijse.gdse65.shoe_shop.dto.ResponseEmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JwtAuthResponse {
    private String token;
    private ResponseEmployeeDTO employee;
}
