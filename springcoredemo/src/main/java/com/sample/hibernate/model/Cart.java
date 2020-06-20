package com.sample.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_quantity")
    private Integer itemQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemQuantity='" + itemQuantity + '\'' +
                '}';
    }
}
