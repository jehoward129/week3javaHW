/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jehow
 */
public class TestZoo {
    public static void main(String[] args){
        Zoo myZoo = new Zoo();
        
        Animal snail = new Animal(3, "snail", 1);
        Animal elephant = new Animal(5000, "elephant", 4);
        
        myZoo.addAnimal(snail);
        myZoo.addAnimal(elephant);
        boolean add=true;
        while(add){
          add= myZoo.addAnimal(snail);
        }
        
        System.out.println(myZoo.numberOfAnimals());
        
        System.out.println(myZoo.totalMass());
    
    }
}
