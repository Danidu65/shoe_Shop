package lk.ijse.gdse65.shoe_shop.dao;

import lk.ijse.gdse65.shoe_shop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
}