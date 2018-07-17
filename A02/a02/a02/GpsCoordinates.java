package a02;

public class GpsCoordinates {
	
	//declare two private doubles to hold the latitude and longitude value
	private double latitude;
	private double longitude;
	
	//this constructor takes in two doubles that set the latitude and longitude variables
	public GpsCoordinates(double lat, double lon) {
		setLatitude(lat);
		setLongitude(lon);
	}
	
	//This class returns the Latitude variable
	public double getLatitude() {
		return latitude;
	}

	//This class takes in the Latitude received from the constructor and sets it to the private
	//Variable Latitude
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	//This class returns the longitude variable
	public double getLongitude() {
		return longitude;
	}

	//This class takes in the Longitude received from the constructor and sets it to the private
	//Variable Longitude
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	//This class takes the latitude and longitude variables and returns them in a string format
	public String toString() {
		return latitude + " " + longitude;
	}
}
