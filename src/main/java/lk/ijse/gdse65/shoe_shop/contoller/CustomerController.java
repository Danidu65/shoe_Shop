package lk.ijse.gdse65.shoe_shop.contoller;

import lk.ijse.gdse65.shoe_shop.dto.CustomerDTO;
import lk.ijse.gdse65.shoe_shop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin

public class CustomerController {
    private final CustomerService customerService;


}
