//Jacob Schultz
//hw03 - Timer
//calculates time until dinner using user input and military time

import java.util.Scanner; //imports the Scanner inputting program

public class Timer{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //creates the scanner the user will use to input values
        System.out.println("Please enter the current time, using the 24-hr clock: "); //Prompts the user for the current time
        int currentTime = myScanner.nextInt(); //stores the current time as an int value
        System.out.println("Thank you. Now please enter the time dinner begins: "); //prompts the user for the dinner time
        int dinnerTime = myScanner.nextInt(); //stores the dinner time as an int value
        
        int currentHrs = currentTime/100; //stores the current time's hours
        int dinnerHrs = dinnerTime/100; //stores the dinner time's hours
        int currentMins = currentTime%100; //stores the current time's minutes
        int dinnerMins = dinnerTime%100; //stores the dinner time's minutes
        
        int totalHrs = dinnerHrs - currentHrs; //finds the total hours until dinner
        int totalMins = dinnerMins - currentMins; //finds the total minutes until dinner
        
        if(totalMins < 0){
            totalMins = totalMins + 60; 
            totalHrs = totalHrs - 1;
            //adjusts the total time when the current minutes are greater than the dinner minutes
        }
        
        System.out.println("Total time until dinner is "+totalHrs+" hours and "+totalMins+" minutes."); // prints out the time until dinner
        
        
    }
}
