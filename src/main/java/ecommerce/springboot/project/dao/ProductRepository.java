package ecommerce.springboot.project.dao;

import ecommerce.springboot.project.model.CheckOutItem;
import ecommerce.springboot.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //@Query("from Country c where c.countryName=:name")
    /*@Query("INSERT INTO checkoutitem (productId,paymentStatus,customer) VALUES(?,?,?)")
    CheckOutItem itemCheckout(@RequestBody CheckOutItem checkOutItem);*/
}
