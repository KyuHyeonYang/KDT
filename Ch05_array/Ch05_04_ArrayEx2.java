package Ch05_array;

import java.util.Scanner;

public class Ch05_04_ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]name=new String[3];
		int size =name.length;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<size;i++) {
			System.out.print("이름을 입력하세요.: ");
			name[i]=sc.next();
		}
			for(int i=0;i<size;i++) {
				
				System.out.printf(name[i]);
			}
			
			
		}
		
	}


