package ecommerce.springboot.project.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column
    private String productName;
    @Column
    private String amount;
    @Column
    private String quantity;
    @Column
    private String disc;


}
