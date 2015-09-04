//Jacob Schultz
//hw02
//Arithmetic program, calculates price of items, returns total price with tax
//
// first compile the program
//      javac Arithmetic.java
// run the program
//      java Arithmetic//


public class Arithmetic{
    
    public static void main(String[] args){
        

        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
    
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;

        //total cost of individual items before tax is applied
        double totalSocks= (nSocks)*(sockCost$);
        double totalGlasses= (nGlasses)*(glassCost$);
        double totalEnvelopes= (nEnvelopes)*(envelopeCost$);    

        //total tax on each individual item
        double taxSocks= (double)((int)((totalSocks)*(taxPercent)*100))/100;
        double taxGlasses= (double)((int)((totalGlasses)*(taxPercent)*100))/100;
        double taxEnvelopes= (double)((int)((totalEnvelopes)*(taxPercent)*100)) /100;
        
        //total cost of transaction with tax
        double totalPurchase= (double)((int)((totalEnvelopes+totalGlasses+totalSocks+taxEnvelopes+taxGlasses+taxSocks)*100))/100;
        
        //prints out all values
        System.out.println("Total Envelope cost: $"+totalEnvelopes+"\n"+"Total glasses cost: $" +totalGlasses+"\n"
        +"Total socks cost: $"+totalSocks+"\n"+"Tax on envelopes: $"+taxEnvelopes+"\n"+"Tax on glasses: $"+taxGlasses+"\n"+"Tax on socks: $"+taxSocks+
        "\n"+"Total cost of items and taxes: $"+totalPurchase);
    }
}
