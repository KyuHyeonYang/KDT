package Ch04_control_stmt;

public class Ch04_36_Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다중 for문에서의 break
		
		//(1)가까운 for문만 종료
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+":"+j);
				if(j==2) {
					break;//가까운 for문 종료
					//바깥의 i for문은 계속 반복 됨,바깥 반복문 까지 종료시키려면 이름(라벨)을 붙이고 
					//"break 이름"사용
				}
			}
		}
		
		System.out.println("----------------");
		
		//(2)바깥 for문도 종료
		//for문에 이름 (라벨)을 붙임
		
		Outter:for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+":"+j);
				if(j==2) {
					break Outter;//break 다음에 이름(라벨)을 적용
				}
			}
		}
	}
}
