package ch06_class.sec11;

public class SavingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Savings s=new Savings();
		
		s.setName();
		s.setBalance();
		
		System.out.println("예금주: "+s.getName());
		System.out.println("입금 전 잔액:" +s.getBalance());
		
 }
}