/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Name : (Your name here)
 *  Course: CSCI 218 - Programming II
 *
 *
 * Todo:
 * declare 4 house objects using 4 different constructors and output description of the 4 houses.
 *
 * Test your accessor methods.
 *
 * Calculate the estimated price of houses given type and age (include 1 attached and 1 detached)
 *
 * Test out all 5 mutator methods to modify the attributes of different House objects.
 *
 * Test methods toString(), equals() , isLessThan() and isGreaterThan() for different House objects.
 */
public class HouseDriver {

    public static void main(String[] args) {
        House home1 = new House();
        House home2 = new House(100000);
        House home3 = new House(40, 100000);
        House home4 = new House(50, 150000, "Attatched");
        home4.getAge();
        home1.getCost();
        home3.getState();
        
        home1.estimatePrice("Attatched", 40);
        
        home3.setAge(5);
        home3.setState("Semidetatched");
        home3.setCost(240000.0);
        home3.setCostAge(6, 245000);
        home3.setAll(14, 260000.0, "Semidetatched");
        
        home3.toString();
        home1.equals(home2);
        home1.equals(home4);
        
        home4.isLessThan(home3);
        home1.isGreaterThan(home3);
        
        
        
    }
}
