/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class LoopsBasics {
    
    public double FTtoCM(double num){
        num = num * 12;
        num = num * 2.54;
        return num;
    }
    //Task 1
    //get the factorials of n positive integers 1,2,…,1000
    public Long getFactorial(Long n){
        for(int i = 1; i <= n; i++){
            n *=i;
        }
 
        System.out.println(n);

        return n;
    }

    //Task 2
    //get the sum of the series
    public double sumOfSeries(){
        double result=1;

        for(int i = 1; i <= 100; i++){
            result += 1/i;
        }
        
        
        
        return result;

    }

    //Task 3
    //gets the sum of a square of odd numbers between 22 and 389
    public int sumOfOddSquares(){
        int result=0;
        for(int i = 23; i <= 390; i += 2){
            result += i*i;
        }

        //your code here

        return result;

    }


}
