package LabConcert;

public class Concert {
	private String name;
	private Time startTime;
	private Time endTime;
	
	public Concert(String n, Time start, Time end) {
		name = n;
		startTime = start;
		endTime = end;
	}
	
	public String toString() {
		return "Concert: " + name + "\nStart Time: " + startTime + "\nEnd Time: " + endTime;
	}
}