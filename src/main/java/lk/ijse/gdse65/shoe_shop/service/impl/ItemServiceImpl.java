package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;

import lk.ijse.gdse65.shoe_shop.dto.ItemDTO;
import lk.ijse.gdse65.shoe_shop.repo.ItemRepo;
import lk.ijse.gdse65.shoe_shop.service.ItemService;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final Mapping mapping;
    private final ItemRepo itemRepo;

    @Override
    public ItemDTO saveItem(ItemDTO itemDTO) {
        return mapping.toItemDTO(itemRepo.save(mapping.toItemEntity(itemDTO)));
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return mapping.getItemDTOList(itemRepo.findAll());
    }
}
