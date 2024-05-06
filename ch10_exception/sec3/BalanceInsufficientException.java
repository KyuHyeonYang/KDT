package ch10_exception.sec3;





public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}//기본 생성자
	
		//상위클래스에게 예외발생 원인(예외 메세지)를 전달하기 위해 String 타입의 매개변수를 갖는 생성자
		//상위클래스의 생성자를 호출하여 예외 메세지를 전달
		//메시지 용도는 catch 블럭을 예외처리 코드에 이용
		
		public BalanceInsufficientException(String message) {
			super(message);
		}
	

}
