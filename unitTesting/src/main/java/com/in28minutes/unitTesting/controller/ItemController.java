package com.in28minutes.unitTesting.controller;

import com.in28minutes.unitTesting.model.Item;
import com.in28minutes.unitTesting.service.Impl.ItemServiceImpl;
import com.in28minutes.unitTesting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public  Item getItem2(){
       return  itemService.retrieveItems();
    }

    @GetMapping("/allItems")
    public List<Item> getAllItems(){
        return itemService.retrieveAllItems();
    }













    @GetMapping("/item")
    public Item getItem(){
        return new Item(1,"car",2,500);
    }
}
