package se.examinations.uppgift.paulo;

public class Person {
	
	private String name;
	private int points;
	
	// Empty constructor
	public Person() {
	}
	
	// Constructor with name
	public Person(String name) {
		this.name = name;
	}
	
	// Constructor with name and points
	public Person(String name, int points) {
		this.name = name;
		this.points = points;
	}

		
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	

}
