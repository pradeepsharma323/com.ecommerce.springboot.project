package ecommerce.springboot.project.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "checkoutitem")
public class CheckOutItem {
    @Id
    @GeneratedValue
    private int checkoutId;
    @Column
    private String productId;
    @Column
    private String paymentStatus;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ck_fk", referencedColumnName = "checkoutId")
    private List<Product> products;
}
