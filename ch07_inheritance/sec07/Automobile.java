package ch07_inheritance.sec07;

public class Automobile extends Car {
private String autoManual;

public void setAutomobliInfo() {
	autoManual="자동";
	
}
@Override
public String toString() {
	return "Automobile [autoManual=" + autoManual + "]";
}

}
