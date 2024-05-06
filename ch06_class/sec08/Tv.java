package ch06_class.sec08;

public class Tv {
	String color;
	boolean power;
	int channel;

	 void power() {power=!power;}
	 void channelup() {++channel;}
	 void channelDown() {--channel;}
}
