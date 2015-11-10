/* Jacob Schultz
hw11 - CSE2Linear
Takes 15 user inputted grades, searches for specific grade, mixes up array, searches again.
*/

//necessary imports
import java.util.Scanner;
import java.lang.Math;

public class CSE2Linear //main class
{
    public static int intCheck() //method used to check that user input is an int
    {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()) //repeats whiles input is not an int
            {
                System.out.println("Please enter an int.");
                input.next();
            }
            int grade = input.nextInt();
            return grade; //returns the int
    }
    
    public static void printArray(int[] array) //method used to print array
    {
        for(int i = 0; i<array.length; i++) //loop used to print each value
        {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void mixArray(int[] array) //method used to mix up array
    {
        for(int i = 0; i < (int)(Math.random() * 100) + 100; i++) //loop used change positions of values
        {
            int swap = array[0]; //saves first value of array
            int grade = (int)(Math.random() * 15); //random array position
            array[0] = array[grade]; //swaps the first and random array value
            array[grade] = swap; 
        }
        printArray(array); //prints array
    }
    
    public static void main(String[] args) //main method
    {
        int[] grades = new int[15]; //array for grades
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 15 grades in increasing order.");
        for(int i = 0; i < 15; i++) // loop used to fill in array
        {
            grades[i] = intCheck(); //makes sure value is an int
            
            while(grades[i] > 100 || grades[i] < 0) //error when outside of 0-100
            {
                System.out.println("Please enter a number between 0 and 100.");
                grades[i] = intCheck();
            }
            
            while(i>0 && grades[i] < grades[i-1]) //error when value is less than previous 
            {
                System.out.println("Please enter a higher number.");
                grades[i] = intCheck();
                
                while(grades[i] > 100 || grades[i] < 0) //checks again for 0-100
                {
                    System.out.println("Please enter a number between 0 and 100.");
                    grades[i] = intCheck();
                }
                
            }
        }
        printArray(grades); //prints array
        
        System.out.println("Please enter a grade to be searched for.");
        int search = input.nextInt(); //grade to be searched for
        int iterations = 0; //iterations checked
        boolean isSearch = false; //check if search exists
        for(int i = 0; i<grades.length; i++) //loop to look for specified grade
        {
            iterations++; 
            if(search == grades[i]) //lets user know grade is found
            {
                System.out.println("The grade you are searching for is in the array!");
                isSearch = true;
                break;
            }
            else if(search < grades[i]) //ends when search is no longer possible to be in the array
            {
                break;
            }
        }
        if(!isSearch) //prints when grade is not in the array
        {
            System.out.println("The grade you are searching for is NOT in the array.");
        }
        System.out.println(iterations+ " iterations were checked.");
        
        mixArray(grades); //mixes array
        
        //new search, same process
        System.out.println("Please enter another grade to be searched for.");
        search = input.nextInt();
        isSearch = false;
        iterations = 0;
        for(int i = 0; i<grades.length; i++)
        {
            iterations++;
            if(search == grades[i])
            {
                System.out.println("The grade you are searching for is in the array!");
                isSearch = true;
                break;
            }
        }
        if(!isSearch)
        {
            System.out.println("The grade you are searching for is NOT in the array.");
        }
        System.out.println(iterations+ " iterations were checked.");
        
    } //end of main method
} //end of main class