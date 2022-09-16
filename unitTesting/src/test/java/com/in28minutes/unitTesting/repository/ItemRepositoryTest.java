package com.in28minutes.unitTesting.repository;

import com.in28minutes.unitTesting.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;
@Test
    public void findAllTest(){
List<Item> list = itemRepository.findAll();
assertEquals(4,list.size());

    }
}
