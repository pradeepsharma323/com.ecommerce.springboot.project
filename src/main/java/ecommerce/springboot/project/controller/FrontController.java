package ecommerce.springboot.project.controller;

import ecommerce.springboot.project.model.CheckOutItem;
import ecommerce.springboot.project.model.Customer;
import ecommerce.springboot.project.model.PlaceOrder;
import ecommerce.springboot.project.model.Product;
import ecommerce.springboot.project.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restApi")
public class FrontController {

    @Autowired
    ServiceImpl service;

    @PostMapping("/addToCart")
    public String addItemToCart(@RequestBody Product product){
        service.addCart(product);
        return "You have added :"+product.getProductName() +" into cart successfully";
    }
    @GetMapping("/getCartItem")
    public List<Product> getAddedItemList(){
        List<Product> itemList= service.getProductList();
        return itemList;
    }
    @PostMapping("/checkoutItem")
    public ResponseEntity<CheckOutItem> itemCheckout(@RequestBody CheckOutItem checkOutItem){
        service.itemCheckout(checkOutItem);
        return new ResponseEntity<>(checkOutItem, HttpStatus.CREATED);
    }

    @PostMapping("/placeOrder")
    public List<PlaceOrder> orderPlaced(@RequestBody Customer customer) {
        return service.placeOrder(customer);
    }
}
