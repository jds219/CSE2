/* Jacob Schultz
hw10 - Shuffling

*/
import java.util.Scanner;
public class Shuffling
{
    
public static void printArray(String [] list)
{
    for (int i=0; i<list.length; i++)
    {
    System.out.print(list[i]+" ");
    }
}

public static String[] shuffle(String [] list)
{
    for(int i = 0; i < (int)(Math.random() * 100) + 100; i++)
    {
        String swap = list[0];
        int card = (int)(Math.random() * 52);
        list[0] = list[card];
        list[card] = swap;
    }
    return list;
}

public static String[] randomizeHand(String [] list)
{
    String[] hand = new String[5];
    for (int i = 0; i < 5; i++)
    {
        int random = (int)(Math.random() * 52);
        hand[i] = list[random];
        for(int j = 0; j < i; j++)
        {
            while(hand[j] == hand [i])
            {
                hand[j] = list[(int)(Math.random() * 52)];
                System.out.println("DUPLICATE");
            }
        }
    }
    return hand;
}

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  System.out.print(cards[i]+" ");
}
printArray(cards);
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand); 
  }
}