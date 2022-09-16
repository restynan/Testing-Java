package com.in28minutes.unitTesting.repository;

import com.in28minutes.unitTesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {

}
