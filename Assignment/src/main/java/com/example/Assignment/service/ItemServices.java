
package com.example.Assignment.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Assignment.entity.Items;

// Service Class: ItemServices
@Service
public class ItemServices 
{
    // In-memory list to store items
    private static List<Items> list = new ArrayList<>();
    
    // Static initialization block to add a sample item to the list
    static
    {
        list.add(new Items(1, "T-Shirt", "Polo t-shirt size is M", 399));
        list.add(new Items(1, "T-Shirt", "Polo t-shirt size is M", 399));
        list.add(new Items(2, "Jeans", "Blue denim jeans", 599));
        list.add(new Items(3, "Hoodie", "Black hoodie size is L", 499));
        list.add(new Items(4, "Suit", "Black formal suit", 1499));
        list.add(new Items(5, "Shirt", "Formal shirt size is L", 799));
        list.add(new Items(6, "Trousers", "Black formal trousers", 699));
        list.add(new Items(7, "Jacket", "Leather jacket size is XL", 999));
        list.add(new Items(8, "Sweater", "Gray woolen sweater", 499));
        list.add(new Items(9, "Polo Shirt", "Blue polo shirt size is M", 349));
        list.add(new Items(10, "Suit", "Black formal suit", 1499));
    }
    
    // Get all items
    public List<Items> getAllitems()
    {
        return list;
    }
    
    // Get an item by its unique ID
    public Items getItemById(int id)
    {
        Items item = null;
        
     // Find an item in the list by its unique ID using Java Stream API
        item = list.stream().filter(i -> i.getId() == id).findFirst().get();  //Stream items and filter by matching ID finds the first matching item Get the found item or throw an exception if not found
        return item;
    }
    
    // Add an item to the list
    public Items addItems(Items i)
    {
        list.add(i);
        return i;
    }
}

