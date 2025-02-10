/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */
public class Animal {
    private float mass;
    private String species;
    private int legs;
    private boolean isAlive;
    private static int counter = 0;
    private static int animals_alive;
    
    public Animal(){
        counter++;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    public String getSpecies() {
        return species;
    }

    public int getLegs() {
        return legs;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Animal.counter = counter;
    }
    

    public boolean isIsAlive() {
        return isAlive;
    }
    
    public Animal(String name){
        counter++;
        animals_alive++;
        
        this.species = name;
        this.isAlive = true;
        
        this.mass = 0;
        this.legs = 0;
    }
    public Animal(float weight, String name, int num_legs){
        this.isAlive = true;
        counter++;
        animals_alive++;
        this.mass = weight;
        this.species = name;
        this.legs = num_legs;
        
    }
    
    public void print(){
        String message;
        if(isAlive){
            message = "Alive";
        }else{
            message = "Dead";
        }
        System.out.println("animal(name = " + this.species + ", mass = " + mass +
                "legs = " + this.legs + "status=" + message);
        
    }

    public int getAnimalPopulation() {
        return counter;
    }

    public int getAnimalsAlive() {
        return animals_alive;
    }
    
    public Animal reproduce(){
        
        return new Animal(mass/2, species, legs);
    }
    
    public void die(){
        this.isAlive = false;
        animals_alive--;
        
    }
    
    
    
    
    

        

}
