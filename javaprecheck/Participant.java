package javaprecheck;

public class Participant {
	private String name;
	private String surname;
	private int age;
	private String typeofsport;	
	private int awards;
	
public Participant() {
		
	}
	
	public Participant(String name, String surname, int age, String typeofsport, int awards) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.typeofsport = typeofsport;
		this.awards = awards;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTypeofsport() {
		return typeofsport;
	}
	public void setTypeofsport(String typeofsport) {
		this.typeofsport = typeofsport;
	}
	public int getAwards() {
		return awards;
	}
	public void setAwards(int awards) {
		this.awards = awards;
	}
	
	
}


