/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 * Todo:
 *
 * Private instance variables to store age of the House, its type (Detached, Semi-Attached, Attached) and its cost.
 *
 * 4 constructors: No argument (sets age to 50, type to Attached and cost to 100000), one argument constructor (sets cost to a value, age - 50 and type - Attached), two argument constructors (sets age to a value, cost to a value , and type to Attached), three argument constructors (sets age to a value, cost to a value, and type to Attached, semi-detached, or detached)
 *
 * 3 Accessor/Getter methods: - methods to return age, type and cost respectively
 *
 * 5 Mutator/Setter methods: - 3 methods for setting the three values independently, a method to set all three values and a method to set age and cost of the house.
 *
 * A public method called estimatePrice() that returns cost of a house based on type and age. An attached cost $100,000, appreciates 1% every year in first five years and 2% every year afterwards. A Semidetached cost $150,000, appreciates 2% every year in first five years and 3% every year afterwards. A detached costs $200,000, appreciates 2% every year in first five years and 2% every year afterwards.
 *
 * A toString() method that returns type of the house and its age and its cost.
 *
 * An equals() method to test for equality of two objects of class House based on type and age.
 *
 * isLessThan() and isGreaterThan() method to compare between the prices of two objects of class House.
 *
 *
 * Hints:
 *  You can generate the toString() method and equals() method body by
 */
public class House {
    private int age;
    private double cost;
    private String state;
    
    public House(){
        this.age = 50;
        this.cost = 100000;
        this.state = "Attatched";
    }
    public House(double cost){
        this.cost = cost;
        this.state = "Attatched";
        this.age = 50;
    }
    public House(int age, int cost){
        this.age = age;
        this.cost = cost;
        this.state = "Attatched";
        
    }
    public House(int age, int cost, String state){
        this.age = age;
        this.cost = cost;
        this.state = state;
        
    }


    //create your getter methods
        public int getAge() {
        return age;
    }

    public double getCost() {
        return cost;
    }

    public String getState() {
        return state;
    }

    //Create the setter methods
        public void setAge(int age) {
        this.age = age;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setState(String state) {
        this.state = state;
    }


    //create your estimatePrice method
    public void setAll(int age, double cost, String state){
        this.age = age;
        this.cost = cost;
        this.state = state;
    }
    public void setCostAge(int age, double cost){
        this.age = age;
        this.cost = cost;
    }
    public double estimatePrice(String state, int age){
        double base;
        if(state.equals("Attatched")){
            base = 100000;
        }else if(state.equals("Semidetatched")){
            base = 150000;
        }else{
            base = 200000;
        }
        if(age < 6){
            if(state.equals("Attatched")){
                base *= Math.pow(1.01, age);
            }else{
                base *= Math.pow(1.02, age);
            }
        }else{
            if(state.equals("Attatched")){
                base *= Math.pow(1.01, 5);
                int newage = age -5;
                base *= Math.pow(1.02, newage);
                
            }else if(state.equals("Semidetatched")){
                base *= Math.pow(1.02, 5);
                int newage = age - 5;
                base *= Math.pow(1.03, newage);
            }else{
                base *=Math.pow(1.02, age);
            }
        }
        return base;
 
    }

    //create the toString() method
    //to do this, right click -> generate -> toString
        @Override
    public String toString() {
        return "House{" + "age=" + age + ", cost=" + cost + ", state=" + state + '}';
    }



    //create the equals() method
    //to do this, right click -> generate -> override methods - > equals()
     @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    //create the isLessThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isLessThan(House obj){
        return this.cost < obj.getCost();
    }
    
    


    //create the isGreaterThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isGreaterThan(House obj){
        return this.cost > obj.getCost();
    }
   





}
