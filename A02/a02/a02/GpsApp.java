package a02;

/**
 * 
 * @author mil44143
 * @date Feb 3, 2017
 * Class CSIS 1410-003-Sp17
 */
public class GpsApp {

	public static void main(String[] args) {
		
		//Create an instance of the GpsCoordinates class and pass 
		//a Latitude and Longitude coordinate
		GpsCoordinates gps = new GpsCoordinates(40.760671, -111.891122);
		
		//Create an instance of the Gps class and pass a location and GPS Coordinates
		Gps g = new Gps("SLC", gps);
		
		//print out the coordinates of a location via the Gps class instance
		System.out.println(g + "\n");
		
		//print out a simulation of a gps device showing the Latitude and Longitude locations
		System.out.println("myGps: Garmin: " + gps + "\n");
		
		//update the Latitude and Longitude variables 3 times and print out to screen new values
		g.updatePosition();
	}

}
