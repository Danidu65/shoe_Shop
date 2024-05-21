package lk.ijse.gdse65.shoe_shop.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse65.shoe_shop.dto.ItemImageDTO;
import lk.ijse.gdse65.shoe_shop.repo.ItemImageRepo;
import lk.ijse.gdse65.shoe_shop.service.ItemImageService;
import lk.ijse.gdse65.shoe_shop.util.Mapping;
import lk.ijse.gdse65.shoe_shop.util.UtilMatters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemImageServiceImpl implements ItemImageService {
    private final Mapping mapping;
    private final ItemImageRepo itemImageRepo;

    @Override
    public ItemImageDTO saveItemImage(ItemImageDTO itemImageDTO) {
        itemImageDTO.setImageId(UtilMatters.generateId());
        return mapping.toItemImageDTO(itemImageRepo.save(mapping.toItemImageEntity(itemImageDTO)));
    }

    @Override
    public List<ItemImageDTO> getAll() {
        return mapping.getItemImageDTOList(itemImageRepo.findAll());
    }
}
