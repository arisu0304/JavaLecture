package chap11_abstraction.tv;

public abstract class Tv {
	
	public int lastChannel;
	
	// 생성자는 추상화 불가
	public Tv() {
		lastChannel = 1;
	}
	
	public abstract void powerOn(); 
	
	public abstract void powerOff();
	
	public abstract void operate(int channel);
	
	public abstract void channelUp(); 
	
	public abstract void channelDown(); 
	
}
