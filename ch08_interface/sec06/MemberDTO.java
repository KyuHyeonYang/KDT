package ch08_interface.sec06;

public class MemberDTO {
/*memId, memPass, memName, memHP, memAddress
	매개변수 생성자
	Getter / Setter
	-       DTO (Data Transfer Object) : 데이터 전달 기능*/
	private String memId;
	private String memPass;
	private String memName;
	private String memHP;
	private String memAddress;
	
//매개변수 있는 생성자 :초기화
public MemberDTO(String memId, String memPass, String memName, String memHP, String memAddress) {
		super();
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memHP = memHP;
		this.memAddress = memAddress;
	}




//겟터 ,셋터
//멤버 필드 값 출력할 때 겟터 호출해서 값 받아서 출력 
public String getMemId() {
	return memId;
}


public void setMemId(String memId) {
	this.memId = memId;
}


public String getMemPass() {
	return memPass;
}


public void setMemPass(String memPass) {
	this.memPass = memPass;
}


public String getMemName() {
	return memName;
}


public void setMemName(String memName) {
	this.memName = memName;
}


public String getMemHP() {
	return memHP;
}


public void setMemHP(String memHP) {
	this.memHP = memHP;
}


public String getMemAddress() {
	return memAddress;
}


public void setMemAddress(String memAddress) {
	this.memAddress = memAddress;
}



		

	

}
