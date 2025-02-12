/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jehow
 */
public class Zoo {
    private Animal[] cages;
    public Zoo(){
        cages = new Animal[10];
    }
    
    public boolean addAnimal(Animal animal){
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] == null){
                cages[i] = animal;
                return true;
            }      
        }
        Animal[] cages2;
        int new_length = (int) (cages.length * 1.5);
        cages2 = new Animal[new_length];
        
        for(int i = 0; i < cages.length; i++){
            cages2[i] = cages[i];
            
        }
        
        cages = cages2;
        
        cages[cages.length - 1] = animal; 

        System.out.println("The zoo expanded");
        return true;
    }
    
    @Override
    public String toString(){
        String animals = "";
        if(cages[0] != null){
            return "empty";
        }
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] != null){
                animals += cages[i];
            }
        }
        return animals;
    }
    public void print(){
        String animals = "";
        if(cages[0] == null){
            System.out.println("empty");
        }
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] != null){
                animals += cages[i].getSpecies();
                animals += "\n";
            }
        }
        System.out.println(animals);
    }
    public boolean addAnimal(Animal animal, int loc){
        if(cages[loc] == null){
            cages[loc] = animal;
            return true;
        }else{
            System.out.println("That cage is full");
            return false;
        }
    }
    public int numberOfAnimals(){
        int fullCages = 0;
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] == null){
                 fullCages = i;
                 break;
            }      
        }
        return fullCages;
    }
    
    public int totalMass(){
        int tMass = 0;
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] == null){
                 break;
            }else{
                tMass += cages[i].getMass();
            }      
        }
        return tMass;
    }
    
    public int totalLegs(){
        int tLegs = 0;
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] == null){
                 break;
            }else{
                tLegs += cages[i].getLegs();
            }      
        }
        return tLegs;
    }
    public void removeAnimal(Animal animal){
        for(int i = 0; i < cages.length -1; i++){
            if(cages[i] == animal){
                 cages[i] = null;
            }
        }
    }
    public boolean isFull(){
        for(int i = 0; i < cages.length; i++){
            if(cages[i] == null){
                 return false;
            }
        }
        return true;

    }
    
    public void makeBaby(){
        int n = this.numberOfAnimals();
        if(cages[0] == null){
            return;
        }
        if(this.isFull()){
            return;
        }
        String animalName;
        String animalName2;
        for(int i = 0; i < n -1; i++){
            
            Animal animal = cages[i];
            animalName = animal.getSpecies();
            for(int j = i+1 ; j < n; j++){
                animalName2 = cages[j].getSpecies();
               
                if(animalName.equals(animalName2)){
                   animal = new Animal((float) (animal.getMass() * 0.10), animal.getSpecies(), animal.getLegs());
                   this.addAnimal(animal);
                   System.out.println("New baby " + animal.getSpecies());
                   
                   break;
                }
            }
        }
    }
    
}
    


