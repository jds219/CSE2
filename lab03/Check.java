//Jacob Schultz
//lab03 - Check
//Using user inputted values for the check, calculates what tip should be paid and how they should split the check

import java.util.Scanner; //imports the Scanner program

public class Check{ //class required for every Java program
    public static void main(String[] args) { // main method required for every Java program
   	    Scanner myScanner = new Scanner( System.in ); //creates new Scanner called myScanner
   		System.out.print("Enter the original cost of the check in the form xx.xx: ");
   		//prompts the user to input a value for the check
        double checkCost = myScanner.nextDouble(); //stores the check value as a double
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //prompts the user to input a value for the tip percentage
        double tipPercent = myScanner.nextDouble(); //stores the tip percentage value as a double
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //prompts the user to input the number of people
        int numPeople = myScanner.nextInt(); //stores the number of people as an integer
                    
        double totalCost; //creates variable totalCost
        double costPerPerson; //creates variable costPerPerson
        int dollars,   //whole dollar amount of cost 
            dimes, pennies; //for storing digits
            //to the right of the decimal point 
            //for the cost$ 
        totalCost = checkCost * (1 + tipPercent); //calculates the total cost of the check plus tip
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10; //calculates the tenths place in the check
        pennies=(int)(costPerPerson * 100) % 10; //calculates the hundredths place in the check
        System.out.println("Each person in the group owes $" + dollars +"."+ dimes + pennies); 
        //returns the total that each individual owes for the check

   	    }  //end of main method  
} //end of class
