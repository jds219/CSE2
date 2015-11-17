/* Jacob Schultz
lab12- Array Manipulation

*/
import java.lang.Math;

public class lab12 //main class
{
    public static int[] [] raggedArray() //method used to create ragged array
    {
        int random = (int)(Math.random() * 11) + 10; 
        int [] [] array = new int [random] []; //random array
        for( int i = 0; i<array.length; i++) //loop used to random assign number of array members
        {
            array [i] = new int [(int)(Math.random() * 11) + 10]; 
        }
        for (int i = 0; i< array.length; i++) //loops used to fill in each value of array members
        {
            for( int j =0; j< array[i].length; j++)
            {
                array [i] [j] = (int)(Math.random() * 2001) - 1000;
            }
        }
        return array; 
    }
    
    public static void printArray(int [] [] array) //method used to print array in a visually pleasing way
    {
        for (int i = 0; i< array.length; i++)
        {
            System.out.println("array["+i+"]: ");
            for( int j =0; j< array[i].length; j++)
            {
                System.out.print(array[i][j] +" ");
            }
            System.out.println("");
        }
    }
    
    public static void printArray(int [] array) //loop used to print single array 
    {
        for (int i = 0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
    public static int findSmallest(int [] [] array) //loop used to find smallest array member length
    {
        int lengthSmallest = 21;
        int smallest = 0;
        for (int i = 0; i< array.length; i++) //loop cycles through each array member
        {
            if(array[i].length < lengthSmallest) //when the length is smaller than the previous smallest...
            {
                lengthSmallest = array[i].length; //..sets new smallest length..
                smallest = i; //..and indicates which array member is smallest
            }
        }
        return smallest;
    }
    
    public static int findLargest(int[] [] array) //loop used to find largest value in the array
    {
        int largest = -1001;
        int member = 0;
        for (int i = 0; i< array.length; i++) //loops used to cycle through every array member
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > largest) //when the value is larger than the previous largest...
                {
                    largest = array[i][j]; //...sets largest to new value...
                    member = i; //.. and remembers where it is
                }
            }
        }
        return largest; 
    }
    
    public static int largestMember(int [] [] array) //loop used to find which array member has the largest value
    {
        int largest = -1001;
        int member = 0;
        for (int i = 0; i< array.length; i++) //loops used to cycle through every array member
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > largest) //when the value is larger than the previous largest...
                {
                    largest = array[i][j]; //...sets largest to new value...
                    member = i; //.. and remembers where it is
                }
            }
        }
        return member;
    }
    
    public static int mostEven(int [] [] array) //method used to find array member with most even values
    {
        int even = 0; 
        int mostEvens =0;
        int location =0;
        for (int i = 0; i< array.length; i++) //loops used to cycle through array members
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] % 2 == 0) //for each even value...
                {
                    even++; //...add one to the count of even numbers
                }
            }
            if(even > mostEvens) //when the number of evens is greater than the previous largest number...
            {
                mostEvens = even; //...remember that value...
                location = i;//... and where it is
            }
            even = 0;
        }
        return location;
    }
    
    public static void main(String[] args) //main method
    {
        int [] [] array = raggedArray(); //creates array
        System.out.println("The array is: "); //prints array neat
        printArray(array);
        System.out.println("The smallest member array is: "); //finds smallest array neatly
        printArray(array[findSmallest(array)]);
        System.out.println("\nThe largest value in the array is: " + findLargest(array) + " and the array is: "); //prints largest value and array
        printArray(array[largestMember(array)]); //ERROR
        System.out.println("\nThe array member with the most even numbers is: array["+ mostEven(array)+"]"); //prints most even array
    } //end of main method
} //end of main class