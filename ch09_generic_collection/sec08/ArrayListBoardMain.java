package ch09_generic_collection.sec08;

import java.util.ArrayList;




public class ArrayListBoardMain {

	public static void main(String[] args) {
		
		Board b1=new Board("공지사항","스터디 그룹 모집","홍길동");
		Board b2=new Board("질문게시판", "자바", "이몽룡");
		
		ArrayList<Board>list=new ArrayList<Board>();
		
		list.add(b1);
		list.add(b2);
		list.add(new Board("중고거래방","책팝니다","성춘향"));
	
	for(Board board:list) {
		System.out.println("주제:"+board.getSubject()+"내용: "+board.getContent()+"작성자: "+board.getWriter());
	}
		
		}
}
