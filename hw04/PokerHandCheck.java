//Jacob Schultz
//Poker Hand Check
//Selects 5 random cards, each from a different deck
//Returns whether the hand is a pair, two pair, three of a kind, or a high card hand


public class PokerHandCheck{ //main class
    
    public static void main(String[] args){ // main method
        
        //Initializing all variables that will be used throughout program
        int generator = (int)(Math.random()*(52))+1;
        String suit1 =" ";
        String suit2 =" ";
        String suit3 =" ";
        String suit4 =" ";
        String suit5 =" ";
        
        String card1 = " ";
        String card2 = " ";
        String card3 = " ";
        String card4 = " ";
        String card5 = " ";
        
        //First iteration of cards and suit
        
        //series of if statements to determine suit based off random number
        if(generator<14) //condition sets the range
        {
            suit1 = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit1 = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit1 = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit1 = "Spades";
            generator = generator-39;
        }
        //end of suit's first iteration
        
        //start of card value first iteration
        switch (generator) 
        {
            case 1: //first value of generator 
                card1 = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card1 ="2";
                break;
            case 3:
                card1 ="3";
                break;
            case 4:
                card1 ="4";
                break;
            case 5:
                card1 ="5";
                break;
            case 6:
                card1 ="6";
                break;
            case 7:
                card1 ="7";
                break;
            case 8:
                card1 ="8";
                break;
            case 9:
                card1 ="9";
                break;
            case 10:
                card1 ="10";
                break;
            case 11:
                card1 ="Jack";
                break;
            case 12:
                card1 ="Queen";
                break;
            case 13: //last case
                card1 ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        }
        //end of first iteration of card value*********************************************************************************
 
        //start of 2nd iteration of suits and card value    
 generator = (int)(Math.random()*(52))+1; //used each time to choose new card
 
 if(generator<14) //condition sets the range
        {
            suit2 = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit2 = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit2 = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit2 = "Spades";
            generator = generator-39;
        }
        //series of if statements end
        
        //switch statements to determine card value
        switch (generator) 
        {
            case 1: //first value of generator 
                card2 = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card2 ="2";
                break;
            case 3:
                card2 ="3";
                break;
            case 4:
                card2 ="4";
                break;
            case 5:
                card2 ="5";
                break;
            case 6:
                card2 ="6";
                break;
            case 7:
                card2 ="7";
                break;
            case 8:
                card2 ="8";
                break;
            case 9:
                card2 ="9";
                break;
            case 10:
                card2 ="10";
                break;
            case 11:
                card2 ="Jack";
                break;
            case 12:
                card2 ="Queen";
                break;
            case 13: //last case
                card2 ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        } //end of second iteration*********************************************************************************
        
        //start of third iteration
generator = (int)(Math.random()*(52))+1;
 
 if(generator<14) //condition sets the range
        {
            suit3 = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit3 = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit3 = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit3 = "Spades";
            generator = generator-39;
        }
        //series of if statements end
        
        //switch statements to determine card value
        switch (generator) 
        {
            case 1: //first value of generator 
                card3 = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card3 ="2";
                break;
            case 3:
                card3 ="3";
                break;
            case 4:
                card3 ="4";
                break;
            case 5:
                card3 ="5";
                break;
            case 6:
                card3 ="6";
                break;
            case 7:
                card3 ="7";
                break;
            case 8:
                card3 ="8";
                break;
            case 9:
                card3 ="9";
                break;
            case 10:
                card3 ="10";
                break;
            case 11:
                card3 ="Jack";
                break;
            case 12:
                card3 ="Queen";
                break;
            case 13: //last case
                card3 ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        }// end of third iteration*****************************************************************************************
        
        //start of fourth iteration
generator = (int)(Math.random()*(52))+1 ;
 
 if(generator<14) //condition sets the range
        {
            suit4 = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit4 = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit4 = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit4 = "Spades";
            generator = generator-39;
        }
        //series of if statements end
        
        //switch statements to determine card value
        switch (generator) 
        {
            case 1: //first value of generator 
                card4 = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card4 ="2";
                break;
            case 3:
                card4 ="3";
                break;
            case 4:
                card4 ="4";
                break;
            case 5:
                card4 ="5";
                break;
            case 6:
                card4 ="6";
                break;
            case 7:
                card4 ="7";
                break;
            case 8:
                card4 ="8";
                break;
            case 9:
                card4 ="9";
                break;
            case 10:
                card4 ="10";
                break;
            case 11:
                card4 ="Jack";
                break;
            case 12:
                card4 ="Queen";
                break;
            case 13: //last case
                card4 ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        }//end of fourth iteration****************************************************************************************
        
        //start of fifth iteration
 generator = (int)(Math.random()*(52))+1;
 
 if(generator<14) //condition sets the range
        {
            suit5 = "Diamonds"; //assign the String value to suit
        }
        else if(generator>13 && generator<27)
        {
            suit5 = "Clubs";
            generator = generator-13; //used to keep the range 1-13 for the switch statements
        }
        else if(generator>26 && generator<40)
        {
            suit5 = "Hearts";
            generator = generator-26;
        }
        else
        {
            suit5 = "Spades";
            generator = generator-39;
        }
        //series of if statements end
        
        //switch statements to determine card value
        switch (generator) 
        {
            case 1: //first value of generator 
                card5 = "Ace"; //assigned string value
                break; //ends case
            case 2:
                card5 ="2";
                break;
            case 3:
                card5 ="3";
                break;
            case 4:
                card5 ="4";
                break;
            case 5:
                card5 ="5";
                break;
            case 6:
                card5 ="6";
                break;
            case 7:
                card5 ="7";
                break;
            case 8:
                card5 ="8";
                break;
            case 9:
                card5 ="9";
                break;
            case 10:
                card5 ="10";
                break;
            case 11:
                card5 ="Jack";
                break;
            case 12:
                card5 ="Queen";
                break;
            case 13: //last case
                card5 ="King";
                break;
            default: //used to catch any mistakes
                System.out.println("Invalid entry");
                break;
                
        }//end of fifth iteration******************************************************************************************
 
    //prints out the five card's suits and values
    System.out.println(card1 +" of "+ suit1 +"\n"+card2 +" of "+ suit2 +"\n"+card3 +" of "+ suit3 +"\n"+card4 +" of "+ suit4 +"\n"+card5 +" of "+ suit5);


        //series of if statements used to calculate pair, two pair, three of a kind, or high card 
        if(card1.equals(card2)) //first if statements checks for pair
        {
            if(card1.equals(card3) || card1.equals(card4) || card1.equals(card5)) //second if statement checks for three of a kind
            {
                System.out.println("You have three of a kind!");
            }
            else if(card3.equals(card4) || card3.equals(card5) || card4.equals(card5)) //third checks for two pair
            {
                System.out.println("You have two pair!");
            }
            else //defaults to pair if neither three of kind or two pair
            {
                System.out.println("You have a pair!");
            }
        }
        
            //repeats checking each possible pair, three of a kind, or two pair hand
            
        else if(card1.equals(card3)) //pair check
        {
            if(card1.equals(card4) || card1.equals(card5)) //three of kind check
            {
                System.out.println("You have three of a kind!");
            }
            else if (card2.equals(card4) || card2.equals(card5) || card4.equals(card5)) //two pair check
            {
                System.out.println("You have two pair!");
            }
            else //default to pair
            {
                System.out.println("You have a pair!"); 
            }
        }
        else if(card1.equals(card4)) //pair check
        {
            if(card1.equals(card5)) //three of a kind check
            {
                System.out.println("You have three of a kind!");
            }
            else if (card2.equals(card3) || card2.equals(card5) || card3.equals(card5)) // two pair check
            {
                System.out.println("You have two pair!");
            }
            else //default to pair
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
            if(card3.equals(card5))
            {
                System.out.println("You have a three of a kind!");
            }
            else if(card1.equals(card2) || card1.equals(card5) || card2.equals(card5))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card3.equals(card5)) //last check on card3
        {
            if(card1.equals(card2) || card1.equals(card4) || card2.equals(card4))
            {
                System.out.println("You ahve two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else if(card4.equals(card5)) //last check
        {
            if(card1.equals(card2) || card1.equals(card4) || card2.equals(card4))
            {
                System.out.println("You have two pair!");
            }
            else
            {
                System.out.println("You have a pair!");
            }
        }
        else
        {
            System.out.println("You have a high card!");
        }
        
    } //end of main method
} //end of main class