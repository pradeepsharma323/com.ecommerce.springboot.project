package ecommerce.springboot.project.services;

import ecommerce.springboot.project.model.CheckOutItem;
import ecommerce.springboot.project.model.Customer;
import ecommerce.springboot.project.model.PlaceOrder;
import ecommerce.springboot.project.model.Product;

import java.util.List;

public interface ServiceInterface {
    public void addCart(Product product);
    public List<Product> getProductList();
    public void itemCheckout(CheckOutItem checkOutItem);
    public List<PlaceOrder> placeOrder(Customer customer);

}
