package ch14_io_file.sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputStreamMain {

	public static void main(String[] args) throws IOException {
		//보조스트림:buffer reader/input stream reader
		//입력스트림:system.in;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*System.out.print("입력: " );
		String input=br.readLine();
		System.out.println("출력: "+input);*/
		
		System.out.println("숫자 1 입력: ");
		String n1=br.readLine();
		System.out.println("숫자 1 입력: ");
		String n2=br.readLine();
		
		System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));//문자열 연산이라 계산 X 따라서 2,4입력시 24출력
		//숫자 연산
		
		
	}

}
