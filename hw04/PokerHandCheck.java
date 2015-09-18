//Jacob Schultz
//Poker Hand Check
//Selects 5 random cards, each from a different deck
//Returns whether the hand is a pair, two pair, three of a kind, or a high card hand

import java.util.Scanner;
public class PokerHandCheck{
    
    public static void main(String[] args){
        
        //Just a check
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 possible cards in a poker hand. First the digit or the face of the card, followed by the suit.");
        
        String card1 = myScanner.nextLine();
        String suit1 = myScanner.nextLine();
        System.out.println("Thank you, please enter the next card.");
        String card2 = myScanner.nextLine();
        String suit2 = myScanner.nextLine();
        
        System.out.println(card1 +" of "+suit1+" and the "+card2+" of "+suit2);
        //Please delete after 
        
        if(card1.equals(card2))
        {
            if(card1.equals(card3) || card1.equals(card4) || card1.equals(card5)))
            {
                System.out.println("You have three of a kind!");
            }
            else if(card3.equals(card4) || card3.equals(card5) || card4.equals(card5))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
            
        else if(card1.equals(card3))
        {
            if(card1.equals(card4) || card1.equals(card5))
            {
                System.out.println("You have three of a kind!");
            }
            else if (card2.equals(card4) || card2.equals(card5) || card4.equals(card5))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card1.equals(card4))
        {
            if(card1.equals(card5))
            {
                System.out.println("You have three of a kind!");
            }
            else if (card2.equals(card3) || card2.equals(card5) || card3.equals(card5))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card1.equals(card5)) // last check on card 1
        {
            if(card2.equals(card3) || card2.equals(card4) || card3.equals(card4))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card2.equals(card3)) // first check on card 2
        {
            if(card2.equals(card4) || card2.equals(card5))
            {
                System.out.println("You have three of a kind!");
            }
            else if(card1.equals(card4) || card1.equals(card5) || card4.equals(card5))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card2.equals(card4))
        {
            if(card2.equals(card5))
            {
                System.out.println("You have three of a kind!");
            }
            else if(card1.equals(card4) || card1.equals(card3) || card3.equals(card4))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card2.equals(card5)) //last check on card 2
        {
            if(card1.equals(card3) || card1.equals(card4) || card3.equals(card4))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card3.equals(card4)) //first check on card3
        {
            
        }
            System.out.println("You have a high card!");
        
        
    }
}