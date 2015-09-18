//Jacob Schultz
//Lab04 - Card Generator
//Random generates cards using Math.random and switch statements

import java.lang.Math; //imports Math methods
public class CardGenerator //main class
{
    public static void main(String[] args) //main method
    {
        //initializing variables used throughout
        int generator = (int)(Math.random()*(52))+1;
        String suit =" "; 
        String card =" ";
        
        //series of if statements to determine suit based off random number
        if(generator<14) //condition sets the range
        {
            suit = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit = "Spades";
            generator = generator-39;
        }
        //series of if statements end
        
        //switch statements to determine card value
        switch (generator) 
        {
            case 1: //first value of generator 
                card = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card ="2";
                break;
            case 3:
                card ="3";
                break;
            case 4:
                card ="4";
                break;
            case 5:
                card ="5";
                break;
            case 6:
                card ="6";
                break;
            case 7:
                card ="7";
                break;
            case 8:
                card ="8";
                break;
            case 9:
                card ="9";
                break;
            case 10:
                card ="10";
                break;
            case 11:
                card ="Jack";
                break;
            case 12:
                card ="Queen";
                break;
            case 13: //last case
                card ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        }
        //end of switch statements
        
        System.out.println("You have the "+card +" of "+suit); //prints out the card value and suit
    }//end of main method
}//end of main class