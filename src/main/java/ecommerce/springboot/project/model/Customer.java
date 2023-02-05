package ecommerce.springboot.project.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private int customerId;
    @Column
    private String customerName;
    @Column
    private String address;
    @Column
    private String phone;
    @OneToMany(targetEntity = CheckOutItem.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ck_fk", referencedColumnName = "customerId")
    private List<CheckOutItem> checkOutItem;
}
