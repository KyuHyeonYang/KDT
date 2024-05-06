package ch10_exception.sec3;

public class Account {
private long balance;
public Account() {}
 public Account(long balance) {
	 this.balance=balance;
 }
 public void deposit(int money) {
	 balance+=money;
 }
 
 //예외발생코드를 가지고 있는 메소드
 //이 메소드를 호출한 곳에서 예외를 처리하도로 throws 로 예외를 떠넘김
public void withdraw(int money)throws BalanceInsufficientException{
	if (balance<money){//잔고 부족시 예외발생시킴("예외메세지"):예외메세지는 예외 객체 내부에 저장
		//예외 발생
		throw new BalanceInsufficientException("잔고부족"+(money-balance)+"부족함");
		
		
	}
	balance-=money;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}

}
