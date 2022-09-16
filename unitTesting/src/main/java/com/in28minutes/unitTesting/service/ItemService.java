package com.in28minutes.unitTesting.service;

import com.in28minutes.unitTesting.model.Item;

import java.util.List;

public interface ItemService {
    Item retrieveItems();
    List<Item> retrieveAllItems();
}
