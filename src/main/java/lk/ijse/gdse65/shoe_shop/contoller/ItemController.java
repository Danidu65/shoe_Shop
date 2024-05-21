package lk.ijse.gdse65.shoe_shop.contoller;

import lk.ijse.gdse65.shoe_shop.dto.ItemDTO;
import lk.ijse.gdse65.shoe_shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Item health check";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/saveitem")
    public ResponseEntity<ItemDTO> saveItem(@RequestBody ItemDTO item){
        return ResponseEntity.ok(itemService.saveItem(item));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<ItemDTO>> getAll(){
        return ResponseEntity.ok(itemService.getAllItems());
    }
}
