package ch07_inheritance.sec08;

public class Worker {
private String joominNo,name;




public Worker(String joominNo, String name) {
	super();
	this.joominNo = joominNo;
	this.name = name;
}

@Override
public String toString() {
	return "주민번호: " + joominNo + "\n성명: " + name + "]";
}
}
