package chap16_usefulclass;

public class _02_String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String 객체 생성
		String str1 = "bitcamp";
		String str2 = new String("bitcamp");
		String str3 = new String(new char[] {'b', 'i', 't', 'c', 'a', 'm', 'p'});
		
		// 2. String은 불변성을 가지고 있어서 값을 변경했을 떄
		// 메모리에 저장된 문자열 값을 직접 변경하지 않고
		// 새로운 문자열을 메모리에 새로 저장한다.
		
		System.out.println(str1.hashCode());
		str1 = "naver";	
		System.out.println(str1.hashCode());
		str1 = "cloud";
		System.out.println(str1.hashCode());
		
		// 다시 naver로 써도 힙 영역의 string constant pool에 이미 저장되어있는
		// "naver"라는 문자열을 참조하므로 이전과 동일한 주소값
		str1 = "naver";	
		System.out.println(str1.hashCode());
		
		
		// 그러나 new string()은 힙 영역의 상수풀이 아닌 곳에 새롭게 문자열 할당하므로
		// 다른 주소값
		String strstr1 = new String("naver");
		System.out.println(str1 == strstr1);
		System.out.println(str1.equals(strstr1));
		
		String strstr2 = new String("naver");
		System.out.println(strstr1 == strstr2);
		System.out.println(strstr1.equals(strstr2));
		
		// 3. == 같은 주소에 있는 객체를 바라보고 있는지 확인
		if(str2 == str3) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		// 4. 같은 문자열인지를 비교할 때는 equals 메소드 사용
		// String의 equals 메소드는 Object의 equals 메소드를 오버라이드해서 새롭게 구현한 메소드
		if(str2.equals(str3)) {
			System.out.println("같은 문자열 입니다.");
		}else {
			System.out.println("다른 문자열 입니다.");
		}
		
		// equalsIgnorecase : 대소문자 구분없이 문자값 비교
		String str5 = "abcde";
		String str6 = "ABCDE";
		
		if(str5.equals(str6)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		// 5. compareTo : 문자열이 같은지 비교해주는 메소드
		// 같으면 0 , 다르면 1, -1 을 리턴
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		
		// 6. concat : 문자열을 합쳐서 새로운 문자열을 리턴하는 메소드
		String str4 = "cloud";
		str1 = "naver";
		
		String newStr = str1.concat(str4);
		System.out.println(newStr);
		
		
		
		
		
		
		
		
	}

}
