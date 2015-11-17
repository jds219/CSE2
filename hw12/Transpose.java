/* Jacob Schultz
hw12 - Transpose
Takes a 2D array, transposes its members. (Flips about its diagonal)
*/

import java.lang.Math;
import java.util.Scanner;

public class Transpose
{
    public static int [] [] randomMatrix(int height, int width)
    {
        int [] [] array = new int [height] [width]; 
        for(int i = 0; i<height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                array [i][j] = (int)(Math.random() * 21) - 10;
            }
        }
        return array;
    }
    
    public static void printMatrix(int[] [] array)
    {
        int rect = array[0].length;
        boolean check = true;
        for(int i = 0; i<array.length; i++)
        {
            System.out.println("");
            for(int j = 0; j<array[i].length; j++)
            {
                System.out.print(array[i][j] +" ");
            }
            if(array[i].length != rect)
            {
                check = false;
            }
            rect = array[i].length;
        }
        if(check == false)
        {
            System.out.println("WARNING! Array is not rectangular!");
        }
    }
    
    public static int [] [] transposeMatrix(int [] [] array)
    {
        int [] [] newArray = new int [array[0].length][array.length];
        for(int i = 0; i<array[0].length; i++)
        {
            for(int j = 0; j<array.length; j++)
            {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows.");
        while(!input.hasNextInt())
        {
            System.out.println("Please enter a valid integer.");
            input.next();
        }
        int height = input.nextInt();
        while(height < 0)
        {
            System.out.println("Please enter a positive number.");
            while(!input.hasNextInt())
            {
                System.out.println("Please enter a valid integer.");
                input.next();
            }
            height = input.nextInt();
        }
        System.out.println("Please enter the number of columns.");
        while(!input.hasNextInt())
        {
            System.out.println("Please enter a valid integer.");
            input.next();
        }
        int width = input.nextInt();
        while(width < 0)
        {
            System.out.println("Please enter a positive number.");
            while(!input.hasNextInt())
            {
                System.out.println("Please enter a valid integer.");
                input.next();
            }
            width = input.nextInt();
        }
        int[] [] array = randomMatrix(height,width);
        System.out.println("\nHere is the Matrix!");
        printMatrix(array);
        System.out.println("\nHere is the Transposed Matrix!");
        printMatrix(transposeMatrix(array));
    }
}