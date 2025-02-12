/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jehow
 */
public class NewTestZoo {
    public static void main(String[] args){
        Zoo zoo2 = new Zoo();
        Animal elephant = new Animal("elephant");
        Animal spider = new Animal("spider");
        Animal snake = new Animal("snake");
        Animal panda1 = new Animal(2000, "panda", 4);
        Animal panda2 = new Animal(2000, "panda", 4);
        zoo2.addAnimal(elephant);
        zoo2.addAnimal(spider);
        zoo2.addAnimal(snake);
        zoo2.addAnimal(panda1);
        zoo2.addAnimal(panda2);
        zoo2.print();
        /*
        int av_mass = zoo2.totalMass()/zoo2.numberOfAnimals();
        System.out.println("The average mass of the animals" + av_mass);
        int av_legs = zoo2.totalLegs() / zoo2.numberOfAnimals();
        System.out.println("The average mass of the animals" + av_legs);
        */
        
        
        System.out.println(zoo2.numberOfAnimals());
        zoo2.makeBaby();
        System.out.println("");
        zoo2.print();
        
        
        
    }
}
