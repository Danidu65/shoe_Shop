package lk.ijse.gdse65.shoe_shop.repo;

import lk.ijse.gdse65.shoe_shop.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
}
