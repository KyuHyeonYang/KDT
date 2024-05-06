package ch14_io_file.sec05;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FlieDataOutputStreamMain {

	public static void main(String[] args) throws Exception {
	//파일로 출력
		FileOutputStream fos=new FileOutputStream("c:/test/data.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.flush();
		dos.close();
		fos.close();
		
		//파일에서 읽어오기
	DataInputStream dis=new DataInputStream(new FileInputStream("c:/test/data.dat"));
	
	String name=dis.readUTF();
	double score=dis.readDouble();
	int no=dis.readInt();
	System.out.println(name+":"+score+":"+no);
	dis.close();
	}

}
