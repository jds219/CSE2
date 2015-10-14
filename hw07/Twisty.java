/* Jacob Schultz
hw07 - Twisty!
Creates a twisty pattern of #'s and /'s, with a size based on user input
*/
import java.util.Scanner; //user input 
public class Twisty
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in); //creates scanner
        System.out.println("Please enter the length of the twisty pattern. "); //prompts user for length of pattern
       
        //integers to store the user input
        int length = 0;
        int width = 0;

        //a switch to decide if you want to ask again
        boolean acceptable = false;

        //loop until you get acceptable input (i.e. if it's an integer)
        while( !acceptable )
        {
        //check if the input is an integer
        if (input.hasNextInt() )
        {
            //if so, store it.
            length= input.nextInt();
            acceptable = true;
        }
        else
        {
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
            System.out.println("ERROR: need a Integer between 0-80");
            input.next();
        }
        }
        
        while(length>80) //loop used to prevent lengths over 80
        {
            System.out.println("Too large. Please enter a smaller length.");
            acceptable = false;
            //
            while( !acceptable )
            {
            //check if the input is an integer
            if (input.hasNextInt() )
            {
                //if so, store it.
                length= input.nextInt();
                acceptable = true;
            }
            else
            {
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("ERROR: need a Integer between 0-80");
                input.next();
            }
            }
        }
        
        //now for the width
        //same process as length, but cannot be greater than length
        System.out.println("Please enter the width of the twisty pattern. The width cannot be greater than the length.");
        acceptable = false;
        while( !acceptable ){
        //check if the input is a double.
        if (input.hasNextInt() )
        {
            //if so, store it.
            width= input.nextInt();
            acceptable = true;
        }
        else
        {
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
            System.out.println("ERROR: need an Integer less than that of the length");
            input.next();
        }
        }
        
        //in the case of a larger width value than length
        while(width>length)
        {
            System.out.println("Too large. Please enter a smaller width.");
            acceptable = false;
            while( !acceptable )
            {
            //check if the input is a double.
            if (input.hasNextInt() )
            {
                //if so, store it.
                width= input.nextInt();
                acceptable = true;
            }
            else
            {
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("ERROR: need a Integer between 0-100");
                input.next();
            }
            }
        }//end of input checks
        
        
        //series of for loops creating the twisty pattern
        for(int i=0;i<width;i++) //creates the rows of pattern
        {
            for(int j=0;j<length;j++) //creates the columns of the pattern
            {
                if(j%width==i) //creates the foward slash part of the pattern
                {
                    if((j/width)%2 == 1) //alternates between foward slash...
                    {
                        System.out.print("\\");
                    }
                    else //...and pound sign, depending on iteration of the pattern
                    {
                        System.out.print("#");
                    }
                }
                else if(j%width==width-(i+1)) //creates the backslash part of the pattern
                {
                    if((j/width)%2 == 1) //alternates between pound sign...
                    {
                        System.out.print("#");
                    }
                    else //...and backslash, depending on iteration of pattern
                    {
                        System.out.print("/");
                    }
                }
                else //creates the spaces between eachs symbol in the pattern
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); //creates a new row
        }
    }//end of main method
}//end of main class