package lk.ijse.gdse65.shoe_shop.service;


import lk.ijse.gdse65.shoe_shop.dto.ItemImageDTO;

import java.util.List;

public interface ItemImageService {
    ItemImageDTO saveItemImage(ItemImageDTO itemImageDTO);
    List<ItemImageDTO> getAll();
}
