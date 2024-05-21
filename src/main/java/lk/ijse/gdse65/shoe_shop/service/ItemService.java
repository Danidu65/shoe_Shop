package lk.ijse.gdse65.shoe_shop.service;


import lk.ijse.gdse65.shoe_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    ItemDTO saveItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();

}
