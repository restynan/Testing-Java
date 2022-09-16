package com.in28minutes.unitTesting.service.Impl;

import com.in28minutes.unitTesting.model.Item;
import com.in28minutes.unitTesting.repository.ItemRepository;
import com.in28minutes.unitTesting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
  @Autowired
  private ItemRepository itemRepository;

  @Override
    public Item retrieveItems() {
        return new Item (1,"car",2,500);

    }

    @Override
    public List<Item> retrieveAllItems() {
        List<Item> items = itemRepository.findAll();
        for(Item item : items){
            int value = item.getPrice() * item.getQuantity();
            item.setValue(value);
        }

        return  items;
    }
}
