//Jacob Schultz
//hw03 - Block
//calculates the volume and surface area of a block based off user inputs

import java.util.Scanner; //imports the scanner program

public class Block{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //creates new scanner
        System.out.println("Please enter the height of the block."); 
        double height = myScanner.nextDouble(); //stores the user inputted value for height as double
        System.out.println("Please enter the width of the block.");
        double width = myScanner.nextDouble(); //stores the user inputted value for width as double
        System.out.println("Please enter the length of the block.");
        double length = myScanner.nextDouble(); //stores the user inputted value for length as double
        
        double volume = height*width*length; //calculates volume and stores value
        double surfaceArea = 2*height*width + 2*height*length + 2*width*length; //calculates surface area and stores value
        
        System.out.println("The volume of the block is " +volume +"\nThe surface area of the block is "+surfaceArea); 
        //returns values of volume and surface area to user
        
    }
}