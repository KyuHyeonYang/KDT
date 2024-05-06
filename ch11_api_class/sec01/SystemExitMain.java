package ch11_api_class.sec01;

public class SystemExitMain {

	public static void main(String[] args) {
		//프로그램 강제종료:exit()
		
		for (int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(0);//프로그램 완전 종료:이후 아무 문장도 수행하지 않음:"종료"출력 되지 않음
				break;//현재 반복문 종료하고 다음 문장을 수행:종료 출력
			}
		}
		System.out.println("종료");
	}

}
