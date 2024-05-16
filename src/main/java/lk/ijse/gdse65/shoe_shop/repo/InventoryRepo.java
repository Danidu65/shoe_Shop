package lk.ijse.gdse65.shoe_shop.repo;

import lk.ijse.gdse65.shoe_shop.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,String> {
}
