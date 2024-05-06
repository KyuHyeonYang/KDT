package ch08_interface.sec06;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
	System.out.println("회원 가입 성공");
	System.out.println("ID: "+dto.getMemId());
	System.out.println("PW: "+dto.getMemPass());
	System.out.println("성명: "+dto.getMemName());
	System.out.println("번호: "+dto.getMemHP());
	System.out.println("주소: "+dto.getMemAddress());
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO searchMember(String memId) {
		// TODO Auto-generated method stub
		return null;
	}

}
