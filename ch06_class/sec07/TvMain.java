package ch06_class.sec07;

public class TvMain {
	public static void main (String args[]) {
	Tv t;
	t=new Tv();
	t.channel=7;
	
	t.channelDown();
	System.out.println("현재 채널 번호는 "+t.channel+"번 입니다.");
	
}
}