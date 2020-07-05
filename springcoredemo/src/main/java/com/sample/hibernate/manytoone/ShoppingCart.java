package com.sample.hibernate.manytoone;

import com.sample.hibernate.onetomany.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="mapping_demo_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="quantity")
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", quantity=" + quantity +
                '}';
    }
}
