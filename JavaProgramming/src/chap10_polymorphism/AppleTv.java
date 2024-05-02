package chap10_polymorphism;

import chap10_polymorphism.tv.Tv;

public class AppleTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("AppleTv");
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("AppleTv");
		super.powerOff();
	}
	
	// 부모 메소드가 default이므로 접근 불가 -> 에러
	// Tv와 AppleTv가 다른 패키지에 속해있기 때문에 
	// default 접근제어자로 선언된 operate메소드는 오버라이드 할 수 없다.
	/*
	 * @Override public void operate(int channel) {
	 * 
	 * }
	 */
	
	public void testTv() {
		super.powerOn();
		super.powerOff();
		
		// 접근제어자 문제로 에러
		/*
		 * super.operate(11); 
		 * super.channelUp();
		 */
	}
	
	
}
