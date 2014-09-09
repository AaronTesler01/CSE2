//Aaron Tesler
//09/03/14
//lab02_Cyclometer
//Point of program is to calculate the distance and counts of bicycle trips.

public class Cyclometer{
    //main class required for program
    public static void main (String[] args) {
        
    int secsTrip1=480;//seconds taken for Trip 1
    int secsTrip2=3220;//seconds taken for Trip 2
    int countsTrip1=1561;//counts taken for Trip 1
    int countsTrip2=9037;//counts taken for Trip 2
    double wheelDiameter=27.0, //Diameter of the bike in question
    PI=3.14159, //Pi, the number useful for calculating circumference
    feetPerMile=5280, //How many feet are in a mile
    inchesPerFoot=12,//How many inches are in a foot
    secondsPerMinute=60; //How many seconds are in a minute
    double distanceTrip1, distanceTrip2,totalDistance; //Distance of Trips 1 and 2 and total
    
    System.out.println("Trip 1 took " + 
        (secsTrip1/secondsPerMinute)+ " minutes and had "
        +countsTrip1+" counts.");
    System.out.println("Trip 2 took " +
        (secsTrip2/secondsPerMinute)+ " minutes and had "
        +countsTrip2+" counts.");//Statement of Trip time and counts for 1 and 2.
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //Above is the distance of Trip 1
    //expressed as distance(inches) = counts * diameter * Pi
    distanceTrip1/=inchesPerFoot*feetPerMile;//Converts inches to miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //distance for Trip 2
    totalDistance=distanceTrip1+distanceTrip2;//Total distance traveled
    System.out.println("Trip 1 was " +distanceTrip1+ " miles.");
    System.out.println("Trip 2 was " +distanceTrip2+ " miles.");
    System.out.println("The total distance was " +totalDistance+ " miles.");
    
    
    }//end of main method
}//end of class