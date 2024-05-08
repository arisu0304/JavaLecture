package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 문자열 두개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다 출력
		
		String str1;
		String str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		str1 = sc.nextLine();
		System.out.println("문자열을 입력하세요.");
		str2 = sc.nextLine();
		
		if(str1.contains(str2)) {
			String space = "";
			for(int i = 0 ; i < str2.length() ; i++) {
				space += " ";
			}
			System.out.println(str1.replace(str2, space));
		}else {
			System.out.println("str1에서 str2를 찾을 수 없습니다.");
		}
		
		if(str1.indexOf(str2) != -1) {
			String space = "";
			for(int i = 0 ; i < str2.length() ; i++) {
				space += " ";
			}
			System.out.println(str1.replace(str2, space));
		}else {
			System.out.println("str1에서 str2를 찾을 수 없습니다.");
		}
		
		sc.close();
	}
}

