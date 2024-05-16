package test;

public class Clone implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clone clone = new Clone();
		Object obj = new Object();
		
		try {
			obj = clone.clone();
		}catch(Exception e) {
			
		}
		
	}
}
