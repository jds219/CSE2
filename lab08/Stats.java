/* Jacob Schultz
lab08 - Stats
Using several methods, calculates the mean and median of 
a set of user inputted values and prints the result
*/
import java.util.Scanner; 
public class Stats //main class
{
    //method used to calculate the mean
    public static double mean(double d1, double d2, double d3, double d4, double d5) 
    {
        double mean = (d1+d2+d3+d4+d5)/5;
        return mean;
    }
    
    //method used to find median
    public static double median(double d3)
    {
        //Note: In this case, the median is always the third double inputted because
        //the user can only input 5 numbers, and they must be in increasing order
        double median = d3;
        return median;
    }
    
    //method used to print out the mean and median values
    public static void print(double mean, double median)
    {
        System.out.println("The mean of the numbers is: "+ mean);
        System.out.println("The median number is: "+ median);

    }
    
    //main method
    public static void main(String[] args)
    {
        System.out.println("Please enter 5 numbers in increasing order (from lowest to highest).");
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble(); 
        
        double d2 = input.nextDouble();
        while(d2<d1) //loop used to make sure number inputted is greater than the last
        {
            System.out.println("Please enter the numbers in increasing order.");
            d2 = input.nextDouble();
        }
        
        double d3 = input.nextDouble();
        while(d3<d2) 
        {
            System.out.println("Please enter the numbers in increasing order.");
            d3 = input.nextDouble();
        }
        
        double d4 = input.nextDouble();
        while(d4<d3)
        {
            System.out.println("Please enter the numbers in increasing order.");
            d4 = input.nextDouble();
        }
        
        double d5 = input.nextDouble();
        while(d5<d4)
        {
            System.out.println("Please enter the numbers in increasing order.");
            d5 = input.nextDouble();
        }
        
        //calls the print method, with the results of the mean and median methods as its inputs
        print(mean(d1, d2, d3, d4, d5), median(d3)); 
    }//end of main method
}//end of main class