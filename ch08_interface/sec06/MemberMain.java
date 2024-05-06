package ch08_interface.sec06;

public class MemberMain {

	public static void main(String[] args) {
		//데이터저장:객체 생성하면서 초기화
		MemberDTO dto=new MemberDTO("abcd","1234", "홍길동", "010-1234-1234", "서울");
		//회원가입
		//MeMberDTO 클래스의 객체 생성해서 
		//MemberDAO클래스의 회원가입 메소드 insertMember()에게 값 전달
		MemberDAO dao= new MemberDAO();
		dao.insertMember(dto);
	}

}
