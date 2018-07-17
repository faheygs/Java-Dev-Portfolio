package a02;

import java.util.Random;

public class Gps {

		//Two private variables initialized to take in a name and a GPS Coordinate
		private String name;
		private GpsCoordinates position;
		
		//This Constructor takes in a string and a GpsCoordinate and assigns them to the 
		//Private variables previously initialized
		public Gps(String n, GpsCoordinates pos) {
			this.name = n;
			this.position = pos;
		}
		
		//This class finds a random number between -2.5 and 2.5 for both the latitude and longitude
		//and adds that to the original coordinates three times.
		public void updatePosition() {
			Random r = new Random();
			
			for(int i = 1; i < 4; i++) {
				double randLat = (-2.5) + (2.5 - (-2.5)) * r.nextDouble();
				double randLon = (-2.5) + (2.5 - (-2.5)) * r.nextDouble();
				
				double lat = position.getLatitude() + randLat;
				double lon = position.getLongitude() + randLon;
				
				System.out.println("Position Update " + i + ": " + lat + " " + lon);	
			}
		}
		
		//This class returns the position (coordinates) of the provided location
		public GpsCoordinates getPosition() {
			return position;
		}
		
		//This class takes the name and GpsCoordiantes that were initialized to begin this class
		//and returns them in a string format to be used
		public String toString() {
			return "GPS Coordinates of " + name + ": " + position;
		}
}
