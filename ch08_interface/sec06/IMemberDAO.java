package ch08_interface.sec06;

import java.util.ArrayList;

public interface IMemberDAO {
	/*DAO (Data Access Object) : DB에 데이터를 저장하거나 DB에서 가져오는 기능을 수행하는 클래스
	- 추상 메소드 선언 (기능에 맞춰)
		- 회원 등록(가입)
		- 전체 회원 정보 조회
	   -   회원 정보 수정
	   -   회원 정보 삭제
	   -   회원 정보 검색 */
	// 입력한 회원 정보 전달 받아서 저장
	
	public void insertMember(MemberDTO dto);

	// 전체 회원 정보 반환
	// public ArrayList<MemberDTO> getAllMember();
	public ArrayList<MemberDTO> getAllMember();

//1명의 수정된 회원 정보 전달받아서 저장
	public void updateMember(MemberDTO dto);
	
	// 회원 아이디 전달 받아서 해당 회원 삭제
	public void deleteMember(String memId);

	//ID 전달 받아 ID에 해당되는 회원 정보 반환
	public MemberDTO searchMember(String memId);

}
