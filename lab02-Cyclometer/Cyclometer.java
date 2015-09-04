//Jacob Schultz
//9-4-2015
//lab02-Cyclometer
//imitates a bicycle cyclometer
//prints number of minutes per trip, counts per trips, each trip in miles, and two trips combined. 

public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    int secsTrip1=480;  //time of trip1 in seconds
       	int secsTrip2=3220;  //time of trip2 in seconds
		int countsTrip1=1561;  //number of rotations of the front wheel during trip1
		int countsTrip2=9037; //number of rotations of the front wheel during trip2
        
        double wheelDiameter=27.0,  //diameter of the front wheel
    	PI=3.14159, //value of pi
  	    feetPerMile=5280,  //conversion of 1 mile to feet
    	inchesPerFoot=12,   //conversion of 1 foot to inches
    	secondsPerMinute=60;  //conversion of 1 minute to seconds
    	double distanceTrip1, distanceTrip2,totalDistance;  //variables to calculate distances of trip1, trip2, and both trips combined 
    	
    	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+  //prints trip1 distance and rotations
       	      countsTrip1+" counts.");                    
       	      
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+  //prints trip2 distance and rotations
       	      countsTrip2+" counts.");
       	      
       	//run the calculations; store the values. Document your
		//calculation here. What are you calculating?
		//
		//Here I am calculating the total distance of each trip, as well as the combined distance

    	distanceTrip1=countsTrip1*wheelDiameter*PI;
        	// Above gives distance in inches
        	//(for each count, a rotation of the wheel travels
        	//the diameter in inches times PI)
        	
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance of trip1 in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Calculates distance of trip2 in miles
    	totalDistance=distanceTrip1+distanceTrip2; //Combines the two distances to obtain a total distance
    	
    	//Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //prints trip1 distance
    	System.out.println("Trip 2 was "+distanceTrip2+" miles"); //prints trip2 distance
    	System.out.println("The total distance was "+totalDistance+" miles"); //prints total distance


	}  //end of main method   
} //end of class