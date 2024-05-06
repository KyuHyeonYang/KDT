package ch06_class.sec08;

public class TvMain {

	public static void main(String[] args) {
		Tv[]tvArr=new Tv[3];;//길이가 3인 Tv객체 배열
		//객체를 다루기 위한 참조변수만 만들어 진 것 일뿐
		//아직 Tv객체 생성하지 않음
		
		//Tv를 객체를 생성해서  Tv객체 배열의 각 요소에 저장
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i]=new Tv();//인스턴스 생성=객체 생성
			tvArr[i].channel=i+10;//멤버변수 channel 값 설정:각각 10,11,12
		}
		for (int i=0; i<tvArr.length;i++) {
			tvArr[i].channelup();//채널 1 증가
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}


	}

}
