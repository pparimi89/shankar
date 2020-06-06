package com.sample.springcore.di.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CartService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Cart> getCartItems(){
        RowMapper<Cart> cartRowMapper = BeanPropertyRowMapper.newInstance(Cart.class);
        String query = "select * from cart";
        return jdbcTemplate.query(query, cartRowMapper);
    }

    public void addCart(Integer id, String itemName, Integer itemQuantity){
        String query = "insert into cart values(?, ?, ?)";
        jdbcTemplate.update(query, new Object[]{id, itemName, itemQuantity});
    }

    public void deleteCart(Integer id){
        String query = "delete from cart where id = ?";
        jdbcTemplate.update(query, new Object[]{id});
    }

    public void updateCart(Integer itemQuantity, Integer id){
        String query = "update cart set item_quantity = ? where id = ?";
        jdbcTemplate.update(query, new Object[]{itemQuantity, id});
    }

}
