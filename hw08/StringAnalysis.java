/* Jacob Schultz
hw08- String Analysis
Checks a user-inputted string to see if all characters are letters, 
or if a specified number of characters are letters
*/
import java.util.Scanner;

public class StringAnalysis
{
    //method used to check all letters in a string
    public static boolean StringCheck(String s1)
    {
        for(int i = 0; i < s1.length(); i++) //loop that cycles through letters in string
        {
        char c1 = s1.charAt(i); //gets character at position i
            if (!Character.isLetter(c1)) //whenever there is a character that isnt a letter...
            {
                return false; //...returns false
            }
        
        }
        return true; //if all characters are letters, returns true
    }

    //same method, but only checks a certain number of characters in a string
    public static boolean StringCheck(String s1, int length)
    {
        if(s1.length() < length) //if the inputted length is larger than the length of the string...
        {
            length = s1.length(); //...sets them to the same length
        }
        for(int i = 0; i < length; i++) //loop that cycles through letters in string, until it hits the inputted length to check
        {
        char c1 = s1.charAt(i); //gets character at position i
            if (!Character.isLetter(c1)) //whenever there is a characer that isnt a letter...
            {
                return false; //..returns false
            }
        
        }
       return true; //otherwise, returns true
    }
    
    //main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String s1 = input.nextLine(); //sets given input to string value
        
        //asks the user if they want to check entire string (and enter 0), or only a part of the string (and enter what number they want)
        System.out.println(" \nWould you like to check the entire string for letters, or just a certain number of characters? \nEnter 0 for entire string, or enter the specific number.");
        int check = 0; //variable used to check whether user wants entire string or a part
        boolean acceptable = false; //boolean used to make sure entry is an integer
        while( !acceptable ) //loop used to check that input is an integer
        {
        //check if the input is an integer
        if (input.hasNextInt() )
        {
            //if so, store it.
            check = input.nextInt();
            acceptable = true;
        }
        else
        {
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
            System.out.println("ERROR: Please enter a numerical value. ");
            input.next();
        }
        }
        
        if(check == 0) //if the user inputs a 0...
        {
            System.out.println(StringCheck(s1)); //...runs the first method, checks entire string
        }
        else //if the user inputs any other value...
        {
            System.out.println(StringCheck(s1,check)); //...runs the second method, checks a part of the string
        }
    } //end of main method
} //end of main class
