/* Jacob Schultz
Lab 06 - Getting Loopy
Part 1 prints out a sequence from 1-7, and multiple sevens
Part 2 checks for prime numbers 10-100 using various loop types
Part 3 prints out a random number of smiley faces 
*/
import java.lang.Math; //imports Math.random

public class GettingLoopy //main class
{
    public static void main(String[] args) //main method
    {
        //variables used in Step 1
        System.out.println("Step 1: ");
        int sequence = 1;
        int sevens = 0;
        
        while (sequence < 8) //repeats until sequence = 8
        {
            System.out.print(sequence); //prints sequence value
            sequence++; //raises the value of sequence
        }
        while(sevens<5) //repeats until there are 5 sevens
        {
            System.out.print(7); //prints out 7s
            sevens++; //raises the values of sevens
        }
        //end of part 1
        
        //variables used in the While loop of Step 2
        System.out.print("\nStep 2: \nWhile Loop: ");
        int prime = 10;
        boolean isPrime;
        
        while (prime <= 100) //repeats until prime is greater than 100
        {
            
            isPrime = true; //sets isPrime to true
            int i = 2; //int i is used to check all numbers from 10 to prime for a factor
            
            while(i<prime) //repeats until i is equal to prime
            {
                if(prime % i != 0) //checks to see if i is a factor of prime
                {
                    i++; 
                }
                else //if i is a factor
                {
                    isPrime = false; //this becomes false
                    break;
                }
            }
            
            if(isPrime == true) //prints out prime numbers
            {
                System.out.print(prime+" ");
            }
            prime++; 
        }
        //end of while loop
        
        //start of For loop
        System.out.print("\nFor Loop: ");
        for(int x = 10; x<=100; x++) //variable x defines possible prime numbers
        {
            isPrime = true;
            for(int y = 2; y<x; y++) //variable y is used to see if any values of x are prime numbers
            {
                if(x%y == 0) //non prime numbers break for loop
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) //prints out all prime numbers
            {
                System.out.print(x+ " ");
            }
         
        }
        //end of for loop
        
        //start of do-while loop
        System.out.print("\nDo-While Loop: ");
        int doPrime = 10; //place holder for prime numbers
        do{
            isPrime = true;
            int n = 2; //number used to check for prime numbers
            do{
                if(doPrime%n == 0) //checks if doPrime is not a prime number
                {
                    isPrime = false;
                    break;
                }
                n++;
            }while(n<doPrime); //loops until n equals doPrime
            
            if(isPrime == true) //prints out all prime numbers
            {
                System.out.print(doPrime+ " ");
            }
            doPrime++;
        }while(doPrime<=100); //repeats until doPrime is greater than 100
        //end of part 2
        
        //start of part 3
        System.out.println("\nStep 3: ");
        int random = (int)(Math.random()*(200))+5; //creates random number of smiley to be printed
        int lines = 0; //used to seperate rows of 20 smileys
        String smiley = ":)"; //its the smiley! :D
        
        while(lines<random) //repeats until lines is equal to random
        {
            System.out.print(smiley+" "); //prints out a smiley
            lines++;
            if(lines==20) //checks to see if there are 20 smileys in a line
            {
                System.out.println(" "); //starts new line
                
                //used to keep if statement working as intended, while distance between lines and random is the same
                lines = lines - 20; 
                random = random - 20;
            }
        }
        
    }//end of main method
}//end main class