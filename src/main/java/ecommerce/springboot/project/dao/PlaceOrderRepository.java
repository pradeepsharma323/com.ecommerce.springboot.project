package ecommerce.springboot.project.dao;

import ecommerce.springboot.project.model.Customer;
import ecommerce.springboot.project.model.PlaceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceOrderRepository extends JpaRepository<Customer,Integer> {

    //@Query("SELECT new ecommerce.springboot.project.model.PlaceOrder(c.customerName, ps.amount, ps.productName, c.address, ps.disc) FROM Customer c JOIN Product ps")

    @Query("SELECT new ecommerce.springboot.project.model.PlaceOrder(c.customerName, ps.paymentStatus) FROM Customer c JOIN c.checkOutItem ps")
    public List<PlaceOrder> getJoinInformation();
}
