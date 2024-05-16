package lk.ijse.gdse65.shoe_shop.repo;

import lk.ijse.gdse65.shoe_shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,String> {
}
