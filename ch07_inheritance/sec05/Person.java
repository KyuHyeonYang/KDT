package ch07_inheritance.sec05;

public class Person {
private String Name;
private String ssn;

public Person(String name, String ssn) {

	Name = name;
	this.ssn = ssn;
}
@Override
public String toString() {
	return "Person [Name=" + Name + ", ssn=" + ssn + "]";
} 


	
}


