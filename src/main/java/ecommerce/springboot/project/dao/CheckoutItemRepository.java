package ecommerce.springboot.project.dao;

import ecommerce.springboot.project.model.CheckOutItem;
import ecommerce.springboot.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutItemRepository extends JpaRepository<CheckOutItem,Integer> {
}
