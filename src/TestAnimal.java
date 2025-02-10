/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class TestAnimal {
    public static void main(String[] args){
        Animal snail = new Animal(3.5, "snail", 1);
        snail.print();
        snail.getAnimalPopulation();
        
        Animal fish = new Animal ("fish");
        fish.print();
        snail.getAnimalPopulation();
        fish.setMass(4.2);
        
        Animal dog = new Animal(15, "dog", 4);
        dog.print();
        
        Animal babyAnimal1 = new Animal();
        Animal babyAnimal2 = new Animal();
        babyAnimal1 = fish.reproduce();
        babyAnimal2 = dog.reproduce();
        
        snail.die();
        snail.print();
        
        //babyAnimal1.counter = 500;
        
        dog.getAnimalPopulation();
        dog.getAnimalsAlive();
        
        Animal.setCounter(15);
        
        dog.die(); 
        
        dog.getAnimalPopulation();
        dog.getAnimalsAlive();
        
        
        
        
    }
}
