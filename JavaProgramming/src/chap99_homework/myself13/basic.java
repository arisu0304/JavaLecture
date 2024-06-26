package chap99_homework.myself13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic {
	public static void main(String args[]) {
//		1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//		intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		
		intList.stream().map(num -> num * 3).forEach(num -> System.out.println(num));
		
		
//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 
//		출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		List<String> stringList = new ArrayList<String>();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i + "번째 문자열을 입력하세요.");
			stringList.add(sc.nextLine());
		}
		
		stringList.stream().filter(str -> str.length() >= 5).forEach(str -> System.out.println(str));
		
//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
//		문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		
		List<String> stringList2 = new ArrayList<String>();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i + "번째 문자열을 입력하세요.");
			stringList2.add(sc.nextLine());
		}
		
		stringList2.stream().filter(str -> {
			for(int i = 0; i < str.length() ; i++) {
				if(Character.isAlphabetic(str.charAt(i)))
					return true;
			}
			return false;
		}).forEach(str -> System.out.println(str));
		
		sc.close();
		
	}
}
