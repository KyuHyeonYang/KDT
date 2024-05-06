package ch14_io_file.sec04;

import ch10_exception.sec01.CatchOrderMain;

public class FileOutputStream {

	try {
		//파일이 존재하지 않으면 새로 생성하고, 존재하면 이전 내용 덮어씀
		//FileOutputStream fos=new FileOutputStream();
		
		
		//이전 내용 덮어쓰지 않고 맨 뒤에 추가 할 수 있도록
		//추가 모드로 설정(append 모드)
		FileOutputStream fos=new FileOutputStream("src\\ch14_io_file\\sec04\\fileWrite.txt",ture);
		
		//출력할 내용
		String strOut ="\n내용 추가했음";
		byte[]bs=strOut.getBytes();
		
		//파일에 쓰기
		fos.write(bs);
		fos.close();
	}catch(Exception e){}
}
