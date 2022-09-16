package com.in28minutes.unitTesting.service;

import com.in28minutes.unitTesting.model.Item;
import com.in28minutes.unitTesting.repository.ItemRepository;
import com.in28minutes.unitTesting.service.Impl.ItemServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {
    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemServiceImpl itemService;
    @Test
    public void retrieveAllItemsTest() throws IOException {
       // String jsonString = IOUtils.resourceToString("/item3.json", StandardCharsets.UTF_8);
        when(itemRepository.findAll()).thenReturn(Arrays.asList(
                new Item(1,"fridge",7,100)));
       List<Item> list= itemService.retrieveAllItems();
        assertEquals(700,list.get(0).getValue());



    }


}
