package ch14_io_file.sec01;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamMain {

	public static void main(String[] args) throws IOException {
		// 콘솔 입력
		InputStream is = System.in;
		// System.out.print("입력: ");
		// System.out.println("출력: "+is.read());//아스키 코드값 출력
		// System.out.println("출력:"+(char)is.read());//문자로 변환해서 출력
		// 문자열로 읽기 위해서는 바이트 배열로 받음
		byte[] data = new byte[10];
		System.out.print("이름입력: ");
		// 읽은 바이트 수
		int nameBytes = is.read(data);
		System.out.println(nameBytes);
		//문자인 경우
		String name = new String(data, 0, nameBytes - 1);//(영문:-1)(한글:-1)
		System.out.println(name);
		//숫자인 경우
		/*String name = new String(data, 0, nameBytes - 2);
		System.out.println(name);
		System.out.println(Integer.parseInt(name));//숫자입력 후 타입변환
		1234입력하니까 바이트수 6:4바이트+2바이트
		-2하는 이유:엔터키(케리지 리터 (13)+라인 피드(10)
		*/
		
	}

}
