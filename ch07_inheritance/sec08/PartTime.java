package ch07_inheritance.sec08;

public class PartTime extends Worker {
	private int hours, unitPrice;

	public void setPartTimeInfo() {
		unitPrice=10000;
		hours = 60;
		
	}
 public int calculatePay(){
	 return hours*unitPrice;
	 
}
public PartTime(String joominNo, String name, int hours, int unitPrice) {
	super(joominNo, name);
	this.hours = hours;
	this.unitPrice = unitPrice;
}
@Override
public String toString() {
	return "\n근무시간: " + hours +"시간" + "\n시급: " + unitPrice + ""+"\n총지불액: "+calculatePay()+"원";
}

	}


