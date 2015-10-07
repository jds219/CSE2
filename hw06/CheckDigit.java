/* Jacob Schultz
hw06 part 2 - check digit
prompts the user to enter a 10-digit ISBN code, checks to see if it is valid.
there were a lot more bugs than I anticipated, but I think I got them all! :)
*/ 

import java.util.Scanner; //imports the scanner
public class CheckDigit //main class
{
    public static void main(String[] args) //main method

    {
        System.out.println("Please enter a 10-digit ISBN."); //prompts the user to enter a 10-digit ISBN code
        Scanner input = new Scanner(System.in); //creates the scanner
        
        //some different variables used throughout
        boolean hasX = false; 
        String sx = " ";
        String sx2 =" ";
        double isbn = 0.0;
        
        while(!input.hasNextInt()) //checks to see if the scanner value is a string. 
            {
                sx = input.nextLine(); //makes the user inputted entry a string
                if(sx.indexOf('x')==9 || sx.indexOf('X')==9) //checks to see if the last character is an X. 
                {
                    sx2 = sx.substring(0, sx.length() - 1); //creates a substring without the X
                    isbn = Integer.parseInt(sx2); //converts string without X to integer, stores as isbn
                    hasX = true; //lets program know that there is an X
                    break; //breaks out of while loop
                    
                }
                System.out.println("Please enter a number."); //asks to give a correct 10-digit ISBN code
            }
        if(hasX == false) //if the entry is an integer...
        {
            isbn = input.nextDouble(); //...stores that integer as variable isbn 
        }
        int firstDigit = (int)((isbn)/(Math.pow(10, 9))); //gets the first digit of the ISBN
        String s1 = String.valueOf((int)isbn); //converts the ISBN to a string...
        int length = s1.length(); //...so the length can be found
        if(firstDigit == 0 && hasX == false) //checks to see if the first digit is a 0 to adjust length accordingly
        {
            length++; 
        }
        else if(firstDigit == 0 && hasX == true) //if the first digit is a 0, and the last digit is X...
        {
            isbn *=10; //...the ISBN is moved over one digit...
            length += 2; //...and the length is adjusted accordingly
        }
        while(length != 10) //checks to see if the code is not the correct length
        {
            System.out.println("Incorrect number of digits. Please enter a 10 digit number."); //lets the user know they made a mistake 
            while(length != 10) //used to prevent double printing of the line above
            {
                while(!input.hasNextInt()) //checks to see if the scanner value is a string. 
                {
                    System.out.println("Please enter a number."); //lets user know they messed up

                    sx = input.nextLine(); //makes the user inputted entry a string
                    if(sx.indexOf('x')==9 || sx.indexOf('X')==9) //checks to see if the last character is an X. 
                    {
                        sx2 = sx.substring(0, sx.length() - 1); //creates a substring without the X
                        isbn = Integer.parseInt(sx2); //converts string without X to integer, stores as isbn
                        hasX = true; //lets program know that there is an X
                        break; //breaks out of while loop
                    }
                }

                System.out.println("Incorrect number of digits. Please enter a 10 digit number."); //lets user know they made a mistake
                if(hasX == false) //if the entry is an integer...
                {
                    isbn = input.nextDouble(); //...stores that integer as variable isbn 
                }
                firstDigit = (int)((isbn)/(Math.pow(10, 9))); //gets the first digit of the ISBN
                s1 = String.valueOf((int)isbn); //converts the ISBN to a string...
                length = s1.length(); //...so the length can be found
                if(firstDigit == 0 && hasX == false) //checks to see if the first digit is a 0 to adjust length accordingly
                {
                    length++; 
                }
                else if(firstDigit == 0 && hasX == true) //if the first digit is a 0, and the last digit is X...
                {
                    isbn *=10; //...the ISBN is moved over one digit...
                    length += 2; //...and the length is adjusted accordingly
                }
            }
        }
        
        double sum = 0; //stores the sum of the ISBN digits
        for(int i=1; i<10;i++) //loop used to figure out the sum of ISBN
        {
            if(i==9) //when reaching the final digit, special accomendations are necessary
            {
                int power9 = (int)Math.pow(10,5); //you cannot divide by 10^10 directly...
                double digit9 = isbn / power9 /power9; //...so you must use a roundabout way
                sum+=((int)((digit9 - (int)(digit9))*10))*(i+1); //see below for how this operates
                break; //end for loop
            }
            int power = (int)Math.pow(10, i+1); //sets the power used to get specific digit
            double digit = isbn / power; //puts the desired digit in the tenths place
            sum += ((int)((digit - (int)(digit))*10))*(i+1); //takes desired digit, multiplies it by respective place in number, adds to sum
            
        }//end of for loop
        
        int check = (int)(sum) % 11; //find the 'check digit'
        double ldCheck = isbn / 10; //used to help find the last digit
        int lastDigit = (int)((ldCheck - (int)(ldCheck)*10)); //finds the 'check digit'
        
        if(check == 10 && hasX == true) //checks to see if 'check digit' and check are X and 10 respectively
        {
            System.out.println("This is a valid ISBN."); //returns a valid ISBN
        }

        else if(check == lastDigit ) //checks to see if the lastDigit and check are equal
        {
            System.out.println("This is a valid ISBN."); //returns a valid ISBN
        }
        else if (check == 10) //if the check is 10, but the 'check digit' is X...
        {
            System.out.println("Sorry, this is invalid. Check Digit should be: X."); //...lets the user know it should be 10
        }
        else //check and last digit are NOT equal
        {
            System.out.println("Sorry, this is invalid. Check Digit should be: "+check); //lets the user know what the check digit should be
        }
    }//end of method
}//end of class