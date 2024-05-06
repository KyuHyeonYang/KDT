package ch14_io_file.sec03;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {
		//(1)디렉터리생성
		//파일 객체 생성
		File dir=new File("c:/test/Dir");
		
		//mkdirs()메소드:경로상에 없는 디렉토리 생성하고 결과반환
		boolean result=dir.mkdirs();
		System.out.println(result);//처음 실행하면 true출력
		//다시 또 실행하면 false로 출력(다시 안 만듦)
		File dir2=new File("c:\\test\\test2\\Dir2");
		dir2.mkdirs();
		
		//mkdir():바로 상위 디렉터리 존재하지 않으면 생성불가
		File dir3=new File("C:\\test3\\Dir3");
		if(dir3.exists()==false) {dir3.mkdir();}
		
		File dir4=new File("c:\\test\\Dir4");//최상위 디렉터리 test가 존재하므로 Dir4생성됨
		if(dir4.exists()==false) {dir4.mkdir();}
		
		//(2)파일생성
		File file1=new File("c:/test/file1.txt");
		if(file1.exists()==false) {file1.createNewFile();}
		

	}

}
