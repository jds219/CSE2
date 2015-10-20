/* Jacob Schultz
hw08 - Area
Calculates the area of a user inputted shape, with user given dimensions
*/
import java.util.Scanner;
public class Area
{
    //method that finds and returns area of a rectangle
    public static double Rectangle(double length, double width)
    {
        double areaRect = length * width; //multiples the two inputs together...
        return areaRect; //...returns that value 
    }
    
    //method that finds and returns area of a triangle
    public static double Triangle(double height, double width)
    {
        double areaTri = .5*height*width; //multiples two inputs, halfs...
        return areaTri; //...returns that value
    }
    
    //method that finds and returns area of a circle
    public static double Circle(double radius)
    {
        double pi = 3.14159;
        double areaCir = pi*radius*radius; //takes input, squares and multiples by pi...
        return areaCir; //returns that value
    }
    
    //method that checks if scanner input is valid
    public static boolean ShapeCheck(String shape)
    {
        //evaluates for specific input values
        if(shape.equals("rectangle") || shape.equals("triangle") || shape.equals("circle"))
        {
            return true; //returns true for correct values
        }
        else
        {
            return false; //returns false otherwise
        }
    }
    
    //method used to check if numbers entered are doubles
    public static double DoubleCheck (double x)
    {
        boolean acceptable = false; //boolean used to confirm when input is a double
        Scanner input = new Scanner(System.in);
        while(!acceptable) //loop used to check for double
            {
            //check if the input is an integer
            if (input.hasNextDouble()) //when input is a double...
            {
                //if so, store it.
                x = input.nextDouble(); //...sets input of method to the scanner input
                acceptable = true;
                break; //breaks out of the loop
            }
            System.out.println("ERROR. Please enter a number.");
            input.next();
            }
        return x; //returns valid input value
    }
    
    //main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the shape you would like to find the area of.");
        String shape = input.nextLine(); //sets user input to variable 'shape'
        while(!ShapeCheck(shape)) //loop to check if shape is valid, using the ShapeCheck method
        {
            System.out.println("That is an incorrect shape. Please enter either: \n rectangle, triangle, circle");
            shape = input.nextLine(); //gets new input if not a valid shape
        }
        if(shape.equals("rectangle")) //runs if input is a rectangle
        {
            //initializes height and width variables
            double height = 0; 
            double width = 0;
            
            System.out.println("Please enter the height of the rectangle.");
            height = DoubleCheck(height); //checks that input is a double, then assigns to height
            
            System.out.println("Please enter the width of the rectangle.");
            width = DoubleCheck(width); //checks that input is a double, then assigns to width
            System.out.println(Rectangle(height, width)); //prints resulting area using method Rectangle
        }
        else if(shape.equals("triangle")) //runs if input is a triangle
        {
            //initializes height and base variables
            double height = 0; 
            double base = 0;
            
            System.out.println("Please enter the height of the triangle.");
            height = DoubleCheck(height); //checks that input is a double, assigns to height
            System.out.println("Please enter the base length of the triangle.");
            
            base = DoubleCheck(base); //checks that input is a double, assigns to base
            System.out.println(Triangle(height, base)); //prints resulting area using method Triangle
        }
        else //runs if input is a circle
        {
            double radius = 0; //initializes radius variable
            System.out.println("Please enter the radius of the circle.");
            radius = DoubleCheck(radius); //checks that input is a double, assigns to radius
            System.out.println(Circle(radius)); //prints resulting area using method Circle
        }
        
    } //end of main method
} //end of main class