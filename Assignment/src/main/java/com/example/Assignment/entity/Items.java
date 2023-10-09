package com.example.Assignment.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


// Entity Class: Items
public class Items 
{
    // Field: Identifier
    @NotNull(message = "ID must be provided")
    private int id;

    // Field: Item Name
    @NotBlank(message = "Name must not be blank")
    private String Name;

    // Field: Item Description
    @NotBlank(message = "Description must not be blank")
    private String Desc;

    // Field: Item Price
    @NotNull(message = "Price must be provided")
    private int Price;
    
    
    // Getter for ID
    public int getId() {
        return id;
    }
    
    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter for Name
    public String getName() {
        return Name;
    }
    
    // Setter for Name
    public void setName(String name) {
        Name = name;
    }
    
    // Getter for Description
    public String getDesc() {
        return Desc;
    }
    
    // Setter for Description
    public void setDesc(String desc) {
        Desc = desc;
    }
    
    // Getter for Price
    public int getPrice() {
        return Price;
    }
    
    // Setter for Price
    public void setPrice(int price) {
        Price = price;
    }
    
    // Constructor
    public Items(int id, String name, String desc, int price) {
        super();
        this.id = id;
        Name = name;
        Desc = desc;
        Price = price;
    }
}
