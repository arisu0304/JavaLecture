package chap16_usefulclass;

public class _04_String04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit-naver-cloud";
		String str2 = "kiaCar";
		String str3 = "aBcDeF";
		
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean a = true;
		
		// 1. split : 매개변수로 주어진 문자열로 기존 문자열을 분리해서 문자열 배열로 리턴
		// {"bit", "naver", "cloud" }
		String[] strArr = str1.split("-");
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		
		// 2. substring : 주어진 인덱스로 잘려진 문자열을 리턴
		/// 매개변수가 하나일 때는 주어진 매개변수부터 마지막 인덱스의 문자까지 잘라진
		// 문자열 리턴
		System.out.println(str2.substring(4));
		
		// 매개변수가 2개일 때는 첫번째 매개변수부터 두번째 매개변수의 인덱스까지의 문자열을
		// 잘라서 리턴
		// 두번쨰 매개변수의 인덱스 문자는 포함되지 않는다.
		System.out.println(str2.substring(2, 4));
		
		// 3. toLowerCase : 영문자를 모두 소문자로 변환하여 리턴
		//    toUpperCase : 영문자를 모두 대문자롭 변환하여 리턴
		// 영문자가 아닌 경우에는 그냥 그대로 리턴 - 에러는 없음
		
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		// 4. trim : 문자열 앞뒤의 공백을 모두 제거하여 리턴하는 메소드
		// 공백의 크기 상관없이 모두제거
		// 중간에 포함되어있는 공백은 제거하지 못한다.
		
		String str4 = "              aa      bb     cc         ";
		System.out.println(str4.trim());
		
		
		// 5. static String valueOf : 다른 타입의 값을 String 타입으로 변경
		// valueOf는 static 메소드라 String.valueOf로 사용 
		System.out.println(String.valueOf(num1).getClass().getSimpleName());
		System.out.println(String.valueOf(a).getClass().getSimpleName());
		System.out.println(String.valueOf(num2).getClass().getSimpleName());
		
	}

}
