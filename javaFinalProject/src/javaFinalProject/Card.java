package javaFinalProject;

public class Card {
	
	//Fields
	private int value;
	private String name;
	
	
	//Methods
	
	//constructor method with no parameter
	public Card() {};
	//constructor that takes name and int in the parameters 
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	//constructor that only takes the name in the parameters
	public Card(String name) {
		this.name = name;
	}

	
	//this method will use print out the name assigned
	//in the constructor or the name that was set and also the value
	public void describe() {
		System.out.println(this.name + ": " + this.value);
	}
	
	
	//value getters
	public int getValue() {
		return value;
	}
	//value setters
	public void setValue(int value) {
		this.value = value;
	}
	//name getter
	public String getName() {
		return name;
	}
	//name setter
	public void setName(String name) {
		this.name = name;
	} 
	
	
}
