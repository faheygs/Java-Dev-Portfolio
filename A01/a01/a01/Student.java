package a01;

public class Student {
	private String firstName;
	private String lastName;
	private int sNumber;
	private String major;
	private double gpa;
	private static int count = 0;
	
	
	public Student() {
		sNumber = 1234567 + count++;
	}
	
	public Student(String fname, String lname, String maj, double gpa) {
		setFirstName(fname);
		setLastName(lname);
		setMajor(maj);
		setGpa(gpa);
		sNumber = 1234567 + count++;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getsNumber() {
		return sNumber;
	}
	
	public String toString() {
		return "S" + sNumber + " " + firstName + " " + lastName + " " + major + " GPA: " + gpa;
	}
}

