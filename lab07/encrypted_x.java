/* Jacob Schultz
lab07-encrypted X
Prints a hidden X between *'s, with a size based on user input
*/
import java.util.Scanner;
public class encrypted_x
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the hidden X message.");
        //an integer to store the user input
        int size = 0;

        //a switch to decide if you want to ask again
        boolean acceptable = false;

        //loop until you get acceptable input (i.e. if it's a double)
        while( !acceptable ){
        //check if the input is a double.
        if (input.hasNextInt() )
        {
            //if so, store it.
            size = input.nextInt();
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
        
        
        for(int i=0;i<=size;i++) //outer loop creates rows
        {
            for(int j=0;j<=size;j++) //inner creates columns
            {
                if(j==i || j== size-i) //prints a space corresponding to row and column position
                {
                System.out.print(" ");
                }
                else //everywhere else gets a star
                {
                    System.out.print("*");
                }
            }
        System.out.println(); //starts next row
        } //ultimately, this for loop creates the hidden X pattern
    } //end of main method
}//end of main class