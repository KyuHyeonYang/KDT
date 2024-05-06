package ch09_generic_collection.sec12;

public class Student {

	private int stdNo;
	private String stdName;

	public Student(int stdNo, String stdName) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

}
