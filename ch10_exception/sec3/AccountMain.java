package ch10_exception.sec3;



public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);//throws 떠넘겼기 때문에 호출하는데에서 반드시 예외 처리해야함
		} catch ( BalanceInsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
			
			
		// 예외 추적내용 확인
			e.printStackTrace();
		}
		

	}

}
