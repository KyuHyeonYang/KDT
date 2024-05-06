package ch14_io_file.sec04;

import java.io.FileInputStream;


public class FileInputStreamMain {

	public static void main(String[] args)  {
		//()안의 내용은 경로임
		try {
			FileInputStream fis=new FileInputStream("src\\ch14_io_file\\sec04\\FileInputStreamMain");
			
		//	while (true){
		//	 int data=fis.read();//1바이트씩 읽어옴
		//	 if(data==-1)break;//다 읽었으면 (-1반환)종료
		//	 System.out.println((char)data);
		//	}
			int data;
			while((data=fis.read()) != -1) {
				System.out.write(data);
			}//버퍼에 남아 있는 데이터 모두 출력하고 버퍼 비움
			System.out.flush();//flush()하지 않으니  마지막 행이 출력되지 않았음
			//flush():버퍼에 남아있는 데이터를 모두 출력시키고 버퍼를 비우는 역할
			fis.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
