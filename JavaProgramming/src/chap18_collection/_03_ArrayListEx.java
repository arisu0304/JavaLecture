package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 사용자가 입력한 문자열을 StringBulider 객체에 저장하고
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : stringSave(sc)) {
			sb.append(str);
		}
		
		List<StringBuilder> sbList = new ArrayList<>();
		
		while(sb.length() >= 10) {
			StringBuilder subStr = new StringBuilder(sb.substring(0, 10));
			sbList.add(subStr);
			sb.delete(0, 10);
		}
		
		sbList.add(sb);
		
		for(StringBuilder stringBuilder : sbList) {
			System.out.println(stringBuilder);
		}

		sc.close();
	}
	
	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
	
	public static List<String> stringSave(Scanner sc){
		
		List<String> stringList = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("문자열을 입력하세요.");
			stringList.add(sc.nextLine());
		}
		
		return stringList;
	}
	
}
