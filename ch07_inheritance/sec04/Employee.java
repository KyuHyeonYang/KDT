package ch07_inheritance.sec04;

public class Employee {
private String empNo;
private String empName;
private String empPart;
//매개변수 3개있는 생성자
//자식클래스의 생서앚로부터 매개변수 전달 받아서 멤버필드 초기화
public Employee(String empNo, String empName, String empPart) {

	this.empNo = empNo;
	this.empName = empName;
	this.empPart = empPart;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empPart=" + empPart + "]";
}


}
