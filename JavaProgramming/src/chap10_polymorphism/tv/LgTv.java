package chap10_polymorphism.tv;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LgTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("QLED");
		// super 키워드로 생성자를 호출할 때는 항상 최상단에서 사용해야하지만
		// 인스턴스 메소드를 사용할 때 위치는 중요하지 않다.
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("QLED");
		super.powerOff();
	}
	
	
	// 부모 메소드의 접근제어자 default < 자식 public이므로 ok
	// 이는 자식 객체는 부모 객체의 모습도 가지고 있다는 걸 생각하면 당연함
	// 만약 private라면 에러
	@Override
	public void operate(int channel) {
		System.out.println("QLED");
		super.operate(channel);
	}
	
	// 부모 메소드의 접근자가 private이므로 오버라이드 불가
	/*
	 * @Override public void channelUp() {
	 * 
	 * }
	 */
	
	public void testTv() {
		// 부모클레스에 public으로 선언된 메소드
		super.powerOn();
		
		// 부모클래스에 protected로 선언된 메소드
		super.powerOff();
		
		// 부모클래스에 default로 선언된 메소드
		super.operate(11);
		
		// 부모클래스에 private로 선언된 메소드 -> 에러
		// super.channelUp();
	}
	
	
	
}
