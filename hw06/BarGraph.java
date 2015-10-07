/* Jacob Schultz
hw06 part 1 - Bar Graph 
Creates a visual representation of user inputted expenses, 
averages those values, and project total expenses after 4 years
*/

//imports for scanner and math.random
import java.util.Scanner;
import java.lang.Math;

public class BarGraph //main class
{
    public static void main(String[] args) //main method
    {
        //variables used to store expense values for each weekday
        double expenses1 =0, expenses2=0, expenses3=0, expenses4=0, expenses5=0, expenses6=0, expenses7=0;
        double round = 0;
        System.out.println("Please enter your expenses for the week.");
        
        //loop to store different expense values
        for(int i = 0; i<7; i++)
        {
            
            Scanner input = new Scanner(System.in); //creates new scanner
            while(!input.hasNextDouble()) //checks to see if the scanner value is a string. 
                    {
                        System.out.println("Please enter a number.");
                        input.next();
                    } //repeats until the value inputted is a number
                    
            switch (i) //cases are used to store values of each weekday expense
            {
                case 0: 
                    expenses1 = input.nextDouble(); //stores the current expense
                    expenses1 = (double)((int)((expenses1)*100))/100; //rounds to 2 decimal places
                    
                    if(expenses1 < 0) //checks if number is positive
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--; //used to give user chance to change value for that day without moving on to next day
                    }
                    
                    break;
                    
                case 1: 
                    expenses2 = input.nextDouble(); 
                    expenses2 = (double)((int)((expenses2)*100))/100;
                    if(expenses2 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                case 2: 
                    expenses3 = input.nextDouble(); 
                    expenses3 = (double)((int)((expenses3)*100))/100;
                    if(expenses3 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                case 3: 
                    expenses4 = input.nextDouble(); 
                    expenses4 = (double)((int)((expenses4)*100))/100;
                    if(expenses4 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                case 4:
                    expenses5 = input.nextDouble(); 
                    expenses5 = (double)((int)((expenses5)*100))/100;
                    if(expenses5 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                case 5:
                    expenses6 = input.nextDouble(); 
                    expenses6 = (double)((int)((expenses6)*100))/100;
                    if(expenses6 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                case 6:
                    expenses7 = input.nextDouble(); 
                    expenses7 = (double)((int)((expenses7)*100))/100;
                    if(expenses7 < 0)
                    {
                        System.out.println("Please enter a positive dollar value.");
                        i--;
                    }
                    break;
                    
                default: //in case anything goes wrong
                System.out.println("ERROR");
                break;
                
            } //end of switch statements
            
        }//end of for loop
        
        // prints out each expense for each weekday
        System.out.println("Expense for Monday: "+ expenses1);
        System.out.println("Expense for Tuesday: "+ expenses2);
        System.out.println("Expense for Wednesday: "+ expenses3);
        System.out.println("Expense for Thursday: "+ expenses4);
        System.out.println("Expense for Friday: "+ expenses5);
        System.out.println("Expense for Saturday: "+ expenses6);
        System.out.println("Expense for Sunday: "+ expenses7);
        
        //variables used to calculate weekly average, and estimated 4 year expenses
        double average = (double)((int)((expenses1+expenses2+expenses3+expenses4+expenses5+expenses6+expenses7)/7*100))/100;
        int random = (int)(Math.random()*(40));
        if(random > 20) //variance is -20% to +20%, this gives the negative values
        {
            random = random - 40; 
        }
        double fourYears = ((double)random/100*average + average)*208;

        //prints out the random percentage change, weekly average, and estimated 4 years expenses
        System.out.println("Percentage variance: "+random+"%");
        System.out.println("Your average for the week is: " + average);
        System.out.println("Your expected 4 year expenses are: "+ (double)((int)((fourYears)*100))/100);
        
        //this is for the bar graph!
        round = expenses1 - (int)(expenses1); //gets decimal portion of expense
        System.out.print("\nMon:  "); //day of the week
        if(round < .5) //checks to see if number should round down
        {
            for(int j=0; j<(int)(expenses1);j++) //prints number of asterisks based on expense value
            {
                System.out.print("*");
            }
        }
        else //operates when number should round up
        {
            for(int j=0; j<(int)(expenses1)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of monday
        
        round = expenses2 - (int)(expenses2);
        System.out.print("\nTues: ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses2);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses2)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of tuesday
        
        round = expenses3 - (int)(expenses3);
        System.out.print("\nWed:  ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses3);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses3)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of wednesday
        
        round = expenses4 - (int)(expenses4);
        System.out.print("\nThu:  ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses4);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses4)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of thursday
        
        round = expenses5 - (int)(expenses5);
        System.out.print("\nFri:  ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses5);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses5)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of friday
        
        round = expenses6 - (int)(expenses6);
        System.out.print("\nSat:  ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses6);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses6)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of saturday
        
        round = expenses7 - (int)(expenses7);
        System.out.print("\nSun:  ");
        if(round < .5)
        {
            for(int j=0; j<(int)(expenses7);j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            for(int j=0; j<(int)(expenses7)+1;j++)
            {
                System.out.print("*");
            }
        }
        //end of sunday
        
    }//end of main method
    
}//end of main class
