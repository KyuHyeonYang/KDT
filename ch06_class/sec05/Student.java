package ch06_class.sec05;

public class Student {
private String stdNo;
private String stdName;
private int stdYear;
private int stdScore;

public void inputStd() {		
	 System.out.println("학번: ");
	 System.out.println("성명: ");
	 System.out.println("학년: " );
	 System.out.println("점수: :");
public void showStd() {
	System.out.println("******학생 정보 출력*******");
	System.out.println("학번: "+ stdNo);
	System.out.println("성명: "+ stdName);
	System.out.println("학년: "+ stdYear);
	System.out.println("점수: "+ stdScore);
}

	}


}
