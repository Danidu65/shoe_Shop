package lk.ijse.gdse65.shoe_shop.dao;

import lk.ijse.gdse65.shoe_shop.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {

}
