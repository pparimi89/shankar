package com.sample.springcore.di.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCartAOP {

    public List<Integer> items = new ArrayList<Integer>();

    public void addGiftCardItem(int itemId){
        items.add(itemId);
    }

    public void addMerechandiseItem(int itemId){
        items.add(itemId);
    }

    @LogExecutionTime
    public void addCustomCartItem(int itemId){
        items.add(itemId);
    }

    public void removeCart(int itemId){
        items.remove(itemId);
    }

    @LogExecutionTime
    public void clearCart(){
        items.clear();
    }

    public List<Integer> showAllItems(){
        return items;
    }

    public List<Integer> showAllItemsTEST(){
        items.add(4);
        items.add(5);
        return items;
    }

    public void unrelatedScenario(){
        throw new IllegalArgumentException("Error from unrelatedScenario");
    }




}
