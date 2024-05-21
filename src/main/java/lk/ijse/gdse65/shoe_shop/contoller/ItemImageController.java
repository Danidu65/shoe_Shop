package lk.ijse.gdse65.shoe_shop.contoller;

import jakarta.validation.Valid;
import lk.ijse.gdse65.shoe_shop.dto.ItemImageDTO;
import lk.ijse.gdse65.shoe_shop.service.ItemImageService;
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
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/itemImage")
@RequiredArgsConstructor
public class ItemImageController {

    private final ItemImageService itemImageService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Item Image health check";
    }


    @GetMapping("/getall")
    public ResponseEntity<List<ItemImageDTO>> getAll(){
        return ResponseEntity.ok(itemImageService.getAll());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE , value= "/saveimage")
    public ResponseEntity<ItemImageDTO> saveItemImage(@Valid
                                                      @RequestPart("id")String id,
                                                      @RequestPart("image") MultipartFile image,
                                                      Errors errors) {
        if (errors.hasFieldErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    errors.getFieldErrors().get(0).getDefaultMessage());
        }
        //convert image to base64
        byte[] byteImage = new byte[0];
        try {
            byteImage = image.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String base64ProPic = UtilMatters.convertBase64(byteImage);
        //build Object
        ItemImageDTO updatedBuildItemImage = new ItemImageDTO();
        updatedBuildItemImage.setImageId(id);
        updatedBuildItemImage.setImage(base64ProPic);
        return ResponseEntity.ok(itemImageService.saveItemImage(updatedBuildItemImage));
    }
}
