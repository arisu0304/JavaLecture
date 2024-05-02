package chap11_abstraction;

import chap11_abstraction.tv.LgTv;
import chap11_abstraction.tv.SamsungTv;
import chap11_abstraction.tv.Tv;

public class _03_AbstractTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.operate(11);
		tv.channelDown();
		tv.channelUp();
		
		tv = new SamsungTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.operate(23);
		tv.channelDown();
		tv.channelUp();
		
	}

}
