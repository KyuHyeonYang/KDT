package ch07_inheritance.sec02;

import java.util.Scanner;

public class Employee {
private  String empNo;
private String empName;
private String empPart;

 public void setEmployee() {
	Scanner sc=new Scanner(System.in);
	 System.out.print("사번 입력: ");
	 empNo=sc.next();
	 System.out.print("성명 입력: ");
	 empName=sc.next();
	 System.out.print("부서 입력: ");
	 empPart=sc.next();
	 sc.close();	 
 }
 public void showEmpInfo() {
	 System.out.println("*********************");
	 System.out.println("사번 입력: "+empNo);
	
	 System.out.println("성명 입력: "+empName);
	
	 System.out.println("부서 입력: "+empPart);

	 

 }
 
}
