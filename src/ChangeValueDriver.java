/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test your ChangeValue Class
 */
import java.util.Scanner;

public class ChangeValueDriver{



    public static void main(String[] args) {
        //instantiate your scanner object
        Scanner input;
        input = new Scanner(System.in);
        
        //declare the local val1 and val2 integer variables
        int val1, val2;
       
        //prompt the user for input of two integers
        System.out.println("Pleae input an integr: ");
        val1 = input.nextInt();
        System.out.println("Pleae input another integr: ");
        val2 = input.nextInt();
        ChangeValue thing = new ChangeValue(val1, val2);
        
        thing.print();
                
        //instantiate a changeValue object here
        
        //call the object method printit here

    }

}
