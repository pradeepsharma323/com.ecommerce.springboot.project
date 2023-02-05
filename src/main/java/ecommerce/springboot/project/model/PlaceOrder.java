package ecommerce.springboot.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlaceOrder {
    private String customerName;
    private String paymentStatus;
    /*private String productName;
    private String address;
    private String productDisc;*/
}
