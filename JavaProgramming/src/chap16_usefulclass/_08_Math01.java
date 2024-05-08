package chap16_usefulclass;

public class _08_Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234.5678;
		
		// 1. ceil : 소숫점 첫째자리 에서 올림, duoble 타입 리턴
		System.out.println(Math.ceil(num));
		
		// 2. 소숫점 셋째짜리까지 올림
		System.out.println(Math.ceil(num * 1000)/ 1000);
		
		// 3. round : 소숫점 첫째짜리 에서 반올림, long 타입 리턴
		System.out.println(Math.round(num));
		
		// 4. 소숫점 둘째자리까지 반올림
		System.out.println((double)Math.round(num*100)/100);
		
		// 5. floor : 소숫점 첫째자리 에서 내림, double 타입 리턴
		System.out.println(Math.floor(num));
		
		// 6. 소숫점 첫쨰자리 까지 내림
		System.out.println(Math.floor(num*10)/10);
		
		
		
	}

}
