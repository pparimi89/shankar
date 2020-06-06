package com.sample.springcore.di.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceNamedParams {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Cart> getCartItems(){
        RowMapper<Cart> cartRowMapper = BeanPropertyRowMapper.newInstance(Cart.class);
        String query = "select * from cart";
        return namedParameterJdbcTemplate.query(query, cartRowMapper);
    }

    public void addCart(Integer id, String itemName, Integer itemQuantity){
        String query = "insert into cart values(:id, :itemName, :itemQuantity)";
        final Map<String, Object> params = new HashMap<>();
        params.put("itemName", itemName);
        params.put("itemQuantity", itemQuantity);
        params.put("id", id);
        namedParameterJdbcTemplate.update(query, params);
    }

    public void deleteCart(Integer id){
        String query = "delete from cart where id = :id";
        final Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        namedParameterJdbcTemplate.update(query, params);
    }

    public void updateCart(Integer itemQuantity, Integer id){
        String query = "update cart set item_quantity = :itemQuantity where id = :id";
        final Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        params.put("itemQuantity", itemQuantity);
        namedParameterJdbcTemplate.update(query, params);
    }

}
