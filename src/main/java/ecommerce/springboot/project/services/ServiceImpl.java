package ecommerce.springboot.project.services;

import ecommerce.springboot.project.dao.CheckoutItemRepository;
import ecommerce.springboot.project.dao.PlaceOrderRepository;
import ecommerce.springboot.project.dao.ProductRepository;
import ecommerce.springboot.project.model.CheckOutItem;
import ecommerce.springboot.project.model.Customer;
import ecommerce.springboot.project.model.PlaceOrder;
import ecommerce.springboot.project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ServiceImpl implements ServiceInterface{

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CheckoutItemRepository checkoutItemRepository;
    @Autowired
    PlaceOrderRepository placeOrderRepository;

    @Override
    public void addCart(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    @Override
    public void itemCheckout(CheckOutItem checkOutItem) {
        checkoutItemRepository.save(checkOutItem);
    }

    @Override
    public List<PlaceOrder> placeOrder(Customer customer) {
        placeOrderRepository.save(customer);
        return placeOrderRepository.getJoinInformation();
    }
}
